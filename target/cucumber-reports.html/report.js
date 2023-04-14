$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/WebTables.feature");
formatter.feature({
  "name": "WebTables",
  "description": "  As a user\n  I want to add my information in the web table\n  So that I can write my information in registration form",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@WebTables"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.scenario({
  "name": "Scenario-1 Submit to registration form",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@WebTables"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the demoqa home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.iAmOnTheDemoqaHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click elements page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.userClickElementsPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click web tables",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.userClickWebTables()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click add button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.userClickAddButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user send first name",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.userSendFirstName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user send last name",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.userSendLastName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user send email",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.userSendEmail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user send age",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.userSendAge()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user send salary",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.userSendSalary()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user send department",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.userSendDepartment()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click submit button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.userClickSubmitButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user check last row in the table",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.userCheckLastRowInTheTable()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});