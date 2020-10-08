$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Assignment1.feature");
formatter.feature({
  "line": 1,
  "name": "Registered login activity",
  "description": "",
  "id": "registered-login-activity",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Register user",
  "description": "",
  "id": "registered-login-activity;register-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User is navigating google homepage in a browser",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User will search for ‘Accolite’ text",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User will count the number of links ‘Accolite’ returned on the results page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.launchBrowser()"
});
formatter.result({
  "duration": 8683960945,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.verifyGooglehomepage()"
});
formatter.result({
  "duration": 17981270,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.searchAccoliteText()"
});
formatter.result({
  "duration": 269240673,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.verifyAcoliteLinkCount()"
});
formatter.result({
  "duration": 34970592,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 187699015,
  "status": "passed"
});
});