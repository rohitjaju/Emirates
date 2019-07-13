$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("assignments.feature");
formatter.feature({
  "line": 1,
  "name": "Emirates Flight Booking",
  "description": "",
  "id": "emirates-flight-booking",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "User should be able to search the flight",
  "description": "",
  "id": "emirates-flight-booking;user-should-be-able-to-search-the-flight",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "User opens application \"https://www.emirates.com/ae/english/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user selects \u003cdeparture\u003e and \u003carrival\u003e destinations",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user selects flight \u003cType\u003e",
  "keyword": "And "
});
formatter.examples({
  "comments": [
    {
      "line": 6,
      "value": "#And user selects the flight date multiple dates if flight is return/oneway"
    },
    {
      "line": 7,
      "value": "#Then Validate the Flight listing"
    }
  ],
  "line": 9,
  "name": "",
  "description": "",
  "id": "emirates-flight-booking;user-should-be-able-to-search-the-flight;",
  "rows": [
    {
      "cells": [
        "departure",
        "arrival",
        "Type"
      ],
      "line": 10,
      "id": "emirates-flight-booking;user-should-be-able-to-search-the-flight;;1"
    },
    {
      "cells": [
        "pune",
        "Dubai",
        "oneway"
      ],
      "line": 11,
      "id": "emirates-flight-booking;user-should-be-able-to-search-the-flight;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "User should be able to search the flight",
  "description": "",
  "id": "emirates-flight-booking;user-should-be-able-to-search-the-flight;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "User opens application \"https://www.emirates.com/ae/english/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user selects pune and Dubai destinations",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user selects flight oneway",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});