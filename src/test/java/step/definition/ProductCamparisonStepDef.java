package step.definition;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.ProductionComparison;
import utilities.Utility;
import core.Base;
public class ProductCamparisonStepDef extends Base{
	
	ProductionComparison product = new ProductionComparison();
			
	@Given("^User is on Retail website 'Laptop Scenario'$")
	public void user_is_on_retail_website() {
		String actualPageTitle = driver.getTitle();
		String expectPageTitle = "TEK SCHOOL"; 
		Assert.assertEquals(expectPageTitle, actualPageTitle);
		logger.info("actual page title equals expected page title");
		
	}
	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		product.clickOnLaptopAndNotebook();
		logger.info("User clicked on laptop and Notebooks Tab");
		
	}
	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		product.clickOnShowAllLaptopsAndNotebooks();
		logger.info("User clicked on show all laptop and Notebooks option");
		
	}
	
	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() {
	  product.clickOnproductcomparisIconOnMacBook();
	  logger.info("User click on product comparison icon on ‘MacBook");
	}
	@When("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
	    product.clickOnProductComparisonIconOnMacBookAir();
	    logger.info("User click on product comparison icon on ‘MacBook Air");
	}
	@Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() {
	  Assert.assertTrue(product.isSuccessMessageComparisonMacBookAirDisplayed());
	logger.info("Added MacaBook Air Success Message is shown");
	}
	@And("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
	   product.clickOnProductComparisonLink();
	   logger.info("User click on Product comparison link");
	}
	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
	  Assert.assertTrue(product.isproductComparisonChartDisplayed());
	  logger.info("Product Comparison Chart is show");
	  Utility.takeScreenShot();
	}
}
