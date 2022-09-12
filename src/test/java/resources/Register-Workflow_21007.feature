#Auto generated Octane revision tag
@TID21007REV0.2.0
Feature: Advantage bank UI testing

  Scenario: Check if user can register in advantage bank portal
    Given user navigates to advantage bank url
    And click on Register tab
    Then user enters all fields in the registration page
#    And click on "Register" button
    Then User must be registered