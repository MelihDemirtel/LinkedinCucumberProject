@RadioButton
@Smoke
Feature: RadioButton
  As a user
  I want to click radio buttons
  So that I can see messages

  Scenario: Click Radio Buttons
    Given I am on the demoqa home page
    And user click elements page
    And user click radio button page
    And user click yes button
    Then user check yes messages
    And user click impressive button
    Then user check impressive messages
    And user tries to click no button
    Then user sees that the button cannot be clicked