$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login into account",
  "description": "\nIn order to perform sucessfull login\nAs user that have complete profile\nI should see product matches",
  "id": "login-into-account",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Login to account with credentials",
  "description": "",
  "id": "login-into-account;login-to-account-with-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@android"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User navigates to onboarding screen by swipe",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User click login button on onboarding screen",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User input the \"\u003cusername\u003e\" username",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User input the \"\u003cpassword\u003e\" password",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User click login button on login screen",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User should be directed to homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User can see product matches",
  "keyword": "And "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "login-into-account;login-to-account-with-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 18,
      "id": "login-into-account;login-to-account-with-credentials;;1"
    },
    {
      "cells": [
        "testqa",
        "test123"
      ],
      "line": 19,
      "id": "login-into-account;login-to-account-with-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 44359171363,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Login to account with credentials",
  "description": "",
  "id": "login-into-account;login-to-account-with-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@android"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User navigates to onboarding screen by swipe",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User click login button on onboarding screen",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User input the \"testqa\" username",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User input the \"test123\" password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User click login button on login screen",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User should be directed to homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User can see product matches",
  "keyword": "And "
});
formatter.match({
  "location": "OnBoardingSteps.user_navigates_to_onboarding_screen_by_swipe()"
});
formatter.result({
  "duration": 38667086234,
  "status": "passed"
});
formatter.match({
  "location": "OnBoardingSteps.user_click_login_button_on_onboarding_screen()"
});
formatter.result({
  "duration": 10751969151,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testqa",
      "offset": 16
    }
  ],
  "location": "LoginSteps.User_input_the_something_username(String)"
});
formatter.result({
  "duration": 1289844139,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test123",
      "offset": 16
    }
  ],
  "location": "LoginSteps.User_input_the_something_password(String)"
});
formatter.result({
  "duration": 1793743620,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_click_login_button_on_login_screen()"
});
formatter.result({
  "duration": 7561089765,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.User_should_be_directed_to_homepage()"
});
formatter.result({
  "duration": 2249933,
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat stepDefinitions.LoginSteps.User_should_be_directed_to_homepage(LoginSteps.java:38)\n\tat ✽.Then User should be directed to homepage(Login.feature:14)\n",
  "status": "pending"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 305263,
  "status": "passed"
});
});