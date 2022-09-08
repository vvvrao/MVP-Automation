#Auto generated Octane revision tag
@TID12001REV0.7.0
Feature: Advantage bank UI testing

Scenario: Check if user can register in advantage bank portal
Given user navigates to advantage bank url
And click on Register tab
Then user enters all fields in the registration page
And click on "Register" button
Then User must be registered


  Scenario: Check if user is able to login to Advantage bank
    Given user logs into Advantage bank
    Then A default Log in window of Advantage Bank Portal Should Open


  Scenario: Check if all the navigation tabs are available and working
    Given user logs into Advantage bank using registeration credentials
    Then A default Log in window of Advantage Bank Portal Should Open
    Then user click on "Accounts" tab on dashboard
    Then user gets prompted with my accounts page
    Then user click on "New Transfer" tab on dashboard
    Then user click on "Loans" tab on dashboard
    Then user click on "Cards" tab on dashboard
    Then user click on "Forecasts" tab on dashboard
    Then user click on "Stocks" tab on dashboard