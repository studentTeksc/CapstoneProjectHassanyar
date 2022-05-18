package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import page.objects.MacBookPrice;
import utilities.Utility;
public class MacBookPriceStepDef extends Base {

	MacBookPrice mBookPrice = new MacBookPrice();
	
	@And("User click on ‘MacBook Pro’ item")
	public void User_click_on_MacBook_Pro_item() {
		mBookPrice.clickOnMacBookProItem();
		logger.info("User click on ‘MacBook Pro’ item");
	}
	@Then("User should see ‘$2,000.00’ price tag is present on UI")
	public void User_should_see_the_price_tag_is_present_on_UI() {
		mBookPrice.isthePricDisplayed();
		logger.info("User should see ‘$2,000.00’ price tag is present on UI");
		Utility.takeScreenShot();
	}
}
