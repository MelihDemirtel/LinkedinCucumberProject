@Buttons
@Smoke
Feature: Buttons
  As a user
  I want to click buttons
  So that I can see messages

  Scenario: Scenario-1 Click Buttons
    Given I am on the demoqa home page
    And user click elements page
    And user click buttons page
    And user click double click me button with left mouse click twice
    And user click right click me button with right mouse click once
    And user click click me button with left mouse click once
    Then user checked messages