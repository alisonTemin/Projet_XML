function fillStaffTable() {
    //Appel ajax
    //http:localhost:2222/personnel/details
    fetch("http://localhost:2222/personnel/details").then(function (reponse) {
        return reponse.text();
    }).then(function (text) {
        var dp = new DOMParser();
        var xml = dp.parseFromString(text, "application/xml").documentElement;
        var staffList = xml.querySelectorAll("projects project team person");
        console.log(xml.querySelectorAll("projects project"));
        console.log(staffList);
        var pTable = document.querySelector("#pTable tbody");
        var i = 0;
        if (pTable.firstChild.className == "no-records-found") {
            var trFirst = pTable.firstChild;
            trFirst.classList.remove("no-records-found");
            trFirst.removeChild(trFirst.firstChild);
            for (var j = 0; j < staffList[i].children.length; j++) {
                var td = document.createElement('td');
                td.innerHTML = staffList[i].children[j].innerHTML;
                trFirst.appendChild(td);
            }
            i = 1;
        }
        for (i; i < staffList.length; i++) {
            var tr = document.createElement('tr');
            for (var j = 0; j < staffList[i].children.length; j++) {
                var td = document.createElement('td');
                td.innerHTML = staffList[i].children[j].innerHTML;
                tr.appendChild(td);
            }
            pTable.appendChild(tr);
        }
    });
}

function sortTable(n) {
    var rows, i, x, y, shouldSwitch, switchcount = 0;
    var crTable = document.getElementById("pTable");
    var switching = true;
    //Set the sorting direction to ascending:
    var dir = "asc";
    /*Make a loop that will continue until
    no switching has been done:*/
    while (switching) {
        //start by saying: no switching is done:
        switching = false;
        rows = crTable.getElementsByTagName("TR");
        /*Loop through all table rows (except the
        first, which contains table headers):*/
        for (i = 1; i < (rows.length - 1); i++) {
            //start by saying there should be no switching:
            shouldSwitch = false;
            /*Get the two elements you want to compare,
            one from current row and one from the next:*/
            x = rows[i].getElementsByTagName("TD")[n];
            y = rows[i + 1].getElementsByTagName("TD")[n];
            /*check if the two rows should switch place,
            based on the direction, asc or desc:*/
            if (dir == "asc") {
                if (x.innerHTML.toLowerCase() > y.innerHTML.toLowerCase()) {
                    //if so, mark as a switch and break the loop:
                    shouldSwitch = true;
                    break;
                }
            } else if (dir == "desc") {
                if (x.innerHTML.toLowerCase() < y.innerHTML.toLowerCase()) {
                    //if so, mark as a switch and break the loop:
                    shouldSwitch = true;
                    break;
                }
            }
        }
        if (shouldSwitch) {
            /*If a switch has been marked, make the switch
            and mark that a switch has been done:*/
            rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);
            switching = true;
            //Each time a switch is done, increase this count by 1:
            switchcount++;
        } else {
            /*If no switching has been done AND the direction is "asc",
            set the direction to "desc" and run the while loop again.*/
            if (switchcount == 0 && dir == "asc") {
                dir = "desc";
                switching = true;
            }
        }
    }
}