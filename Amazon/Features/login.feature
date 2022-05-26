#Gherkin - 

Feature: testing login feature

@yourname
Scenario: positive testing - standard user

Given user is in the login page
When user insert valid standard username
When user insert valid password
And user click on login button
Then user is on the product page

@problem
Scenario: positive testing - problem user

Given user is in the login page
When user insert valid problem username
When user insert valid password
And user click on login button
Then user is on the product page

Scenario: positive testing - lockedout user

Given user is in the login page
When user insert valid lockedout username
When user insert valid password
And user click on login button
Then user is on the product page

Scenario: positive testing - performance glitch user

Given user is in the login page
When user insert valid performance glitch username
When user insert valid password
And user click on login button
Then user is on the product page