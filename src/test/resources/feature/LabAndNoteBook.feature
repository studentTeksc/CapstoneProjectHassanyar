
Feature: Add and Remove a book from Cart
@assignment
Scenario: Add and Remove a Mac book from Cart
And User click on MacBook item 
And User click add to Cart button for Mac Book 
Then User should see a message ‘Success: You have added MacBook to your shopping cart!’
And User should see ' 1 items' showed to the cart
And User click on cart option 
And user click on red X button to remove the item from cart
Then item should be removed and cart should show ' 0 items'
