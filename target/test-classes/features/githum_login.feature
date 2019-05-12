Feature: github login 

Scenario: login without username and password
    Given user is on Facebook homepage
    When user clicks on Forgot Account in button
	Then user enters an account