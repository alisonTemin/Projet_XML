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
  //alert(Object.keys(options));
  //alert(Object.values(options));

  var researchCentersMap = new google.maps.Map(document.getElementById("researchCentersMap"), options);

  var marqueur = new google.maps.Marker({
    position: new google.maps.LatLng(43.696, 7.289429),
    map: researchCentersMap,
    title: "Nice"
  });
  var marqueur1 = new google.maps.Marker({
    position: new google.maps.LatLng(48.854733, 2.350879),
    map: researchCentersMap,
    title: "Paris"
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
/*
var map = new google.maps.Map(document.getElementById('researchCentersMap'), {
zoom: 2,
center: new google.maps.LatLng(2.8,-187.3)
});
// Create a <script> tag and set the USGS URL as the source.
var script = document.createElement('script');
// This example uses a local copy of the GeoJSON stored at http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/2.5_week.geojsonp
script.src = 'https://developers.google.com/maps/documentation/javascript/examples/json/earthquake_GeoJSONP.js';
document.getElementsByTagName('head')[0].appendChild(script);
}

// Loop through the results array and place a marker for each
// set of coordinates.
window.eqfeed_callback = function(results) {
for (var i = 0; i < results.features.length; i++) {
var coords = results.features[i].geometry.coordinates;
var latLng = new google.maps.LatLng(coords[1],coords[0]);
var marker = new google.maps.Marker({
position: latLng,
map: map
});
}
}*/
