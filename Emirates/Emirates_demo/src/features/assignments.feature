#Assignment Q1
Feature: Emirates Flight Booking
Scenario Outline: User should be able to search the flight
Given User opens application "https://www.emirates.com/ae/english/"
When user selects "<departure>" and "<arrival>" destinations
And user selects flight "<Type>"
And user selects the flight date multiple dates if flight is return/oneway
Then Validate the Flight listing

Examples:
|departure|arrival|Type|
|pune|Dubai|oneway|

