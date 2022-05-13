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
	

	@When("User click on Laptop &NoteBook tab")
	public void User_click_on_Laptop_and_NoteBook_tab() {
		mackbookpage.clickOnLaptopAndNoteBooktab();
		logger.info("User click on Laptop &NoteBook tab");
	}
	@And("User click on Show all Laptop &NoteBook option")
	public void User_click_on_Show_all_Laptop_and_NoteBook_item() {
		mackbookpage.clickOnshowallLaptopAndNoteBookoption();
		logger.info("User click on Show all Laptop &NoteBook option");
	}
	@And("User click on MacBook item")
	public void User_click_on_MacBook_item() {
		mackbookpage.clickOnMacBookitem();
		logger.info("User click on MacBook item");
	}
	@And("User click add to Cart button")
	public void User_click_add_to_Cart_button() {
		mackbookpage.clickOnAddtoCartbutton();
		logger.info("User click add to Cart butto");
	}
	@Then("User should see a message ‘Success: You have added MacBook to your shopping cart!’")
	public void User_should_see_a_message_Success_You_have_added_MacBook_to_your_shopping_cart() {
		mackbookpage.itemDisplayed();
	}
	@And("User should see ‘item(s)-602.00’ showed to the cart")
	public void User_should_see_item__showed_to_the_cart() {
		mackbookpage.itemDisplayed();
		logger.info("User click add to Cart butto");
	}
	@And("User click on cart option")
	public void User_click_on_cart_opion() {
		mackbookpage.clickOnAddtoCartbutton();
		logger.info("User click on cart option");
	}
	@And("User click on red X button to remove the item from cart")
	public void User_click_on_red_X_button_to_remove_the_item_from_cart() {
		mackbookpage.clickOnAddtoCartbutton();
		logger.info("User click on red X button to remove the item from cart");
	}
	@Then("item should be removed and cart should show ‘0 item(s)’")
	public void item_should_be_removed_and_cart_should_show_zero_item() {
		mackbookpage.zeroItemisDisplayed();
	}
	
}





