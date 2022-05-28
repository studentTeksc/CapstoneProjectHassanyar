@RetailPage
Feature: Retail Page 

Background:

 When user click on MyAccount
 And user click on Login option
 And user enter userName "makbarh444@gmail.com"  and password "Akbar@123"
 And user click on login button
 
  Scenario: login to Retail Website
  Then user should be logged into myAccount Page

Scenario: Register as an Affiliate user with Cheque Payment Method
When User click on ‘Register for an Affiliate Account’ link 
And User fill affiliate form with below information
|company|website|taxID|paymentMethod|
|Jahid|www.bbc.com|60|Cheque|
And User check on About us check box 
And User click on Continue button Icon
Then User should see a success message

Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
When User click on ‘Edit your affiliate informationlink 
And user click on Bank Transfer radio button
And User fill Bank information with below information
|bankName|abaNumber|swiftCode|accountName|accountNumber|
|Bank of America|000345|2023|Checking|000098876578456|
And User click on Continue button option
Then User should see a successfull message 

Scenario: Edit your account Information 
When User click on ‘Edit your account information’ link 
And User modify below information 
|firstname|lastName|email|telephone|
|Mohammad Akbar|Hassanyar|makbarh444@gmail.com|2404233916|
And User click on continue button 
Then User should see a message ‘Success: Your account has been successfully updated.

