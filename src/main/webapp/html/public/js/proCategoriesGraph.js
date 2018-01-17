// https://codepen.io/mdgrover/pen/eZENxO
// http://www.knowstack.com/svg-column-chart/

// https://developers.google.com/chart/interactive/docs/gallery/columnchart

// Function for professional categories graph
$(function () {

  var categoriesPro = [
    'Catégorie',
    'Assistant',
    'Autre',
    'Chercheur',
    'Enseignant',
    'PhD',
    'PostDoc',
    'Technique',
    'Visiteur'
  ];
  categoriesPro.push({ role: 'annotation' });

  var centre1 = ['Bordeaux', 37, 107, 56, 62, 143, 37, 67, 23, ''];
  var centre2 = ['Grenoble', 54, 146, 115, 125, 293, 66, 108, 45, ''];
  var centre3 = ['Lille', 18, 64, 47, 79, 130, 30, 40, 47, ''];
  var centre4 = ['Nancy', 52, 95, 76, 94, 142, 37, 47, 16, ''];
  var centre5 = ['Paris', 44, 128, 146, 65, 275, 60, 85, 40, ''];
  var centre6 = ['Rennes', 37, 69, 106, 129, 314, 61, 133, 43, ''];
  var centre7 = ['Saclay', 46, 78, 110, 66, 215, 51, 51, 42, ''];
  var centre8 = ['Sophia', 35, 114, 144, 63, 233, 61, 90, 69, ''];


  // Load the Visualization API and the corechart package.
  google.charts.load('current', {'packages':['corechart']});

  // Set a callback to run when the Google Visualization API is loaded.
  google.charts.setOnLoadCallback(drawChart);

  // Callback that creates and populates a data table,
  // instantiates the pie chart, passes in the data and
  // draws it.
  function drawChart() {
    var data = google.visualization.arrayToDataTable([categoriesPro, centre1, centre2, centre3, centre4, centre5, centre6, centre7, centre8]);

    var options = {
      width: 600,
      height: 400,
      legend: { position: 'top', maxLines: 4 },
      bar: { groupWidth: '75%' },
      isStacked: true,
    };

    var chart = new google.visualization.ColumnChart(
      document.getElementById('columnChartDiv'));

      chart.draw(data, options);
    }
  });
