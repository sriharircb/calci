Feature: automation calculator

Scenario: Add two numbers
Given Launch calculator app
When click on digit 6
And click on + operator
And click on digit 6
And click on equals operator
Then result should display as 12