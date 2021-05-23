@All
Feature: Check landing page is loading or not

  @landing
  Scenario Outline: 
    Given browser is open
    When user clicks on login link
    Then user should be redirected to the login page
