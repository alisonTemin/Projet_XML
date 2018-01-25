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

    var teamsMap = new google.maps.Map(document.getElementById("teamsMap"), options);

    var marqueurBordeaux = new google.maps.Marker({
        position: new google.maps.LatLng(44.8115143, -0.6002006999999594),
        map: teamsMap,
        title: "Bordeaux"
    });
    var marqueurGrenoble = new google.maps.Marker({
        position: new google.maps.LatLng(45.217886, 5.807368999999994),
        map: teamsMap,
        title: "Grenoble"
    });
    var marqueurLille = new google.maps.Marker({
        position: new google.maps.LatLng(50.6053272, 3.1483005999999705),
        map: teamsMap,
        title: "Lille"
    });
    var marqueurNancy = new google.maps.Marker({
        position: new google.maps.LatLng(48.6640104, 6.155632999999966),
        map: teamsMap,
        title: "Nancy"
    });
    var marqueurParis = new google.maps.Marker({
        position: new google.maps.LatLng(48.8414997, 2.384722799999963),
        map: teamsMap,
        title: "Paris"
    });
    var marqueurRennes = new google.maps.Marker({
        position: new google.maps.LatLng(48.1157339, -1.6371321999999964),
        map: teamsMap,
        title: "Rennes"
    });
    var marqueurSophia = new google.maps.Marker({
        position: new google.maps.LatLng(43.6158131, 7.068379999999934),
        map: teamsMap,
        title: "Sophia"
    });
    var marqueurSaclay = new google.maps.Marker({
        position: new google.maps.LatLng(48.714509, 2.2457481000000143),
        map: teamsMap,
        title: "Saclay"
    });

    //Appel ajax
    //http:localhost:2222/equipe/details
    fetch("http://localhost:2222/equipe/details").then(function (reponse) {
        return reponse.text();
    }).then(function (text) {
        var dp = new DOMParser();
        var xml = dp.parseFromString(text, "application/xml").documentElement;
        var teamList = xml.querySelectorAll("projects project");

        var countBordeaux = 0;
        var countGrenoble = 0;
        var countLille = 0;
        var countNancy = 0;
        var countParis = 0;
        var countRennes = 0;
        var countSophia = 0;
        var countSaclay = 0;

        for (var i = 0; i < teamList.length; i++) {
            if (teamList[i].children[0].innerHTML.includes("Bordeaux")) {
                countBordeaux += 1;
            }
            if (teamList[i].children[0].innerHTML.includes("Grenoble")) {
                countGrenoble += 1;
            }
            if (teamList[i].children[0].innerHTML.includes("Lille")) {
                countLille += 1;
            }
            if (teamList[i].children[0].innerHTML.includes("Nancy")) {
                countNancy += 1;
            }
            if (teamList[i].children[0].innerHTML.includes("Paris")) {
                countParis += 1;
            }
            if (teamList[i].children[0].innerHTML.includes("Rennes")) {
                countRennes += 1;
            }
            if (teamList[i].children[0].innerHTML.includes("Sophia")) {
                countSophia += 1;
            }
            if (teamList[i].children[0].innerHTML.includes("Saclay")) {
                countSaclay += 1;
            }
        }

        google.maps.event.addListener(marqueurBordeaux, 'click', function () {
            var infowindow = new google.maps.InfoWindow({
                content: "CRI Bordeaux<br>Nombre d'équipes : " + countBordeaux
            });
            infowindow.open(teamsMap, marqueurBordeaux);
        });
        google.maps.event.addListener(marqueurGrenoble, 'click', function () {
            var infowindow = new google.maps.InfoWindow({
                content: "CRI Grenoble<br>Nombre d'équipes : " + countGrenoble
            });
            infowindow.open(teamsMap, marqueurGrenoble);
        });
        google.maps.event.addListener(marqueurLille, 'click', function () {
            var infowindow = new google.maps.InfoWindow({
                content: "CRI Lille<br>Nombre d'équipes : " + countLille
            });
            infowindow.open(teamsMap, marqueurLille);
        });
        google.maps.event.addListener(marqueurNancy, 'click', function () {
            var infowindow = new google.maps.InfoWindow({
                content: "CRI Nancy<br>Nombre d'équipes : " + countNancy
            });
            infowindow.open(teamsMap, marqueurNancy);
        });
        google.maps.event.addListener(marqueurParis, 'click', function () {
            var infowindow = new google.maps.InfoWindow({
                content: "CRI Paris<br>Nombre d'équipes : " + countParis
            });
            infowindow.open(teamsMap, marqueurParis);
        });
        google.maps.event.addListener(marqueurRennes, 'click', function () {
            var infowindow = new google.maps.InfoWindow({
                content: "CRI Rennes<br>Nombre d'équipes : " + countRennes
            });
            infowindow.open(teamsMap, marqueurRennes);
        });
        google.maps.event.addListener(marqueurSophia, 'click', function () {
            var infowindow = new google.maps.InfoWindow({
                content: "CRI Sophia Antipolis<br>Nombre d'équipes : " + countSophia
            });
            infowindow.open(teamsMap, marqueurSophia);
        });
        google.maps.event.addListener(marqueurSaclay, 'click', function () {
            var infowindow = new google.maps.InfoWindow({
                content: "CRI Saclay<br>Nombre d'équipes : " + countSaclay
            });
            infowindow.open(teamsMap, marqueurSaclay);
        });
    });
}
