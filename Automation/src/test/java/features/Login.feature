Feature: Application Login

Scenario: Dashboard screen after Login
Given User is on the Banks Landing page
When User enters the valid Username and Password
Then Customer dashboard is displayed
And Customers info cards are displayed