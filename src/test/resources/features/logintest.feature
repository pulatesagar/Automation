@All
Feature: Feature to test login functionality
  @validLogin
  Scenario Outline: Check login is successful with valid credentials
    Given user on login page
    When user enters <username> and <password>
    And user clicks on login button
    Then user should be redirected to dashboard

    Examples: 
      | username | password     |
      | user  | 123 |