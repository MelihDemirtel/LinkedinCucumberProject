@TextBox
@Smoke
Feature: TextBox
  As a user
  I want to submit information form
  So that I can write my information

  Scenario: Scenario-1 Submit to information of user
    Given I am on the demoqa home page
    And user click elements page
    And user click text box page
    And user write full name
    And user write email
    And user write current address
    When user click submit
    Then user check information
