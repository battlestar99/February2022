#Gherkin - 

Feature: testing login feature

Scenario: positive testing - standard user

Given user is in the login page
When user insert valid standard username
When user insert valid password
And user click on login button
Then user is on the product page

Scenario: positive testing - problem user

Given user is in the login page
When user insert valid problem username
When user insert valid password
And user click on login button
Then user is on the product page