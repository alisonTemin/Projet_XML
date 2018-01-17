// https://www.tutorialspoint.com/svg/src/graph.html

// Function for projects graph
$(function () {
  var listeThemes = {
    0: {
      theme: "ACAC", // Algorithmics, Computer Algebra and Cryptology
      projets: [
        {text : "ARIC"},
        {text : "AROMATH"},
        {text : "CARAMBA"},
        {text : "CASCADE"},
        {text : "DATASHAPE"},
        {text : "GRACE"},
        {text : "LFANT"},
        {text : "POLSYS"},
        {text : "SECRET"},
        {text : "SPECFUN"},
        {text : "VEGAS"}
      ]
    },
    1: {
      theme: "ALC", // Architecture, Languages and Compilation
      projets: [
        {text : "CAIRN"},
        {text : "CAMUS"},
        {text : "COMPSYS"},
        {text : "CORSE"},
        {text : "DREAMPAL"},
        {text : "PACAP"},
        {text : "TASC"}
      ]
    },
    2: {
      theme: "CB", // Computational Biology
      projets: [
        {text : "ABS"},
        {text : "AMIB"},
        {text : "BEAGLE"},
        {text : "BIGS"},
        {text : "BONSAI"},
        {text : "CAPSID"},
        {text : "DYLISS"},
        {text : "ERABLE"},
        {text : "GENSCALE"},
        {text : "IBIS"},
        {text : "LIFEWARE"},
        {text : "MORPHEME"},
        {text : "PLEIADE"},
        {text : "SERPICO"},
        {text : "TAPDANCE"},
        {text : "VIRTUAL PLANTS"}
      ]
    },
    3: {
      theme: "CNM", // Computational Neuroscience and Medecine
      projets: [
        {text : "ARAMIS"},
        {text : "ASCLEPIOS"},
        {text : "ATHENA"},
        {text : "BIOVISION"},
        {text : "CAMIN"},
        {text : "GALEN"},
        {text : "MATHNEURO"},
        {text : "MIMESIS"},
        {text : "MNEMOSYNE"},
        {text : "NEUROSYS"},
        {text : "PARIETAL"},
        {text : "SISTM"},
        {text : "VISAGES"},
        {text : "XPOP"}
      ]
    },
    4: {
      theme: "DKRP", // Data and Knowledge Representation and Processing
      projets: [
        {text : "CEDAR"},
        {text : "DAHU"},
        {text : "EXMO"},
        {text : "GRAPHIK"},
        {text : "LACODAM"},
        {text : "LINKS"},
        {text : "MAGNET"},
        {text : "ORPAILLEUR"},
        {text : "SMIS"},
        {text : "TYREX"},
        {text : "WIMMICS"},
        {text : "ZENITH"}
      ]
    },
    5: {
      theme: "DSM", // Distributed Systems and middleware
      projets: [
        {text : "ASAP"},
        {text : "CIDRE"},
        {text : "COAST"},
        {text : "CTRL-A"},
        {text : "MIMOVE"},
        {text : "MYRIADS"},
        {text : "REGAL"},
        {text : "SPIRALS"},
        {text : "WHISPER"}
      ]
    },
    6: {
      theme: "DHPC", // Distributed and High Performance Computing
      projets: [
        {text : "ALPINES"},
        {text : "AVALON"},
        {text : "DATAMOVE"},
        {text : "HIEPACS"},
        {text : "KERDATA"},
        {text : "POLARIS"},
        {text : "ROMA"},
        {text : "STORM"},
        {text : "TADAAM"}
      ]
    },
    7: {
      theme: "DPSE", // Distributed programming and Software engineering
      projets:[
        {text : "ASCOLA"},
        {text : "DIVERSE"},
        {text : "FOCUS"},
        {text : "INDES"},
        {text : "PHOENIX"},
        {text : "RMOD"},
        {text : "TACOMA"}
      ]
    },
    8: {
      theme: "EEES", // Earth, Environmental and Energy Sciences
      projets:[
        {text : "AIRSEA"},
        {text : "ANGE"},
        {text : "CASTOR"},
        {text : "CLIME"},
        {text : "COFFEE"},
        {text : "FLUMINANCE"},
        {text : "LEMON"},
        {text : "MAGIQUE-3D"},
        {text : "SERENA"},
        {text : "STEEP"},
        {text : "TONUS"}
      ]
    },
    9: {
      theme: "ERTS", // Embedded and Real-time Systems
      projets:[
        {text : "AOSTE"},
        {text : "CONVECS"},
        {text : "HYCOMES"},
        {text : "MUTANT"},
        {text : "PARKAS"},
        {text : "POSET"},
        {text : "SPADES"},
        {text : "TEA"}
      ]
    },
    10: {
      theme: "IV", // Interaction and visualization
      projets:[
        {text : "ALICE"},
        {text : "AVIZ"},
        {text : "EX-SITU"},
        {text : "GRAPHDECO"},
        {text : "HYBRID"},
        {text : "IMAGINE"},
        {text : "MANAO"},
        {text : "MAVERICK"},
        {text : "MIMETIC"},
        {text : "MINT"},
        {text : "MJOLNIR"},
        {text : "POTIOC"},
        {text : "TITANE"}
      ]
    },
    11: {
      theme: "LSA", // Language, Speech and Audio
      projets:[
        {text : "ALPAGE"},
        {text : "MULTISPEECH"},
        {text : "PANAMA"},
        {text : "SEMAGRAMME"}
      ]
    },
    12: {
      theme: "MCLS", // Modeling and Control for Life Sciences
      projets:[
        {text : "BIOCORE"},
        {text : "CARMEN"},
        {text : "DRACULA"},
        {text : "M3DISIM"},
        {text : "MAMBA"},
        {text : "MONC"},
        {text : "MYCENAE"},
        {text : "NUMED"},
        {text : "REO"}
      ]
    },
    13: {
      theme: "N&T",
      projets:[
        {text : "COATI"},
        {text : "DANTE"},
        {text : "DIANA"},
        {text : "DIONYSOS"},
        {text : "DYOGENE"},
        {text : "FUN"},
        {text : "GANG"},
        {text : "INFINE"},
        {text : "MADYNES"},
        {text : "MAESTRO"},
        {text : "MUSE"},
        {text : "RAP"},
        {text : "SOCRATE"},
        {text : "URBANET"}
      ]
    },
    14: {
      theme: "NSS", // Numerical schemes and simulations
      projets:[
        {text : "ACUMES"},
        {text : "CAGIRE"},
        {text : "CARDAMOM"},
        {text : "DEFI"},
        {text : "ECUADOR"},
        {text : "GAMMA3"},
        {text : "IPSO"},
        {text : "MATHERIALS"},
        {text : "MEMPHIS"},
        {text : "MEPHYSTO"},
        {text : "MOKAPLAN"},
        {text : "NACHOS"},
        {text : "NANO-D"},
        {text : "POEMS"},
        {text : "RAPSODI"}
      ]
    },
    15: {
      theme: "OCDS", // Optimization and control of dynamic systems
      projets:[
        {text : "APICS"},
        {text : "BIPOP"},
        {text : "COMMANDS"},
        {text : "DISCO"},
        {text : "GECO"},
        {text : "I4S"},
        {text : "MCTAO"},
        {text : "NECS"},
        {text : "NON-A"},
        {text : "QUANTIC"},
        {text : "SPHINX"},
        {text : "TROPICAL"}
      ]
    },
    16: {
      theme: "OMLSM", // Optimization, machine learning and statistical methods
      projets:[
        {text : "ANJA"},
        {text : "DOLPHIN"},
        {text : "GEOSTAT"},
        {text : "INOCS"},
        {text : "MISTIS"},
        {text : "MODAL"},
        {text : "REALOPT"},
        {text : "SELECT"},
        {text : "SEQUEL"},
        {text : "SIERRA"},
        {text : "TAO"}
      ]
    },
    17: {
      theme: "PV", // Proofs and Verification
      projets:[
        {text : "ANTIQUE"},
        {text : "CELTIQUE"},
        {text : "DEDUCTEAM"},
        {text : "GALLIUM"},
        {text : "MARELLE"},
        {text : "MEXICO"},
        {text : "PARSIFAL"},
        {text : "PI.R2"},
        {text : "SUMO"},
        {text : "TOCCATA"},
        {text : "VERIDIS"}
      ]
    },
    18: {
      theme: "RSE", // Robotics and Smart environments
      projets:[
        {text : "CHROMA"},
        {text : "DEFROST"},
        {text : "FLOWERS"},
        {text : "HEPHAISTOS"},
        {text : "LAGADIC"},
        {text : "LARSEN"},
        {text : "PERVASIVE INTERACTION"},
        {text : "RITS"}
      ]
    },
    19: {
      theme: "SC", // Security and Confidentiality
      projets:[
        {text : "CARTE"},
        {text : "COMETE"},
        {text : "DICE"},
        {text : "PESTO"},
        {text : "PRIVATICS"},
        {text : "PROSECCO"},
        {text : "TAMIS"}
      ]
    },
    20: {
      theme: "SA", // Stochastic approaches
      projets:[
        {text : "ASPI"},
        {text : "CQFD"},
        {text : "MATHRISK"},
        {text : "TOSCA"}
      ]
    },
    21: {
      theme: "VPMI", // Vision, perception and multimedia interpretation
      projets:[
        {text : "AYIN"},
        {text : "LINKMEDIA"},
        {text : "MAGRIT"},
        {text : "MORPHEO"},
        {text : "PERCEPTION"},
        {text : "SIROCCO"},
        {text : "STARS"},
        {text : "THOTH"},
        {text : "WILLOW"}
      ]
    }
  };


  var buttons = document.querySelector('#projectsButtons'),
  activeClass = 'active';

  var oDiv = document.getElementById("projectsDiv");
  var svgNs = "http://www.w3.org/2000/svg";
  var center = {
    X:oDiv.offsetWidth/2,
    Y:oDiv.offsetHeight/2
  };
  var numCentralNode = 0;
  var circleNum = listeThemes[numCentralNode]['projets'].length;
  var angle = 360/circleNum;
  var centerR = 150;

  for(var i=0; i < circleNum; i++){
    listeThemes[numCentralNode]['projets'][i].x = center.X + centerR*Math.cos(i*angle*Math.PI/180);
    listeThemes[numCentralNode]['projets'][i].y = center.Y + centerR*Math.sin(i*angle*Math.PI/180);
  }

  function createSvgTag(tage,json){
    var tag = document.createElementNS(svgNs,tage);
    for(var attr in json) {
      tag.setAttribute(attr,json[attr]);
    }
    return tag;
  }

  function addSvgTags(){
    var oSvg = createSvgTag("svg",{xmlns:"http://www.w3.org/2000/svg", width:"100%", height:"100%", id:"projectsSvg"});
    for(var i=0; i < listeThemes[numCentralNode]['projets'].length; i++) {
      addSvgContentTags(oSvg,listeThemes[numCentralNode]['projets'][i], i);
    }
    var oG = createSvgTag("g",{style:"cursor:pointer"});
    var oCircle = createSvgTag("circle",{cx:center.X,cy:center.Y,r:38,fill:"#d3f4ff",stroke:"black","stroke-width":"1"});
    var oText =  createSvgTag("text",{x:center.X,y:center.Y+8,"font-size":"18",'text-anchor':'middle'});
    oG.appendChild(oCircle);
    oG.appendChild(oText);
    oText.innerHTML = listeThemes[numCentralNode]['theme'];
    textCentralNode = oText;
    oSvg.appendChild(oG);
    oDiv.appendChild(oSvg);
  }

  function addSvgContentTags(oParent, json, num) {
    var oG = createSvgTag("g",{style:"cursor:pointer",class:"Line"});
    var oLine1 = createSvgTag("line",{x1:json.x,y1:json.y,x2:center.X,y2:center.Y,stroke:"black"});
    var oLine2 = createSvgTag("line",{x1:json.x,y1:json.y,x2:center.X,y2:center.Y,stroke:"transparent","stroke-width":"10"});
    oG.appendChild(oLine1);
    oG.appendChild(oLine2);
    oParent.appendChild(oG);

    var oG = createSvgTag("g",{style:"cursor:pointer",class:"circle"});
    var oCircle = createSvgTag("circle",{cx:json.x,cy:json.y,r:35,fill:"#8ee5ff",stroke:"#007bff","stroke-width":"1"});
    var oText =  createSvgTag("text",{x:json.x,y:json.y+5,"font-size":"10",fill:"black",'text-anchor':'middle'});
    oG.appendChild(oCircle);
    oG.appendChild(oText);
    oText.innerHTML = json.text;
    oParent.appendChild(oG);
  }

  function effect(minValue, maxValue) {
    var doc = document;
    var oLineObj = doc.getElementsByClassName("Line");
    var oCircleObj = doc.getElementsByClassName("circle");
    for(var i=0;i<oCircleObj.length;i++){
      oCircleObj[i].onmouseenter = function(){
        startMove(this.getElementsByTagName("circle")[0],minValue,maxValue);
        var prev = this.previousElementSibling;
        prev.getElementsByTagName("line")[0].setAttribute("stroke","#007bff");
      }
      oCircleObj[i].onmouseleave = function(){
        startMove(this.getElementsByTagName("circle")[0],maxValue,minValue);
        var prev = this.previousElementSibling;
        prev.getElementsByTagName("line")[0].setAttribute("stroke","black");
      }
    }
    for(var j=0;j<oLineObj.length;j++){
      oLineObj[j].onmouseenter = function(){
        this.getElementsByTagName("line")[0].setAttribute("stroke","#007bff");
        var next = this.nextElementSibling;
        startMove(next.getElementsByTagName("circle")[0],minValue,maxValue);
      }
      oLineObj[j].onmouseleave = function(){
        this.getElementsByTagName("line")[0].setAttribute("stroke","black");
        var next = this.nextElementSibling;
        startMove(next.getElementsByTagName("circle")[0],minValue,maxValue);
      }
    }
  }

  function startMove(obj,r1,r2){
    var nowR = r1;
    var targetR = r2;
    this.speed = 0;
    clearInterval(obj.timer);
    obj.timer = setInterval(function(){
      this.speed += (targetR - nowR)/6;
      this.speed *= 0.9;
      if(Math.abs(targetR - nowR)<=1 && Math.abs(this.speed)<=1){
        clearInterval(obj.timer);
        obj.setAttribute("r",targetR);
      }else{
        nowR += this.speed;
        obj.setAttribute("r",nowR);
      }
    },30);
  }

  // Create a button for each centre
  for(property in listeThemes) {
    var newEl = document.createElement('button');
    newEl.innerText = listeThemes[property]['theme'];
    newEl.setAttribute('type', "button");
    newEl.className ="btn btn-outline-primary btn-sm";
    newEl.setAttribute('data-name', listeThemes[property]['theme']);
    buttons.appendChild(newEl);
  }

  // when you click a button setActiveClass
  buttons.addEventListener('click', function(e){
    if(e.target != e.currentTarget){
      var el = e.target;
      var name = el.getAttribute('data-name');
      setActiveClass(el);
      setNumCentralNode(name);
      setCircleNum(name);
      resetNodes(name);
    }
    e.stopPropagation();
  });

  var setActiveClass = function(el) {
    for(var i = 0; i < buttons.children.length; i++) {
      buttons.children[i].classList.remove(activeClass);
      el.classList.add(activeClass);
    }
  }

  var setNumCentralNode = function(el) {
    for(property in listeThemes) {
      if(listeThemes[property]['theme'] === el) {
        numCentralNode = property;
      }
    }
  }

  var setCircleNum = function(el) {
    for(property in listeThemes) {
      if(listeThemes[property]['theme'] === el) {
        circleNum = listeThemes[property]['projets'].length;
        angle = 360/circleNum;
      }
    }
  }

  var resetNodes = function(el) {
    document.querySelector("svg").remove();
    for(var i=0; i < circleNum; i++) {
      listeThemes[numCentralNode]['projets'][i].x = center.X + centerR*Math.cos(i*angle*Math.PI/180);
      listeThemes[numCentralNode]['projets'][i].y = center.Y + centerR*Math.sin(i*angle*Math.PI/180);
    }
    addSvgTags();
    if(circleNum >= 11) {
      var minVal = 35;
      var maxVal = 40;
      effect(minVal, maxVal);
    } else {
      var minVal = 40;
      var maxVal = 45;
      effect(minVal, maxVal);
    }
  }

  // Add svg elements
  addSvgTags();
  if(circleNum >= 11) {
    var minVal = 35;
    var maxVal = 40;
    effect(minVal, maxVal);
  } else {
    var minVal = 38;
    var maxVal = 42;
    effect(minVal, maxVal);
  }

  // Set up default settings
  setActiveClass(buttons.children[0]);
});
