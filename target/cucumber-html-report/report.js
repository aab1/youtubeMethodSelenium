$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/GetAQuote.feature");
formatter.feature({
  "line": 1,
  "name": "Get car insurance quote from AXA",
  "description": "In order to get my a quote \r\nAs a potential Axa insurance customer\r\nI want to be able to get the quote online",
  "id": "get-car-insurance-quote-from-axa",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Get the quote online",
  "description": "",
  "id": "get-car-insurance-quote-from-axa;get-the-quote-online",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I navigate to Axa website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Axa get quote section is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter my name",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I enter date of birth",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "i enter my gender",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter email address",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter my phone number",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I select yes I know my eirocode",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter my eircode",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click find address",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click the checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I select type of household",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I select employment status",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I select occupation",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click continue",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "your car section is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "GetQuoteSteps.i_navigate_to_Axa_website()"
});
formatter.result({
  "duration": 18525205949,
  "status": "passed"
});
formatter.match({
  "location": "GetQuoteSteps.axa_get_quote_section_is_displayed()"
});
formatter.result({
  "duration": 117777915,
  "status": "passed"
});
formatter.match({
  "location": "GetQuoteSteps.i_enter_my_name()"
});
formatter.result({
  "duration": 535974476,
  "status": "passed"
});
formatter.match({
  "location": "GetQuoteSteps.i_enter_date_of_birth()"
});
formatter.result({
  "duration": 433152299,
  "status": "passed"
});
formatter.match({
  "location": "GetQuoteSteps.i_enter_my_gender()"
});
formatter.result({
  "duration": 163166680,
  "status": "passed"
});
formatter.match({
  "location": "GetQuoteSteps.i_enter_email_address()"
});
formatter.result({
  "duration": 157514800,
  "status": "passed"
});
formatter.match({
  "location": "GetQuoteSteps.i_enter_my_phone_number()"
});
formatter.result({
  "duration": 306070906,
  "status": "passed"
});
formatter.match({
  "location": "GetQuoteSteps.i_select_yes_I_know_my_eirocode()"
});
formatter.result({
  "duration": 150821343,
  "status": "passed"
});
formatter.match({
  "location": "GetQuoteSteps.i_enter_my_eircode()"
});
formatter.result({
  "duration": 145676566,
  "status": "passed"
});
formatter.match({
  "location": "GetQuoteSteps.i_click_find_address()"
});
formatter.result({
  "duration": 7250353812,
  "status": "passed"
});
formatter.match({
  "location": "GetQuoteSteps.i_click_the_checkbox()"
});
formatter.result({
  "duration": 6057878173,
  "status": "passed"
});
formatter.match({
  "location": "GetQuoteSteps.i_select_type_of_household()"
});
formatter.result({
  "duration": 135448974,
  "status": "passed"
});
formatter.match({
  "location": "GetQuoteSteps.i_select_employment_status()"
});
formatter.result({
  "duration": 161236343,
  "status": "passed"
});
formatter.match({
  "location": "GetQuoteSteps.i_select_occupation()"
});
formatter.result({
  "duration": 172394891,
  "status": "passed"
});
formatter.match({
  "location": "GetQuoteSteps.i_click_continue()"
});
formatter.result({
  "duration": 63614063,
  "error_message": "org.openqa.selenium.ElementNotVisibleException: element not visible\n  (Session info: chrome\u003d56.0.2924.87)\n  (Driver info: chromedriver\u003d2.27.440174 (e97a722caafc2d3a8b807ee115bfb307f7d2cfd9),platform\u003dWindows NT 10.0.14393 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 29 milliseconds\nBuild info: version: \u0027unknown\u0027, revision: \u00271969d75\u0027, time: \u00272016-10-18 09:43:45 -0700\u0027\nSystem info: host: \u0027Yemi-PC\u0027, ip: \u0027192.168.1.6\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.27.440174 (e97a722caafc2d3a8b807ee115bfb307f7d2cfd9), userDataDir\u003dC:\\Users\\adeyemi\\AppData\\Local\\Temp\\scoped_dir10064_10677}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d56.0.2924.87, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: f8036151b65887d3d4854929e9682cab\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:216)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:168)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:635)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:274)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat cucumber.steps.GetQuoteSteps.i_click_continue(GetQuoteSteps.java:164)\r\n\tat ✽.And I click continue(features/GetAQuote.feature:21)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "GetQuoteSteps.your_car_section_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
});