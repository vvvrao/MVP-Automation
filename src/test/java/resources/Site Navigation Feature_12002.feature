#Auto generated Octane revision tag
@TID12002REV0.9.0
Feature: Advantage bank UI testing

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
