#Auto generated Octane revision tag
@TID20003REV0.2.0
Feature: Addition test

  Scenario: Check if user can register
    Given user navigates to advantage bank url
    And click on Register tab
    Then user enters all fields in the registration page
    And click on "Register" button
    Then User must be registered
