Feature: Ecommerce search

Scenario: Search Results
Given User is on the Landing page
When user searches for the "Cucumber" vegetable
Then "cucumber" results should be displayed