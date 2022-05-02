Feature: Special characters
Scenario: User should check if special characters allowed in subscribe news letter popup
Given User should launch chrome and launch URL and maximize
When User should type special characters in e-mail
And User should click Subscribe button
Then User should get Thanks for subscribing text and close window