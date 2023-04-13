$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/RadioButton.feature");
formatter.feature({
  "name": "RadioButton",
  "description": "  As a user\n  I want to click radio buttons\n  So that I can see messages",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@RadioButton"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.scenario({
  "name": "Click Radio Buttons",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@RadioButton"
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
  "name": "user click radio button page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.userClickRadioButtonPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click yes button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.userClickYesButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user check yes messages",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.userCheckYesMessages()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click impressive button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.userClickImpressiveButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user check impressive messages",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.userCheckImpressiveMessages()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user tries to click no button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.userTriesToClickNoButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sees that the button cannot be clicked",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.userSeesThatTheButtonCannotBeClicked()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});