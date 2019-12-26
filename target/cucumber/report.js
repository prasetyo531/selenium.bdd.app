$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login into account",
  "description": "\nIn order to perform sucessfull login\nAs user that have complete profile\nI should see greeting text, search bar, notification, ads",
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
  "name": "User input \"\u003cusername\u003e\" username and \"\u003cpassword\u003e\" password",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User click login button on login screen",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User should be directed to homescreen",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User can see product matches",
  "keyword": "And "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "login-into-account;login-to-account-with-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 17,
      "id": "login-into-account;login-to-account-with-credentials;;1"
    },
    {
      "cells": [
        "putwid",
        "tester123"
      ],
      "line": 18,
      "id": "login-into-account;login-to-account-with-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 51985554900,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
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
  "name": "User input \"putwid\" username and \"tester123\" password",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User click login button on login screen",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User should be directed to homescreen",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User can see product matches",
  "keyword": "And "
});
formatter.match({
  "location": "OnBoardingSteps.user_navigates_to_onboarding_screen_by_swipe()"
});
formatter.result({
  "duration": 11554266208,
  "status": "passed"
});
formatter.match({
  "location": "OnBoardingSteps.user_click_login_button_on_onboarding_screen()"
});
formatter.result({
  "duration": 1596243097,
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
formatter.result({
  "duration": 4554593244,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_click_login_button_on_login_screen()"
});
formatter.result({
  "duration": 1124400679,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.User_should_be_directed_to_homescreen()"
});
formatter.result({
  "duration": 9804193746,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_can_see_product_matches()"
});
formatter.result({
  "duration": 1163942443,
  "status": "passed"
});
formatter.after({
  "duration": 520995,
  "status": "passed"
});
});