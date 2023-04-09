$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/TextBox.feature");
formatter.feature({
  "name": "TextBox",
  "description": "  As a user\n  I want to submit information form\n  So that I can write my information",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Submit to information of user",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on the demoqa home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.iAmOnTheDemoqaHomePage()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat pages.TextBox.homePage(TextBox.java:51)\r\n\tat stepDefinitions.StepDefinitions.iAmOnTheDemoqaHomePage(StepDefinitions.java:22)\r\n\tat ✽.I am on the demoqa home page(file:src/test/java/features/TextBox.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user click elements page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.userClickElementsPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click text box page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.userClickTextBoxPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user write full name",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.userWriteFullName()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user write email",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.userWriteEmail()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user write current address",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.userWriteCurrentAddress()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click submit",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.userClickSubmit()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user check information",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.userCheckInformation()"
});
formatter.result({
  "status": "skipped"
});
});