package step.definition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

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
		desktopsPage.clickOnDeskTopTab(); 
		logger.info("User Click on Desktops tab");
	}
	@And("User click on Show all desktops")
	public void user_click_On_Show_all_desktops() {
		desktopsPage.clickOnShowAllDesktops();
		logger.info("User click on Show all desktops");
	}
	@Then("user see all items are present in Desktops")
	public void user_should_see_all_items_are_present_in_Desktops_page() {
			Assert.assertTrue(desktopsPage.isLogoDisplayed());
			logger.info("user see all items are present in Desktops");
				
		 }

	@When("User click on HP LP 3065 desktop")
	public void User_click_on_HP_LP_3065_desktop() {
		desktopsPage.clickOnHPLaptopAddToCartButton();
		logger.info("user clicked add to cart button option on 'hp lp item");
	 }
	@And("User click add to Cart button")
	public void User_click_add_to_Cart_button() {
		desktopsPage.clickOnAddtoCarButton();
		logger.info("User click add to Cart button");
		}
	@Then("User should see a message ‘Success: you have added HP LP 3065 to your Shopping cart!")
	public void User_should_see_a_message_Success_have_added_HP_LP_3065_to_your_shopping_cart() {
		desktopsPage.isSuccessMessageDisplayed();
		}
		@When("User click ADD TO CART option on ‘Canon EOS 5D’ item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		desktopsPage.clickOnAddToCartTabOnCanonEOS5D();
	logger.info("user clicked on Add to Cart Tab");
	}
	@When("User click on select dropdown")
	public void user_click_on_select_dropdown() {
		desktopsPage.clickOnSelectDropdown();
	logger.info("user click on select dropdown");
	}
	@When("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red() {
	logger.info("user select color from dropdown red");
	}
	@When("User select quantity {int}")
	public void user_select_quantity(Integer int1) {
		desktopsPage.Qty("Qty");
	logger.info("User select quantity");
	}
	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
	Assert.assertTrue(desktopsPage.SuccessTextIsPresent());
	logger.info("user should see a message success:You have added canon eos 5d to your Shopping Cart ");
	}
	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktopsPage.clickOnCanonEOS5DCamera();
	logger.info("user click on canon eos 5d item");
	}
	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktopsPage.clickOnWriteareviewlink();
	logger.info("user click on write a review link");
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
	logger.info("user fill the review information ");
	}
	
	@When("User enter name {string} and review {string}")
	public void user_enter_name_and_review(String string, String string2) {
		desktopsPage.enterYourName(string);
	logger.info("user enter the Name " + string);
	desktopsPage.enterYourreview(string2);
	logger.info("user enter the review " +string2);
	}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		desktopsPage.clickOncontinueButton();
	logger.info("user click on continue button");
	}
	@Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”")
	public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() {
	Assert.assertTrue(desktopsPage.textMessageIsPresent());
	logger.info("user should see a message with Thank you for your review. It has been submitted to the webmaster for approval");
	Utility.takeScreenShot();
	}
    


	}




