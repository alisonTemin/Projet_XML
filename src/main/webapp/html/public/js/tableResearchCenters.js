function remplirTableCentreDeRecherche(){
  //Appel ajax
  //http:localhost:2222/rest/centrederecherche/details
  fetch("http://localhost:2222/rest/centrederecherche/details").then(function (reponse) {
    return reponse.text();
  }).then(function(text){
    console.log(text);
    var dp = new DOMParser();
    var xml = dp.parseFromString(text, "application/xml").documentElement;
    console.log(xml);
    var crList = xml.querySelectorAll("crs cr");
    console.log(crList);
    var crTable = document.querySelector("#crTable tbody");
    var crDonnees = [];
    for (var i = 0; i < crList.length; i++ ) {
      /*crTable.innerHTML+='<tr><td scope = "row">'+crList[i].getAttribute('siid')+'</td>'
      +'<td>'+crList[i].querySelector('libelle').innerHTML+'</td>'
      +'<td>'+crList[i].querySelector('ville').innerHTML+'</td>'
      +'<td>'+crList[i].querySelector('date_ouverture').innerHTML+'</td>'
      +'<td>'+crList[i].querySelector('date_fermeture').innerHTML+'</td>'
      + '<td></td><td></td>'
      + '</tr>'  ;*/
      crDonnees.push([crList[i].getAttribute('siid'),crList[i].querySelector('libelle').innerHTML,crList[i].querySelector('ville').innerHTML,crList[i].querySelector('date_ouverture').innerHTML,crList[i].querySelector('date_fermeture').innerHTML,'','']);
    }

    $('#crTable').DataTable({data: crDonnees});
    // var dtable = new webix.ui({container: 'crFakeTable',view: 'datatable',data: crList});
    //Variable qui recupere l'ID crTable
    // var firstCol = document.querySelectorAll("#crTable tr th:first-child");
  });
}
