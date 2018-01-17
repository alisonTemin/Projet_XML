// https://hackernoon.com/a-simple-pie-chart-in-svg-dbdd653b6936
// https://www.smashingmagazine.com/2015/07/designing-simple-pie-charts-with-css/

// https://developers.google.com/chart/interactive/docs/gallery/piechart

// Function for themes graph (pie chart)
$(function () {
  var buttons = document.querySelector('#themesButtons'),
  activeClass = 'active',
  centerNumber = 0;

  var listeCentres = {
    0: {
      centre: "Bordeaux",
      themes: [
        ['Mushrooms', 3],
        ['Onions', 1],
        ['Olives', 1],
        ['Zucchini', 1],
        ['Pepperoni', 2],
        ['Pepperoni', 2],
        ['Pepperoni', 2],
        ['Pepapig', 2]
      ]
    },
    1: {
      centre: "Grenoble",
      themes: [
        ['Mushrooms', 3],
        ['Onions', 1],
        ['Olives', 1],
        ['Zucchini', 1],
        ['Pepperoni', 2],
        ['Pepperoni', 2],
        ['Pepperoni', 2],
        ['Pepapa', 2]
      ]
    },
    2: {
      centre: "Lille",
      themes: [
        ['Mushrooms', 3],
        ['Onions', 1],
        ['Olives', 1],
        ['Zucchini', 1],
        ['Pepperoni', 2],
        ['Pepperoni', 2],
        ['Pepperoni', 2],
        ['Pepapi', 2]
      ]
    },
    3: {
      centre: "Nancy",
      themes: [
        ['Mushrooms', 3],
        ['Onions', 1],
        ['Olives', 1],
        ['Zucchini', 1],
        ['Pepperoni', 2],
        ['Pepperoni', 2],
        ['Pepperoni', 2],
        ['Pepapo', 2]
      ]
    },
    4: {
      centre: "Paris",
      themes: [
        ['Mushrooms', 3],
        ['Onions', 1],
        ['Olives', 1],
        ['Zucchini', 1],
        ['Pepperoni', 2],
        ['Pepperoni', 2],
        ['Pepperoni', 2],
        ['Pepepe', 2]
      ]
    },
    5: {
      centre: "Rennes",
      themes: [
        ['Mushrooms', 3],
        ['Onions', 1],
        ['Olives', 1],
        ['Zucchini', 1],
        ['Pepperoni', 2],
        ['Pepperoni', 2],
        ['Pepperoni', 2],
        ['Pepepa', 2]
      ]
    },
    6: {
      centre: "Saclay",
      themes: [
        ['Mushrooms', 3],
        ['Onions', 1],
        ['Olives', 1],
        ['Zucchini', 1],
        ['Pepperoni', 2],
        ['Pepperoni', 2],
        ['Pepperoni', 2],
        ['Pepapi', 2]
      ]
    },
    7: {
      centre: "Sophia",
      themes: [
        ['Mushrooms', 3],
        ['Onions', 1],
        ['Olives', 1],
        ['Zucchini', 1],
        ['Pepperoni', 2],
        ['Pepperoni', 2],
        ['Pepperoni', 2],
        ['Pepperoni', 2]
      ]
    }
  };

  // create a button for each centre
  for(property in listeCentres) {
    var newEl = document.createElement('button');
    newEl.innerText = listeCentres[property]['centre'];
    newEl.className ="list-group-item list-group-item-action list-group-item-primary btn-sm";
    newEl.setAttribute('type', "button");
    newEl.setAttribute('data-name', listeCentres[property]['centre']);
    buttons.appendChild(newEl);
  }

  // when you click a button setPieChart and setActiveClass
  buttons.addEventListener('click', function(e){
    if(e.target != e.currentTarget){
      var el = e.target,
      name = el.getAttribute('data-name');
      setActiveClass(el);
      setCenterNumber(name);
      resetGraph();
    }
    e.stopPropagation();
  });

  var setActiveClass = function(el) {
    for(var i = 0; i < buttons.children.length; i++) {
      buttons.children[i].classList.remove(activeClass);
      el.classList.add(activeClass);
    }
  }

  var setCenterNumber = function(el) {
    for(property in listeCentres) {
      if(listeCentres[property]['centre'] === el) {
        centerNumber = property;
      }
    }
  }

  var resetGraph = function() {
    var element = document.getElementById("pieChartDiv");
    element.removeChild(element.firstChild);

    google.charts.load('current', {'packages':['corechart']});
    google.charts.setOnLoadCallback(drawChart);
  }

  function drawChart() {

    var data = new google.visualization.DataTable();
    data.addColumn('string', 'Topping');
    data.addColumn('number', 'Slices');

    data.addRows(listeCentres[centerNumber]['themes']);

    // Set chart options
    var options = {
      'width':500,
      'height':400
    };

    var chart = new google.visualization.PieChart(document.getElementById('pieChartDiv'));
    chart.draw(data, options);
  }

  // Load the Visualization API and the corechart package.
  google.charts.load('current', {'packages':['corechart']});

  // Set a callback to run when the Google Visualization API is loaded.
  google.charts.setOnLoadCallback(drawChart);

  // Set up default settings
  setActiveClass(buttons.children[0]);
});
