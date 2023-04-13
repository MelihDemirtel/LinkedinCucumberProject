$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/CheckBox.feature");
formatter.feature({
  "name": "CheckBox",
  "description": "  As a user\n  I want to click check boxes\n  So that I can see boxes",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@CheckBox"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.scenario({
  "name": "Click Check Boxes",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CheckBox"
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
  "name": "user click check box page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.userClickCheckBoxPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click home check box",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.userClickHomeCheckBox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user checked boxes",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.userCheckedBoxes()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/RadioButton.feature");
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
  "name": "user check messages",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.userCheckMessages()"
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
  "name": "user check messages",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.userCheckMessages()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected [Yes] but found [Impressive]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:137)\r\n\tat org.testng.Assert.assertEquals(Assert.java:118)\r\n\tat org.testng.Assert.assertEquals(Assert.java:453)\r\n\tat org.testng.Assert.assertEquals(Assert.java:463)\r\n\tat pages.RadioButton.checkYesMessages(RadioButton.java:40)\r\n\tat stepDefinitions.StepDefinitions.userCheckMessages(StepDefinitions.java:84)\r\n\tat ✽.user check messages(file:src/test/java/features/RadioButton.feature:15)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user tries to click no button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.userTriesToClickNoButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user sees that the button cannot be clicked",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.userSeesThatTheButtonCannotBeClicked()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/TextBox.feature");
formatter.feature({
  "name": "TextBox",
  "description": "  As a user\n  I want to submit information form\n  So that I can write my information",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@TextBox"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.scenario({
  "name": "Submit to information of user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TextBox"
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
  "name": "user click text box page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.userClickTextBoxPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user write full name",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.userWriteFullName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user write email",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.userWriteEmail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user write current address",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.userWriteCurrentAddress()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click submit",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.userClickSubmit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user check information",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.userCheckInformation()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});