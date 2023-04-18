$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Buttons.feature");
formatter.feature({
  "name": "Buttons",
  "description": "  As a user\n  I want to click buttons\n  So that I can see messages",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Buttons"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.scenario({
  "name": "Scenario-1 Click Buttons",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Buttons"
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
  "name": "user click buttons page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.userClickButtonsPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click double click me button with left mouse click twice",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.userClickDoubleClickMeButtonWithLeftMouseClickTwice()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click right click me button with right mouse click once",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.userClickRightClickMeButtonWithRightMouseClickOnce()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click click me button with left mouse click once",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.userClickClickMeButtonWithLeftMouseClickOnce()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user checked messages",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.userCheckedMessages()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});