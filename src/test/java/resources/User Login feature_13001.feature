#Auto generated Octane revision tag
@TID13001REV0.2.0
Feature: Advantage bank UI testing
@TC_001
  Scenario: Check if user is able to login to Advantage bank
    Given user logs into Advantage bank
    Then A default Log in window of Advantage Bank Portal Should Open
    Then close app