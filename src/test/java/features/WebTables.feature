@WebTables
@Smoke
Feature: WebTables
  As a user
  I want to add my information in the web table
  So that I can write my information in registration form

  Scenario: Submit to registration form
    Given I am on the demoqa home page
    And user click elements page
    And user click web tables
    And user click add button
    And user send first name
    And user send last name
    And user send email
    And user send age
    And user send salary
    And user send department
    When user click submit button
    Then user check last row in the table