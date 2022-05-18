package step.definition;
import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.wishList;
import utilities.Utility;
public class WishListStepDef extends Base{
        wishList heartIcon = new wishList();
        
        @When ("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
        public void user_click_on_heart_icon_add_Sony_VaIO_laptop_to_wish_list() {
        	heartIcon.clickOnheartIconLaptopWishList();
        	logger.info("User click on heart icon to add ‘Sony VaIO’ laptop to wish list");
}
        @Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list")
        public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() {
	 Assert.assertTrue(heartIcon.isalertsuccessMessageDisplayed());
	 logger.info("alertSuccessMessage");
	 Utility.takeScreenShot();
}

}
