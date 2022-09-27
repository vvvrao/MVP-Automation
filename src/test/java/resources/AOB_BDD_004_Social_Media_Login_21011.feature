#Auto generated Octane revision tag
@TID21011REV0.4.0
Feature: Advantage bank UI testing
	Scenario: Check if user can log-in to AOB portal using social media
		Given user navigates to advantage bank url for social media login
		And User click on Google tab
		And user enters their respective Gmail address and password and click on next
		Then A default Log in window of Advantage Bank Portal Should Open
		Then close app

