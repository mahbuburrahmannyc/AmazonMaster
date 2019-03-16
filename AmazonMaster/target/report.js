$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AmazonSignIn.feature");
formatter.feature({
  "line": 2,
  "name": "LogIn",
  "description": "\r\nDescription:Amazon LogIn",
  "id": "login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Positive",
  "description": "",
  "id": "login;positive",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "User on Amazon Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User click sign in",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enter UserName",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User enter Password",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User Click signIn Button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User Successfully LogIn",
  "keyword": "Then "
});
formatter.match({
  "location": "LogInStepDef.user_on_Amazon_Home_page()"
});
formatter.result({
  "duration": 7214161298,
  "status": "passed"
});
formatter.match({
  "location": "LogInStepDef.user_click_sign_in()"
});
formatter.result({
  "duration": 1885459008,
  "status": "passed"
});
formatter.match({
  "location": "LogInStepDef.user_enter_UserName()"
});
formatter.result({
  "duration": 179849411,
  "status": "passed"
});
formatter.match({
  "location": "LogInStepDef.user_enter_Password()"
});
formatter.result({
  "duration": 86676509,
  "status": "passed"
});
formatter.match({
  "location": "LogInStepDef.user_Click_signIn_Button()"
});
formatter.result({
  "duration": 12083489547,
  "status": "passed"
});
formatter.match({
  "location": "LogInStepDef.user_Successfully_LogIn()"
});
formatter.result({
  "duration": 58799780,
  "status": "passed"
});
});