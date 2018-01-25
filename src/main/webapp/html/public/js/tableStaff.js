function fillStaffTable() {
    //Appel ajax
    //http:localhost:2222/personnel/details
    fetch("http://localhost:2222/personnel/details").then(function (reponse) {
        return reponse.text();
    }).then(function (text) {
        var dp = new DOMParser();
        var xml = dp.parseFromString(text, "application/xml").documentElement;
        var staffList = xml.querySelectorAll("teams team person");
        var pTable = document.querySelector("#pTable tbody");
        var i = 0;
        if (pTable.firstChild.className == "no-records-found") {
            var trFirst = pTable.firstChild;
            trFirst.classList.remove("no-records-found");
            trFirst.removeChild(trFirst.firstChild);
            for (var j = 0; j < staffList[i].children.length; j++) {
                if (j == staffList[i].children.length - 2) {
                    var td = document.createElement('td');
                    if (staffList[i].children[j].children.length > 1) {
                        var ul = document.createElement('ul');
                        for (var k = 0; k < staffList[i].children[j].children.length; k++) {
                            var li = document.createElement('li');
                            li.innerHTML = staffList[i].children[j].children[k].innerHTML;
                            ul.appendChild(li);
                        }
                        td.appendChild(ul);
                    } else {
                        td.innerHTML = staffList[i].children[j].innerHTML;
                    }
                    trFirst.appendChild(td);
                } else {
                    var td = document.createElement('td');
                    td.innerHTML = staffList[i].children[j].innerHTML;
                    trFirst.appendChild(td);
                }
            }
            i = 1;
        }
        for (i; i < staffList.length; i++) {
            var tr = document.createElement('tr');
            for (var j = 0; j < staffList[i].children.length; j++) {
                if (j == staffList[i].children.length - 2) {
                    var td = document.createElement('td');
                    if (staffList[i].children[j].children.length > 1) {
                        var ul = document.createElement('ul');
                        for (var k = 0; k < staffList[i].children[j].children.length; k++) {
                            var li = document.createElement('li');
                            li.innerHTML = staffList[i].children[j].children[k].innerHTML;
                            ul.appendChild(li);
                        }
                        td.appendChild(ul);
                    } else {
                        td.innerHTML = staffList[i].children[j].innerHTML;
                    }
                    tr.appendChild(td);
                } else {
                    var td = document.createElement('td');
                    td.innerHTML = staffList[i].children[j].innerHTML;
                    tr.appendChild(td);
                }
            }
            pTable.appendChild(tr);
        }
    });
}