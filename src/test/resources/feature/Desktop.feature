@desktopTest
Feature: Desktop home page 

Background:
Given User is on Retail website
When User Click on Desktops tab
And User click on Show all desktops
And User click add to Cart button 
And User select quantity 1 
Scenario: User verify all items are present in Desktops tab
Then user see all items are present in Desktops 


Scenario: User add HP LP 3065 from Desktops tab to the cart
And User click on HP LP 3065 desktop 
And User select quantity 1 
Then User should see a message ‘Success: you have added HP LP 3065 to your Shopping cart!

Scenario: User add Canon EOS 5D from Desktops tab to the cart
And User click on Canon EOS 5D img 
And User select color from dropdown ‘Red’
Then User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’