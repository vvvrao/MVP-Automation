Feature: Advantage bank UI testing

  @TC_001
  Scenario: Check if user can register in advantage bank portal
    Given user navigates to advantage bank url
    And click on Register tab
    Then user enters all fields in the registration page
     And click on "Register" button
    Then User must be registered


  @TC_002
  Scenario: Check if user is able to login to Advantage bank
    Given user logs into Advantage bank
    Then A default Log in window of Advantage Bank Portal Should Open
