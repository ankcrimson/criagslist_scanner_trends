$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/cl.feature");
formatter.feature({
  "line": 1,
  "name": "Scan CriagsList For Cars",
  "description": "",
  "id": "scan-criagslist-for-cars",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Scan CriagsList for cars",
  "description": "",
  "id": "scan-criagslist-for-cars;scan-criagslist-for-cars",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am able to open criagslist rss",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I go through all the pages of content",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I am able to parse the data",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I should be able to save it into elasticsearch",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});