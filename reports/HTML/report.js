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
formatter.step({
  "name": "Application Url",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.application_Url()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat com.testingone.stepdef.Login.application_Url(Login.java:43)\r\n\tat ✽.Application Url(src/test/resources/features/LoginPage.feature:24)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I Click on Gmail Link",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.i_Click_on_Gmail_Link1()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});