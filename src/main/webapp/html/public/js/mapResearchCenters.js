function initMapCenters() {
  var centreLat = 46.5;
  var centreLng = 5;
  var latlng = new google.maps.LatLng(centreLat, centreLng); // new google.maps.LatLng(2.8,-187.3),
  var zoomMap = 5;
  var options = {
    zoom: zoomMap,
    center: latlng,
    mapTypeId: google.maps.MapTypeId.ROADMAP
  };

  var researchCentersMap = new google.maps.Map(document.getElementById("researchCentersMap"), options);
  var marqueurBordeaux = new google.maps.Marker({
    position: new google.maps.LatLng(44.8115143, -0.6002006999999594),
    map: researchCentersMap,
    title: "Bordeaux"
  });
  var marqueurGrenoble = new google.maps.Marker({
    position: new google.maps.LatLng(45.217886, 5.807368999999994),
    map: researchCentersMap,
    title: "Grenoble"
  });
  var marqueurLille = new google.maps.Marker({
    position: new google.maps.LatLng(50.6053272, 3.1483005999999705),
    map: researchCentersMap,
    title: "Lille"
  });
  var marqueurNancy = new google.maps.Marker({
    position: new google.maps.LatLng(48.6640104, 6.155632999999966),
    map: researchCentersMap,
    title: "Nancy"
  });
  var marqueurParis = new google.maps.Marker({
    position: new google.maps.LatLng(48.8414997, 2.384722799999963),
    map: researchCentersMap,
    title: "Paris"
  });
  var marqueurRennes = new google.maps.Marker({
    position: new google.maps.LatLng(48.1157339, -1.6371321999999964),
    map: researchCentersMap,
    title: "Rennes"
  });
  var marqueurSophia = new google.maps.Marker({
    position: new google.maps.LatLng(43.6158131, 7.068379999999934),
    map: researchCentersMap,
    title: "Sophia"
  });
  var marqueurSaclay = new google.maps.Marker({
    position: new google.maps.LatLng(48.714509, 2.2457481000000143),
    map: researchCentersMap,
    title: "Saclay"
  });

  google.maps.event.addListener(marqueurBordeaux,'click',function() {
    var infowindow = new google.maps.InfoWindow({
      content:"CRI Bordeaux<br>200 Avenue de la Vieille Tour<br>33400 Talence"
    });
    infowindow.open(researchCentersMap,marqueurBordeaux);
  });
  google.maps.event.addListener(marqueurGrenoble,'click',function() {
    var infowindow = new google.maps.InfoWindow({
      content:"CRI Grenoble<br>655 Avenue de l'Europe<br>38330 Montbonnot-Saint-Martin"
    });
    infowindow.open(researchCentersMap,marqueurGrenoble);
  });
  google.maps.event.addListener(marqueurLille,'click',function() {
    var infowindow = new google.maps.InfoWindow({
      content:"CRI Lille<br>Parc Scientifique de la Haute Borne<br>40 avenue Halley Bât.A<br>Park Plaza"+
      "<br>59650 Villeneuve d'Ascq"
    });
    infowindow.open(researchCentersMap,marqueurLille);
  });
  google.maps.event.addListener(marqueurNancy,'click',function() {
    var infowindow = new google.maps.InfoWindow({
      content:"CRI Nancy<br>615 Rue du Jardin Botanique<br>54600 Villers-lès-Nancy"
    });
    infowindow.open(researchCentersMap,marqueurNancy);
  });
  google.maps.event.addListener(marqueurParis,'click',function() {
    var infowindow = new google.maps.InfoWindow({
      content:"CRI Paris<br>2 rue Simone Iff<br>75012 Paris"
    });
    infowindow.open(researchCentersMap,marqueurParis);
  });
  google.maps.event.addListener(marqueurRennes,'click',function() {
    var infowindow = new google.maps.InfoWindow({
      content:"CRI Rennes<br>Campus de Beaulieu<br>263 avenue du Général Leclerc"+
      "<br>35042 Rennes"
    });
    infowindow.open(researchCentersMap,marqueurRennes);
  });
  google.maps.event.addListener(marqueurSophia,'click',function() {
    var infowindow = new google.maps.InfoWindow({
      content:"CRI Sophia Antipolis<br>2004 route des Lucioles<br>06902 Sophia Antipolis"
    });
    infowindow.open(researchCentersMap,marqueurSophia);
  });
  google.maps.event.addListener(marqueurSaclay,'click',function() {
    var infowindow = new google.maps.InfoWindow({
      content:"CRI Saclay<br>Bâtiment Alan Turing<br>1 rue Honoré d'Estienne d'Orves<br>Campus de l'École Polytechnique"+
      "<br>91120 Palaiseau"
    });
    infowindow.open(researchCentersMap,marqueurSaclay);
  });
}
/*
var Cris;
$( document ).ready(function() {

var requestURL = 'bastriCris.json';
var request = new XMLHttpRequest();
request.open('GET', requestURL);
request.responseType = 'json';
request.send();
request.onload = function() {
Cris = request.response;
Cris.forEach(function(cr) {
var lib = cr['libelle'];
var lat = cr['adressegeographique']['latitude'];
var long = cr['adressegeographique']['longitude'];
var dateOuv = cr['date_ouverture'];
var adr = cr['adressegeographique']['libelle']+" "+ cr['adressegeographique']['adresse']+" "+cr['adressegeographique']['cp']+" "+cr['adressegeographique']['ville'];
var dcr = cr['responsable'][0]['personne']['nom']+" "+ cr['responsable'][0]['personne']['prenom'];
var ds = cr['responsable'][1]['personne']['nom']+" "+ cr['responsable'][1]['personne']['prenom'];
var da = cr['responsable'][2]['personne']['nom']+" "+ cr['responsable'][2]['personne']['prenom'];
var vpcp = cr['responsable'][3]['personne']['nom']+" "+ cr['responsable'][3]['personne']['prenom'];
ajouterContenuTabCR(lib,lat,long);
ajouterContenuCR(lib,dateOuv,adr, dcr,ds,da,vpcp);
});
}
});
*/
