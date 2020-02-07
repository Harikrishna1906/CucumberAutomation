Feature: Application Login

@SmokeTest
Scenario: Dashboard screen after Login
Given User is on the Banks Landing page
When User enters the valid Username "Harikrishna" and Password "Revolution"
Then Customer dashboard is displayed
And Customers info cards are displayed is "true"

@SanityTest
Scenario: Dashboard screen after Login
Given User is on the Banks Landing page
When User enters the valid Username "Joshnika" and Password "Evolution"
Then Customer dashboard is displayed
And Customers info cards are displayed is "false"


