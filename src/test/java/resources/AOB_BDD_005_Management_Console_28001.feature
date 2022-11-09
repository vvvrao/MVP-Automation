#Auto generated Octane revision tag
@TID28001REV0.4.0
Feature: Advantage bank UI testing

  Scenario: Check if user is able to use the management console
    Given user logs into Advantage bank
    Then A default Log in window of Advantage Bank Portal Should Open
    Then user clicks on profile icon
    Then user clicks on Management Console in the list
    Then a new tab should open
    Then user clicks on merchants
    Then a list of merchants should appear for the user