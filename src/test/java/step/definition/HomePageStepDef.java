package step.definition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePage;
import utilities.Utility;

import org.junit.Assert;

import core.Base;
public class HomePageStepDef extends Base{
	
	HomePage homePage = new HomePage();
	
	@When("User click on Currency")
	public void user_click_on_currency() {
		homePage.clickOnCurrency();
	   logger.info("User click on Currency");
	  }
	
	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homePage.selectEuroCurrency();
		logger.info("User Chose Euro from dropdown");
		}
	
	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		}
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homePage.clickOnEmptyShoppingCart();
	    logger.info("User click on shopping cart");
	}
	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() {
		homePage.isEmptyShoppingCartMessage();
	   logger.info("Your shopping cart is empty!” message should display");
	   Utility.takeScreenShot();
	}
	
	
}
