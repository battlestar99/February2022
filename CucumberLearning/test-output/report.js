$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Gherkin -"
    }
  ],
  "line": 3,
  "name": "testing login feature",
  "description": "",
  "id": "testing-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "positive testing - standard user",
  "description": "",
  "id": "testing-login-feature;positive-testing---standard-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user is in the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user insert valid standard username",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user insert valid password",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user is on the product page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_is_page()"
});
formatter.result({
  "duration": 2087553200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_insert_valid_standard_username()"
});
formatter.result({
  "duration": 121426900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_insert_valid_password()"
});
formatter.result({
  "duration": 70062100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_login_button()"
});
formatter.result({
  "duration": 113328300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_is_on_the_product_page()"
});
formatter.result({
  "duration": 13400,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "positive testing - problem user",
  "description": "",
  "id": "testing-login-feature;positive-testing---problem-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "user is in the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user insert valid problem username",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user insert valid password",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user is on the product page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_is_page()"
});
formatter.result({
  "duration": 1459938100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_insert_valid_problem_username()"
});
formatter.result({
  "duration": 118670300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_insert_valid_password()"
});
formatter.result({
  "duration": 82694000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_login_button()"
});
formatter.result({
  "duration": 105736900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_is_on_the_product_page()"
});
formatter.result({
  "duration": 24800,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "positive testing - lockedout user",
  "description": "",
  "id": "testing-login-feature;positive-testing---lockedout-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "user is in the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "user insert valid lockedout username",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user insert valid password",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user is on the product page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_is_page()"
});
formatter.result({
  "duration": 1462388600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_insert_valid_lockedout_username()"
});
formatter.result({
  "duration": 144558500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_insert_valid_password()"
});
formatter.result({
  "duration": 73342300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_login_button()"
});
formatter.result({
  "duration": 64954100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_is_on_the_product_page()"
});
formatter.result({
  "duration": 15900,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "positive testing - performance glitch user",
  "description": "",
  "id": "testing-login-feature;positive-testing---performance-glitch-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 31,
  "name": "user is in the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "user insert valid performance glitch username",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user insert valid password",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user is on the product page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_is_page()"
});
formatter.result({
  "duration": 1634784000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_insert_valid_performance_glitch_username()"
});
formatter.result({
  "duration": 192783100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_insert_valid_password()"
});
formatter.result({
  "duration": 71232800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_login_button()"
});
formatter.result({
  "duration": 5116515900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_is_on_the_product_page()"
});
formatter.result({
  "duration": 15500,
  "status": "passed"
});
formatter.uri("signup.feature");
formatter.feature({
  "line": 1,
  "name": "testing login feature",
  "description": "",
  "id": "testing-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "positive testing - standard user",
  "description": "",
  "id": "testing-login-feature;positive-testing---standard-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is in the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user insert valid standard username",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user insert valid password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user is on the product page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_is_page()"
});
formatter.result({
  "duration": 1470351600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_insert_valid_standard_username()"
});
formatter.result({
  "duration": 151755500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_insert_valid_password()"
});
formatter.result({
  "duration": 74450100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_login_button()"
});
formatter.result({
  "duration": 103208800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_is_on_the_product_page()"
});
formatter.result({
  "duration": 19300,
  "status": "passed"
});
formatter.uri("userValidation.feature");
formatter.feature({
  "line": 1,
  "name": "testing login feature",
  "description": "",
  "id": "testing-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "positive testing - standard user",
  "description": "",
  "id": "testing-login-feature;positive-testing---standard-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is in the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user insert valid standard username",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user insert valid password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user is on the product page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_is_page()"
});
formatter.result({
  "duration": 1508138400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_insert_valid_standard_username()"
});
formatter.result({
  "duration": 171693600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_insert_valid_password()"
});
formatter.result({
  "duration": 79841700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_login_button()"
});
formatter.result({
  "duration": 112014200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_is_on_the_product_page()"
});
formatter.result({
  "duration": 25400,
  "status": "passed"
});
});