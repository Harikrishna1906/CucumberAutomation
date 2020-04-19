Feature: Ecommerce search

@SeleniumTest
Scenario: Search Results
Given User is on the Landing page
When user searches for the Cucumber vegetable
Then "Cucumber" results should be displayed


@Addtocart
Scenario Outline: Search Results
Given User is on the Landing page
When user searches for the <VegetableNames> vegetable
And adds <VegetableNames> to the cart
And navigates to the cart
Then Verify <VegetableNames> is displayed in the cart

Examples:
|VegetableNames|
|Brinjal |
|Beetroot|
