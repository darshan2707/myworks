$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/LoginPage.feature");
formatter.feature({
  "name": "Test login feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@f1"
    }
  ]
});
formatter.scenario({
  "name": "verify application url",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@f1"
    },
    {
      "name": "@first"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Application Url",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.application_Url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Click on Gmail Link",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.i_Click_on_Gmail_Link1()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});