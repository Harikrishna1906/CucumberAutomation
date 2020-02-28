Feature: Ecommerce search

@SeleniumTest
Scenario: Search Results
Given User is on the Landing page
When user searches for the "Cucumber" vegetable
Then "Cucumber" results should be displayed


@Addtocart
Scenario: Search Results
Given User is on the Landing page
When user searches for the "Brinjal" vegetable
And adds "Brinjal" to the cart
And navigates to the cart
Then Verify "Brinjal" is displayed in the cart