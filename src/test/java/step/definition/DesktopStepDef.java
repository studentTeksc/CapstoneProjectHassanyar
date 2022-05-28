package step.definition;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopPage;
import page.objects.HomePage;
import utilities.Utility;

public class DesktopStepDef extends Base {
	DesktopPage desktopsPage = new DesktopPage();

	@Given("User is on Retail website")
	public void userIsOnRuser_is_on_retail_home_pageetailHomePage() {
		Assert.assertTrue(desktopsPage.isLogoDisplayed());
		logger.info("User is on Retail website");
	}

	@When("User Click on Desktops tab")
	public void user_click_on_Desktops_tab() {
		desktopsPage.clickOnDesktopTab();
		logger.info("User Click on Desktops tab");

	}

	@And("User click on Show all desktops")
	public void user_click_On_Show_all_desktops() {
		desktopsPage.clickOnShowAllDesktops();
		logger.info("User click on Show all desktops");
	}

	@Then("user see all items are present in Desktops")
	public void user_should_see_all_items_are_present_in_Desktops_page() {
		List<WebElement> items = desktopsPage.elements();
		for (WebElement element : items) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("alt") + " is present in this page");
		}
		Utility.takeScreenShot();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
//@And("^User click ADD TO CART option on 'HP LP(\\d+)' item$")
//public void User_click_ADD_TO_CART_option_on_HP_LP_item() {
	// desktopsPage.clickOnAddToCartButton();
	// logger.info("^User click ADD TO CART option on 'HP LP(\\\\d+)' item$");
	// Utility.takeScreenShot();
	// }

	@When("User click on HP LP 3065 desktop")
	public void User_click_on_HP_LP_3065_desktop() {
		desktopsPage.clickOnHPLaptopAddToCartButton();
		logger.info("user clicked add to cart button option on 'hp lp item");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@And("User select quantity 1")
	public void User_select_quantity_1() {
		desktopsPage.selectQuantity();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@And("User click add to Cart button")
	public void User_click_add_to_Cart_button() {
		desktopsPage.clickOnAddtoCarButton();
		logger.info("User click add to Cart button");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("User should see a message ‘Success: you have added HP LP 3065 to your Shopping cart!")
	public void User_should_see_a_message_Success_have_added_HP_LP_3065_to_your_shopping_cart() {
		desktopsPage.isSuccessMessageDisplayed();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@And("User click on Canon EOS 5D img")
	public void User_click_on_Canon_EOS_5D_img() {
		//desktopsPage.clickOnCanonCamera();
		logger.info("User click on Canon EOS 5D img");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@And("User select color from dropdown ‘Red’")
	public void User_select_color_from_dropdown_Red() {
		desktopsPage.selectQuantityCamera();
		logger.info("User select color from dropdown Red");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//@And("User select quantity 1")
//public void User_select_quantity_1() {
//	desktopsPage.selectQuantityCamera();
//	logger.info("User select quantity 1");
//	 try {
//			Thread.sleep(2000);
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}
//	
//}
//@And("User click add to Cart button")
//public void User_click_add_to_Cart_button() {
//	desktopsPage.clickOnAddToCartButtonCamera2();
//	logger.info("User click add to Cart button");
//	
//	 try {
//			Thread.sleep(2000);
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}
//}
	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void User_should_see_a_message_Success_you_have_added_Canon_EOS_5D_to_your() {
		desktopsPage.isSuccessMessageDisplayed();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
