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


(: Cette fonction renvoie tous les libellés, les villes et les dates d'ouverture des centres :)
declare function mi:recupererDetailsCentreDeRecherche()as node()*{
   let $res := for $cr in doc("http://localhost:63342/inriaprojxml/src/main/webapp/bastriCris.xml")/crs/cr
        order by $cr/adressegeographique/libelle
        return <cr>
            {$cr/libelle}
            {$cr/adressegeographique/ville}
            {$cr/date_ouverture}
        </cr>
    return <crs>{$res}</crs>
};

(: Cette fonction renvoie le nombre d'équipe et le nombre de personnels par centre de recherche :)
declare function mi:recupererNbPersonnesCentreDeRecherche()as node()*{
    <centres> {
        let $arraycentres := (for $centre in distinct-values(/raweb/identification/UR/@name) order by $centre return $centre)
        for $i in 1 to count(for $centre in distinct-values(/raweb/identification/UR/@name) order by $centre return <centre>{$centre}</centre>)
            return <centre>
             {<centreName>{string($arraycentres[$i])}</centreName>}
                {<teamsNumber>{count(/raweb/team[person/research-centre =                     $arraycentres[$i]])}</teamsNumber>}
                {<personsNumber>{count(/raweb/team/person[research-centre =                   $arraycentres[$i]])}</personsNumber>}
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

(: Cette fonction renvoie le nom, le prénom et la catégorie profesionnelle de chaque membre du personnel d'équipe :)
declare function mi:recupererDetailsPersonnel()as node()*{
    <projects> {
    let $arrayprojects := (for $project in /raweb/identification
    order by $project return $project)
    for $i in 1 to count(for $project in /raweb/identification
    order by $project
    return <project>{$project}</project>)
        return <project>
            {<shortname>{string($arrayprojects[$i]/shortname)}</shortname>}
            {<theme>{string($arrayprojects[$i]/theme-de-recherche)}</theme>}
            {<team>{for $personne in $arrayprojects[$i]/../team/person
            return <person>
                {<firstname>{string($personne/firstname)}</firstname>}
                {<lastname>{string($personne/lastname)}</lastname>}
                {<categoryPro>{string($personne/categoryPro)}</categoryPro>}
                </person>
            }</team>
            }</project>
        }
    </projects>
};

(: Cette fonction renvoie le nom des rapports auxquels les personnels d'équipe ont participé :)
declare function mi:recupererDetailsRapportsPersonnel()as node()*{
    <persons> {
    let $arrayLastnamePersons:= (for $person in distinct-values(/raweb/resultats/subsection/subsection/participants/person/lastname) order by $person return $person)
    let $arrayFirstnamePersons:= (for $person in distinct-values(/raweb/resultats/subsection/subsection/participants/person/firstname) order by $person return $person)
    for $i in 1 to count(for $person in distinct-values(/raweb/resultats/subsection/subsection/participants/person/lastname)
                            order by $person
                            return <person>{$arrayLastnamePersons}</person>)
        return <person>
            {<firstname>{$arrayFirstnamePersons[$i]}</firstname>}
            {<lastname>{$arrayLastnamePersons[$i]}</lastname>}
            {<publications>{
                for $rapport in /raweb/resultats/subsection
                where $rapport/subsection/participants/person/lastname = $arrayLastnamePersons[$i]
                return <publication>{string($rapport/bodyTitle)}</publication>
            }</publications>}
            </person>
    } </persons>
};

(: Cette fonction renvoie le nombre de publications des personnels d'équipe :)
declare function mi:recupererNbRapportsPersonnel()as node()*{
    <persons> {
    let $arrayLastnamePersons := (for $person in distinct-values(/raweb/resultats/subsection/subsection/participants/person/lastname) order by $person return $person)
    let $arrayFirstnamePersons:= (for $person in distinct-values(/raweb/resultats/subsection/subsection/participants/person/firstname) order by $person return $person)
    for $i in 1 to count(for $person in distinct-values(/raweb/resultats/subsection/subsection/participants/person/lastname)
        order by $person
        return <person>{$arrayLastnamePersons}</person>)
            return <person>
                {<firstname>{$arrayFirstnamePersons[$i]}</firstname>}
                {<lastname>{$arrayLastnamePersons[$i]}</lastname>}
                {<publicationsNumber>{
                    count(for $rapport in /raweb/resultats/subsection
                    where $rapport/subsection/participants/person/lastname = $arrayLastnamePersons[$i]
                    return $rapport/bodyTitle)
                }</publicationsNumber>}
            </person>
    } </persons>
};

(: Cette fonction renvoie la répartition des thèmes par centre de recherche :)
declare function mi:recupererRepartitionThemesParCentre()as node()*{
    <centres> {
    let $arraycentres := (for $centre in distinct-values(/raweb/identification/UR/@name)
                                            order by $centre
                                            return $centre)
    for $i in 1 to count(for $centre in distinct-values(/raweb/identification/UR/@name)
    order by $centre
    return <centre>{$centre}</centre>)
        return <centre>
            {<centreName>{string($arraycentres[$i])}</centreName>}
            {<themes>{
                for $theme in distinct-values(/raweb/identification/theme-de-recherche[../UR/@name = $arraycentres[$i]])
                order by $theme
                return <theme>
                        <name>{string($theme)}</name>
                        <number>{count(/raweb/identification[theme-de-recherche = $theme and UR/@name = $arraycentres[$i]])}</number>
                    </theme>
            }</themes>}
        </centre>
    }
    </centres>
};

(: Cette fonction renvoie la répartition des catégories professionnelles par centre de recherche :)
declare function mi:recupererRepartitionCategoriesParCentre()as node()*{
    <centres> {
    let $arraycentres := (for $centre in distinct-values(/raweb/identification/UR/@name)
                                            order by $centre
                                            return $centre)
    for $i in 1 to count(for $centre in distinct-values(/raweb/identification/UR/@name)
    order by $centre
    return <centre>{$centre}</centre>)
        return <centre>
            {<centreName>{string($arraycentres[$i])}</centreName>}
            {<categoriesPro>{
                for $category in distinct-values(/raweb/team/person/categoryPro)
                order by $category
                return <categoryPro>
                        <name>{string($category)}</name>
                        <number>{count(/raweb/team/person[categoryPro = $category and ../../identification/UR/@name = $arraycentres[$i]])}</number>
                     </categoryPro>
            }</categoriesPro>}
        </centre>
    }
    </centres>
};

(: Cette fonction renvoie la répartition des projets par thème de recherche :)
declare function mi:recupererRepartitionProjetsParTheme()as node()*{
    <themes> {
    let $arraythemes := (for $theme in distinct-values(/raweb/identification/theme-de-recherche)
    order by $theme return $theme)
    for $i in 1 to count(for $theme in distinct-values(/raweb/identification/theme-de-recherche)
    order by $theme
    return <theme>{$theme}</theme>)
        return <theme>
            {<themeName>{string($arraythemes[$i])}</themeName>}
            {<projects>{
                for $project in /raweb/identification/shortname
                where $project/../theme-de-recherche = $arraythemes[$i]
                return <project>{string($project)}</project>
            }</projects>}
        </theme>
    }
    </themes>
};

mi:appelerFonction()