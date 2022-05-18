Feature: Product Camparison

@Camparison

Scenario: Product Comparison 

When User click on product comparison icon on ‘MacBook’
When User click on product comparison icon on ‘MacBook Air
Then User should see a message ‘Success: You have added MacBook Air to your product comparison!’
And User click on Product comparison link 
Then User should see Product Comparison Chart

