Feature: testing login feature

Description: testing login feature

Background: 
Given user is in the login page

@yourname
Scenario: positive testing - standard user

#Given user is in the login page
When user insert valid standard username
When user insert valid password
And user click on login button
Then user is on the product page

Scenario: positive testing - performance glitch user

#Given user is in the login page
When user insert valid performance glitch username
When user insert valid password
And user click on login button
Then user is on the product page