xquery version "3.1";

declare namespace mi = "http://localhost:8080/exist/rest/db";

declare function mi:toto() as node() {
	let $x := (doc("/db/raweb/alice.xml")/raweb/identification/projectName)
	return $x
};

declare function mi:appelerFonction() as node()* {
    let $x := request:get-parameter('fn','mi:toto()')
    return util:eval($x)
};

(: Cette fonction renvoie le nombre d'équipe et le nombre de personnels par centre de recherche :)
declare function mi:recupererNbPersonnesCentreDeRecherche()as node()*{
    <centres> {
        let $arraycentres := (for $centre in distinct-values(/raweb/identification/UR/@name) order by $centre return $centre)
        for $i in 1 to count(for $centre in distinct-values(/raweb/identification/UR/@name) order by $centre return <centre>{$centre}</centre>)
            return <centre>
             {<centreName>{string($arraycentres[$i])}</centreName>}
                {<teamsNumber>{count(/raweb/team[person/research-centre = $arraycentres[$i]])}</teamsNumber>}
                {<personsNumber>{count(/raweb/team/person[research-centre = $arraycentres[$i]])}</personsNumber>}
                </centre>
    }
    </centres>
};

(: Cette fonction renvoie le nom des centres, le nom du projet, le nom du thème, le nombre de personnes et l'URL pour chacune des équipes :)
declare function mi:recupererDetailsEquipe()as node()*{
    <projects>
    {
        for $project in /raweb
        return
            <project>
                <centre>{ $project/identification/UR/@name/string()}</centre>
                <projectName>{ concat(string($project/identification/shortname), " - ", string( $project/identification/projectName ))}</projectName>
                <theme>{ string( $project/identification/theme-de-recherche ) }</theme>
                <urlTeam>{ string( $project/identification/urlTeam ) }</urlTeam>
                <personsNumber>{ count( $project/team/person ) }</personsNumber>
            </project>
    }
    </projects>
};

(: Cette fonction renvoie le nom, le prénom, la catégorie profesionnelle, les publications et le nombre de ses publications de chaque membre du personnel d'équipe :)
declare function mi:recupererDetailsPersonnel()as node()*{
    <teams> {
        let $arrayprojects := (for $project in /raweb/identification
        order by $project return $project)
        for $i in 1 to count(for $project in /raweb/identification
        order by $project
        return <project>{$project}</project>)
            return <team>{for $person in $arrayprojects[$i]/../team/person
                return <person>
                    {<shortname>{string($arrayprojects[$i]/shortname)}</shortname>}
                    {<theme>{string($arrayprojects[$i]/theme-de-recherche)}</theme>}
                    {<firstname>{string($person/firstname)}</firstname>}
                    {<lastname>{string($person/lastname)}</lastname>}
                    {<categoryPro>{string($person/categoryPro)}</categoryPro>}
                    {<publications>{
                        if($arrayprojects[$i]/../resultats/subsection/subsection/participants/person/lastname = $person/lastname)
                            then
                                if($arrayprojects[$i]/../resultats/subsection/subsection/participants/person/firstname =
                                $person/firstname) then
                                    for $rapport in $arrayprojects[$i]/../resultats/subsection/subsection
                                    where $rapport/participants/person/lastname = $person/lastname
                                    and $rapport/participants/person/firstname = $person/firstname
                                    return <publication>{string($rapport/bodyTitle)}</publication>
                                else()
                            else ()
                    }</publications>}
                    {<publicationsNumber>{
                        if($arrayprojects[$i]/../resultats/subsection/subsection/participants/person/lastname = $person/lastname)
                            then
                                if($arrayprojects[$i]/../resultats/subsection/subsection/participants/person/firstname =
                                $person/firstname) then
                                    count(for $rapport in $arrayprojects[$i]/../resultats/subsection/subsection
                                    where $rapport/participants/person/lastname = $person/lastname
                                    and $rapport/participants/person/firstname = $person/firstname
                                    return $rapport/bodyTitle)
                                else()
                            else ()
                    }</publicationsNumber>}
                    </person>
                }</team>

        }
    </teams>
};

(: Cette fonction renvoie la répartition des thèmes par centre de recherche :)
declare function mi:recupererRepartitionThemesParCentre()as node()*{
    <centres> {
    let $arraycentres := (for $centre in distinct-values(/raweb/identification/UR/@name)
    order by $centre return $centre)
    for $i in 1 to count(for $centre in distinct-values(/raweb/identification/UR/@name)
    order by $centre return <centre>{$centre}</centre>)
        return <themes>{
                for $theme in distinct-values(/raweb/identification/theme-de-recherche[../UR/@name = $arraycentres[$i]])
                order by $theme
                return <theme>
                        <centreName>{string($arraycentres[$i])}</centreName>
                        <name>{string($theme)}</name>
                        <number>{count(/raweb/identification[theme-de-recherche = $theme and UR/@name = $arraycentres[$i]])}</number>
                    </theme>
            }</themes>
    }
    </centres>
};

(: Cette fonction renvoie la répartition des catégories professionnelles par centre de recherche :)
declare function mi:recupererRepartitionCategoriesParCentre()as node()*{
    <centres> {
    let $arraycentres := (for $centre in distinct-values(/raweb/identification/UR/@name)
    order by $centre return $centre)
    for $i in 1 to count(for $centre in distinct-values(/raweb/identification/UR/@name)
    order by $centre
    return <centre>{$centre}</centre>)
        return <categoriesPro>{
                for $category in distinct-values(/raweb/team/person/categoryPro)
                order by $category
                return <categoryPro>
                        <centreName>{string($arraycentres[$i])}</centreName>
                        <name>{string($category)}</name>
                        <number>{count(/raweb/team/person[categoryPro = $category and ../../identification/UR/@name = $arraycentres[$i]])}</number>
                     </categoryPro>
            }</categoriesPro>
    }
    </centres>
};

(: Cette fonction renvoie la répartition des projets par thème de recherche :)
declare function mi:recupererRepartitionProjetsParTheme()as node()*{
    <themes> {
    let $arraythemes := (for $theme in distinct-values(/raweb/identification/theme-de-recherche)
    order by $theme return $theme)
    for $i in 1 to count(for $theme in distinct-values(/raweb/identification/theme-de-recherche)
    order by $theme return <theme>{$theme}</theme>)
        return <projects>{
                for $project in /raweb/identification/shortname
                where $project/../theme-de-recherche = $arraythemes[$i]
                return <project>
                    <themeName>{string($arraythemes[$i])}</themeName>
                    <name>{string($project)}</name>
                 </project>
            }</projects>
    }
    </themes>
};

mi:appelerFonction()