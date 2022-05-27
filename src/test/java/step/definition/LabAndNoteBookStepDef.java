package step.definition;
import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.MacBook;
public class MacBookStepDef extends Base{
	
	MacBook mackbookpage = new MacBook();
//	@Given("^User is on Retail website 'Laptop Scenario'$")
//	public void user_is_on_retail_website() {
//		String actualPageTitle = driver.getTitle();
//		String expectPageTitle = "TEK SCHOOL"; 
//		Assert.assertEquals(expectPageTitle, actualPageTitle);
//		logger.info("actual page title equals expected page title");
//		//UtilityClass.takeScreenShot(); 
//	}
//	@When("User click on Laptop &NoteBook tab")
//	public void user_click_on_laptop_note_book_tab() {
//		mackbookpage.clickOnLaptopAndNotebook();
//		logger.info("User clicked on laptop and Notebooks Tab");
//		//UtilityClass.takeScreenShot(); 
//	}
//	@When("User click on Show all Laptop &NoteBook option")
//	public void user_click_on_show_all_laptop_note_book_option() {
//		mackbookpage.clickOnShowAllLaptopsAndNotebooks();
//		logger.info("User clicked on show all laptop and Notebooks link");
//		//UtilityClass.takeScreenShot(); 
//	}
	@When("User click on MacBook item")
	public void user_click_on_mac_book_item() {
		mackbookpage.clickOnMacBookItem();
		logger.info("User clicked on Mac Book item");
		//UtilityClass.takeScreenShot(); 
	}
	@When("User click add to Cart button for Mac Book")
	public void user_click_add_to_cart_button_for_mac_book() {
		mackbookpage.clickOnAddCartMacBookBlue();
		logger.info("User clicked on Blue Add To Cart Button for MacBook");
		//UtilityClass.takeScreenShot(); 
	}
	//one method missing here 

	@Then("^User should see a message ‘Success: You have added MacBook to your shopping cart!’$")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() {
		Assert.assertTrue(mackbookpage.isCartSuccessMessageDisplayed());
		logger.info("Add to Cart Success Message is shown");
	//	UtilityClass.takeScreenShot(); 
		
	}
	@When("^User should see ' 1 items' showed to the cart$")
	public void user_should_see_showed_to_the_cart() {
		Assert.assertTrue(mackbookpage.isItemAddedToBlackCartDisplayed());
		logger.info("'1-Items-602' message showed on the black cart!");
		//UtilityClass.takeScreenShot(); 
	}
	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		mackbookpage.clickOnBlackCart();
		logger.info("User clicked on black cart button again");
		//UtilityClass.takeScreenShot(); 
	}
	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		mackbookpage.clickOnRedRemoveButton();
		logger.info("User clicked on Remove from Cart button");
		//UtilityClass.takeScreenShot(); 
	}
	@Then("^item should be removed and cart should show ' 0 items'$")
	public void item_should_be_removed_and_cart_should_show() {
		Assert.assertTrue(mackbookpage.isItemRemovedFromBlackCartDisplayed());
		logger.info("Items removed from the black card shown");
}

}
