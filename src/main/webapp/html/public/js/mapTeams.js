function initMapTeams() {
  var centreLat = 46.8;
  var centreLng = 5;
  var latlng = new google.maps.LatLng(centreLat, centreLng);
  var zoomMap = 6;
  var options = {
    zoom: zoomMap,
    center: latlng,
    mapTypeId: google.maps.MapTypeId.ROADMAP
  };
  //alert(Object.keys(options));
  //alert(Object.values(options));

  var teamsMap = new google.maps.Map(document.getElementById("teamsMap"), options);

  var marqueur = new google.maps.Marker({
    position: new google.maps.LatLng(43.696, 7.289429),
    map: teamsMap,
    title: "Nice"
  });
  var marqueur1 = new google.maps.Marker({
    position: new google.maps.LatLng(48.854733, 2.350879),
    map: teamsMap,
    title: "Paris"
  });
}
