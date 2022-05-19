$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("signup.feature");
formatter.feature({
  "line": 1,
  "name": "testing login feature",
  "description": "",
  "id": "testing-login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "positive testing - standard user",
  "description": "",
  "id": "testing-login-feature;positive-testing---standard-user",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@standardUser"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is in the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user insert valid standard \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user insert valid password \"\u003cpassword\u003e\"",
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
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "testing-login-feature;positive-testing---standard-user;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "testing-login-feature;positive-testing---standard-user;;1"
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ],
      "line": 13,
      "id": "testing-login-feature;positive-testing---standard-user;;2"
    },
    {
      "cells": [
        "problem_user",
        "secret_sauce"
      ],
      "line": 14,
      "id": "testing-login-feature;positive-testing---standard-user;;3"
    },
    {
      "cells": [
        "locked_out_user",
        "secret_sauce"
      ],
      "line": 15,
      "id": "testing-login-feature;positive-testing---standard-user;;4"
    },
    {
      "cells": [
        "performance_glitch_user",
        "secret_sauce"
      ],
      "line": 16,
      "id": "testing-login-feature;positive-testing---standard-user;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 130600,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "positive testing - standard user",
  "description": "",
  "id": "testing-login-feature;positive-testing---standard-user;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@standardUser"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is in the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user insert valid standard \"standard_user\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user insert valid password \"secret_sauce\"",
  "matchedColumns": [
    1
  ],
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
  "duration": 2094193500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 28
    }
  ],
  "location": "StepDefinition.user_insert_valid_standard(String)"
});
formatter.result({
  "duration": 128952000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 28
    }
  ],
  "location": "StepDefinition.user_insert_valid_password(String)"
});
formatter.result({
  "duration": 63178200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_login_button()"
});
formatter.result({
  "duration": 100001700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_is_on_the_product_page()"
});
formatter.result({
  "duration": 21900,
  "status": "passed"
});
formatter.after({
  "duration": 7500,
  "status": "passed"
});
formatter.before({
  "duration": 17200,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "positive testing - standard user",
  "description": "",
  "id": "testing-login-feature;positive-testing---standard-user;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@standardUser"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is in the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user insert valid standard \"problem_user\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user insert valid password \"secret_sauce\"",
  "matchedColumns": [
    1
  ],
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
  "duration": 1433106100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "problem_user",
      "offset": 28
    }
  ],
  "location": "StepDefinition.user_insert_valid_standard(String)"
});
formatter.result({
  "duration": 121488300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 28
    }
  ],
  "location": "StepDefinition.user_insert_valid_password(String)"
});
formatter.result({
  "duration": 80470600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_login_button()"
});
formatter.result({
  "duration": 103555700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_is_on_the_product_page()"
});
formatter.result({
  "duration": 18800,
  "status": "passed"
});
formatter.after({
  "duration": 9400,
  "status": "passed"
});
formatter.before({
  "duration": 19700,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "positive testing - standard user",
  "description": "",
  "id": "testing-login-feature;positive-testing---standard-user;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@standardUser"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is in the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user insert valid standard \"locked_out_user\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user insert valid password \"secret_sauce\"",
  "matchedColumns": [
    1
  ],
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
  "duration": 1428566900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "locked_out_user",
      "offset": 28
    }
  ],
  "location": "StepDefinition.user_insert_valid_standard(String)"
});
formatter.result({
  "duration": 136058600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 28
    }
  ],
  "location": "StepDefinition.user_insert_valid_password(String)"
});
formatter.result({
  "duration": 74831200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_login_button()"
});
formatter.result({
  "duration": 72956700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_is_on_the_product_page()"
});
formatter.result({
  "duration": 25500,
  "status": "passed"
});
formatter.after({
  "duration": 13500,
  "status": "passed"
});
formatter.before({
  "duration": 20200,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "positive testing - standard user",
  "description": "",
  "id": "testing-login-feature;positive-testing---standard-user;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@standardUser"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is in the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user insert valid standard \"performance_glitch_user\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user insert valid password \"secret_sauce\"",
  "matchedColumns": [
    1
  ],
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
  "duration": 1484282800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "performance_glitch_user",
      "offset": 28
    }
  ],
  "location": "StepDefinition.user_insert_valid_standard(String)"
});
formatter.result({
  "duration": 158106000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 28
    }
  ],
  "location": "StepDefinition.user_insert_valid_password(String)"
});
formatter.result({
  "duration": 70400900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_login_button()"
});
formatter.result({
  "duration": 3237796400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_is_on_the_product_page()"
});
formatter.result({
  "duration": 23100,
  "status": "passed"
});
formatter.after({
  "duration": 7500,
  "status": "passed"
});
});