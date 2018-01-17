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
        ['Algorithmics, Computer Algebra and Cryptology', 1],
        ['Computational Biology', 1],
        ['Computational Neuroscience and Medecine', 2],
        ['Distributed and High Performance Computing', 3],
        ['Distributed programming and Software engineering', 1],
        ['Earth, Environmental and Energy Sciences', 1],
        ['Embedded and Real-time Systems', 1],
        ['Interaction and visualization', 2],
        ['Modeling and Control for Life Sciences', 2],
        ['Numerical schemes and simulations', 3],
        ['Optimization, machine learning and statistical methods', 2],
        ['Robotics and Smart environments', 1],
        ['Stochastic approaches', 1]
      ]
    },

    1: {
      centre: "Grenoble",
      themes: [
        ['Algorithmics, Computer Algebra and Cryptology', 1],
        ['Architecture, Languages and Compilation', 2],
        ['Computational Biology', 3],
        ['Data and Knowledge Representation and Processing', 2],
        ['Distributed Systems and middleware', 1],
        ['Distributed and High Performance Computing', 4],
        ['Earth, Environmental and Energy Sciences', 2],
        ['Embedded and Real-time Systems', 2],
        ['Interaction and visualization', 2],
        ['Modeling and Control for Life Sciences', 2],
        ['Networks and Telecommunications', 3],
        ['Numerical schemes and simulations', 1],
        ['Optimization and control of dynamic systems', 2],
        ['Optimization, machine learning and statistical methods', 1],
        ['Robotics and Smart environments', 2],
        ['Security and Confidentiality', 2],
        ['Vision, perception and multimedia interpretation', 3]
      ]
    },
    2: {
      centre: "Lille",
      themes: [
        ['Architecture, Languages and Compilation', 1],
        ['Computational Biology', 1],
        ['Data and Knowledge Representation and Processing', 2],
        ['Distributed Systems and middleware', 1],
        ['Distributed programming and Software engineering', 1],
        ['Interaction and visualization', 2],
        ['Networks and Telecommunications', 1],
        ['Numerical schemes and simulations', 2],
        ['Optimization and control of dynamic systems', 1],
        ['Optimization, machine learning and statistical methods', 4],
        ['Robotics and Smart environments', 1]
      ]
    },
    3: {
      centre: "Nancy",
      themes: [
        ['Algorithmics, Computer Algebra and Cryptology', 2],
        ['Architecture, Languages and Compilation', 1],
        ['Computational Biology', 2],
        ['Computational Neuroscience and Medecine', 2],
        ['Data and Knowledge Representation and Processing', 1],
        ['Distributed Systems and middleware', 1],
        ['Earth, Environmental and Energy Sciences', 1],
        ['Interaction and visualization', 1],
        ['Language, Speech and Audio', 2],
        ['Networks and Telecommunications', 1],
        ['Optimization and control of dynamic systems', 1],
        ['Proofs and Verification', 1],
        ['Robotics and Smart environments', 1],
        ['Security and Confidentiality', 2],
        ['Stochastic approaches', 1],
        ['Vision, perception and multimedia interpretation', 1]
      ]
    },
    4: {
      centre: "Paris",
      themes: [
        ['Algorithmics, Computer Algebra and Cryptology', 3],
        ['Computational Biology', 1],
        ['Computational Neuroscience and Medecine', 1],
        ['Distributed Systems and middleware', 3],
        ['Distributed and High Performance Computing', 1],
        ['Earth, Environmental and Energy Sciences', 3],
        ['Embedded and Real-time Systems', 3],
        ['Language, Speech and Audio', 1],
        ['Modeling and Control for Life Sciences', 3],
        ['Networks and Telecommunications', 5],
        ['Numerical schemes and simulations', 2],
        ['Optimization and control of dynamic systems', 1],
        ['Optimization, machine learning and statistical methods', 1],
        ['Proofs and Verification', 3],
        ['Robotics and Smart environments', 1],
        ['Security and Confidentiality', 1],
        ['Stochastic approaches', 1],
        ['Vision, perception and multimedia interpretation', 1]
      ]
    },
    5: {
      centre: "Rennes",
      themes: [
        ['Architecture, Languages and Compilation', 3],
        ['Computational Biology', 3],
        ['Computational Neuroscience and Medecine', 1],
        ['Data and Knowledge Representation and Processing', 1],
        ['Distributed Systems and middleware', 3],
        ['Distributed and High Performance Computing', 1],
        ['Distributed programming and Software engineering', 3],
        ['Earth, Environmental and Energy Sciences', 1],
        ['Embedded and Real-time Systems', 2],
        ['Interaction and visualization', 2],
        ['Language, Speech and Audio', 1],
        ['Networks and Telecommunications', 1],
        ['Numerical schemes and simulations', 1],
        ['Optimization and control of dynamic systems', 1],
        ['Optimization, machine learning and statistical methods', 1],
        ['Proofs and Verification', 2],
        ['Robotics and Smart environments', 1],
        ['Security and Confidentiality', 1],
        ['Stochastic approaches', 1],
        ['Vision, perception and multimedia interpretation', 2]
      ]
    },
    6: {
      centre: "Saclay",
      themes: [
        ['Algorithmics, Computer Algebra and Cryptology', 3],
        ['Computational Biology', 2],
        ['Computational Neuroscience and Medecine', 3],
        ['Data and Knowledge Representation and Processing', 3],
        ['Interaction and visualization', 3],
        ['Modeling and Control for Life Sciences', 1],
        ['Networks and Telecommunications', 1],
        ['Numerical schemes and simulations', 3],
        ['Optimization and control of dynamic systems', 4],
        ['Optimization, machine learning and statistical methods', 2],
        ['Proofs and Verification', 4],
        ['Security and Confidentiality', 1]
      ]
    },
    7: {
      centre: "Sophia",
      themes: [
        ['Algorithmics, Computer Algebra and Cryptology', 2],
        ['Computational Biology', 3],
        ['Computational Neuroscience and Medecine', 5],
        ['Data and Knowledge Representation and Processing', 3],
        ['Distributed programming and Software engineering', 2],
        ['Earth, Environmental and Energy Sciences', 3],
        ['Embedded and Real-time Systems', 1],
        ['Interaction and visualization', 2],
        ['Modeling and Control for Life Sciences', 1],
        ['Networks and Telecommunications', 3],
        ['Numerical schemes and simulations', 3],
        ['Optimization and control of dynamic systems', 2],
        ['Proofs and Verification', 1],
        ['Robotics and Smart environments', 2],
        ['Stochastic approaches', 1],
        ['Vision, perception and multimedia interpretation', 2]
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
