Feature: Application Login

Scenario: Dashboard screen after Login
Given User is on the Banks Landing page
When User enters the valid Username "Harikrishna" and Password "Revolution"
Then Customer dashboard is displayed
And Customers info cards are displayed is "true"


Scenario: Dashboard screen after Login
Given User is on the Banks Landing page
When User enters the valid Username "Joshnika" and Password "Evolution"
Then Customer dashboard is displayed
And Customers info cards are displayed is "false"


Scenario: Dashboard screen after Login
Given User is on the Banks Landing page
When User enters the below details
| Harikrishna | Revolution | Fresh Living Appartments | Madhapur | Hyderabad |
Then Customer dashboard is displayed
And Customers info cards are displayed is "False"


Scenario Outline: Login Multiple Times
Given User is on the Banks Landing page
When User enters the correct <Username> and <Password>
Then Customer dashboard is displayed
And Customers info cards are displayed is "true"

Examples:
| Username | Password  |
| Hari     | Krishna   |
| Joshnika | Swarna    |
| Pushpa   | Latha     |
| Mounica  | Nareddy   |
| Ved      | Rishikesh |

