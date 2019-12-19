$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login into account",
  "description": "\nIn order to perform sucessfull login\nAs user that have complete profile\nI should see greeting text, search bar, notification, ads",
  "id": "login-into-account",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 22,
  "name": "Login to account with credentials",
  "description": "",
  "id": "login-into-account;login-to-account-with-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 21,
      "name": "@ios"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "User navigates to onboarding screen by click next",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "User click login button on onboarding screen",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User input \"\u003cusername\u003e\" username and \"\u003cpassword\u003e\" password",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User click login button on login screen",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "User should be directed to homescreen",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "User can see product matches",
  "keyword": "And "
});
formatter.examples({
  "line": 30,
  "name": "",
  "description": "",
  "id": "login-into-account;login-to-account-with-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 31,
      "id": "login-into-account;login-to-account-with-credentials;;1"
    },
    {
      "cells": [
        "putwid",
        "tester123"
      ],
      "line": 32,
      "id": "login-into-account;login-to-account-with-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 17765318176,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Login to account with credentials",
  "description": "",
  "id": "login-into-account;login-to-account-with-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 21,
      "name": "@ios"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "User navigates to onboarding screen by click next",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "User click login button on onboarding screen",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User input \"putwid\" username and \"tester123\" password",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User click login button on login screen",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "User should be directed to homescreen",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "User can see product matches",
  "keyword": "And "
});
formatter.match({
  "location": "OnBoardingSteps.user_navigates_to_onboarding_screen_by_click_next()"
});
formatter.result({
  "duration": 5734863617,
  "status": "passed"
});
formatter.match({
  "location": "OnBoardingSteps.user_click_login_button_on_onboarding_screen()"
});
formatter.result({
  "duration": 911676189,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "putwid",
      "offset": 12
    },
    {
      "val": "tester123",
      "offset": 34
    }
  ],
  "location": "LoginSteps.user_input_something_username_and_something_password(String,String)"
});
