$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login into account",
  "description": "",
  "id": "login-into-account",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login to account with credentials",
  "description": "",
  "id": "login-into-account;login-to-account-with-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@android"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user swipe images onboarding screen",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user directed to login form",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enters the \"\u003cusername\u003e\" username",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enter the \"\u003cpassword\u003e\" password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user should be directed to homepage",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "login-into-account;login-to-account-with-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 14,
      "id": "login-into-account;login-to-account-with-credentials;;1"
    },
    {
      "cells": [
        "testqa",
        "test123"
      ],
      "line": 15,
      "id": "login-into-account;login-to-account-with-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 48480113831,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Login to account with credentials",
  "description": "",
  "id": "login-into-account;login-to-account-with-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@android"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user swipe images onboarding screen",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on the login button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user directed to login form",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enters the \"testqa\" username",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enter the \"test123\" password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user should be directed to homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "OnBoardingSteps.user_swipe_images_onboarding_screen()"
});
formatter.result({
  "duration": 37797785733,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 10952857927,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_directed_to_login_form()"
});
formatter.result({
  "duration": 1391939,
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat stepDefinitions.LoginSteps.user_directed_to_login_form(LoginSteps.java:14)\n\tat ✽.Then user directed to login form(Login.feature:7)\n",
  "status": "pending"
});
formatter.match({
  "arguments": [
    {
      "val": "testqa",
      "offset": 17
    }
  ],
  "location": "LoginSteps.user_enters_the_something_username(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "test123",
      "offset": 16
    }
  ],
  "location": "LoginSteps.user_enter_the_something_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.user_clicks_on_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.user_should_be_directed_to_homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 412787,
  "status": "passed"
});
});