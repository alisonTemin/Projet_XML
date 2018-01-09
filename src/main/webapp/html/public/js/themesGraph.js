// https://hackernoon.com/a-simple-pie-chart-in-svg-dbdd653b6936
// https://codepen.io/shshaw/pen/KpyNQq
// https://codepen.io/team/css-tricks/pen/77040610b66e6aa0d0fb87022c524194
// https://www.smashingmagazine.com/2015/07/designing-simple-pie-charts-with-css/

// Function for themes graph (pie chart)
$(function () {
  var total = 158,
  buttons = document.querySelector('#themesButtons'),
  pie = document.querySelector('.pie'),
  activeClass = 'active';

  var centres = {
    CR0001I: 10,
    CR0002O : 10,
    CR0003O: 0,
    CR0004Z: 0,
    CR0005N: 0,
    CR0006Z: 0,
    CR0007B: 0,
    CR0008I:0
  };

  // work out percentage as a result of total
  var numberFixer = function(num){
    var result = ((num * total) / 100);
    return result;
  }

  // create a button for each centre
  for(property in centres) {
    var newEl = document.createElement('button');
    newEl.innerText = property;
    newEl.className ="list-group-item list-group-item-action list-group-item-primary btn-sm";
    newEl.setAttribute('type', "button");
    newEl.setAttribute('data-name', property);
    buttons.appendChild(newEl);
  }

  // when you click a button setPieChart and setActiveClass
  buttons.addEventListener('click', function(e){
    if(e.target != e.currentTarget){
      var el = e.target,
      name = el.getAttribute('data-name');
      setPieChart(name);
      setActiveClass(el);
    }
    e.stopPropagation();
  });

  var setPieChart = function(name){
    var number = centres[name],
    fixedNumber = numberFixer(number),
    result = fixedNumber + ' ' + total;
    pie.style.strokeDasharray = result;
  }

  var setActiveClass = function(el) {
    for(var i = 0; i < buttons.children.length; i++) {
      buttons.children[i].classList.remove(activeClass);
      el.classList.add(activeClass);
    }
  }

  // Set up default settings
  setPieChart('CR0001I');
  setActiveClass(buttons.children[0]);
});
