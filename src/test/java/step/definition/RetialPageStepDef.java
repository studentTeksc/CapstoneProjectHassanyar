package step.definition;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.RetialPage;
import utilities.Utility;
public class RetialPageStepDef extends Base{
	RetialPage retialPage = new RetialPage();
	
	@When("user click on MyAccount")
	public void user_click_on_my_account() {
		retialPage.clickOnMyaccount();
		logger.info("user clicked on MyAccount");
		try {
			Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
	}

	@When("user click on Login option")
	public void user_click_on_login_option() {
		// Write code here that turns the phrase above into concrete actions
		retialPage.clickOnloginOption();
		logger.info("user clicked on login");
		try {
			Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
	}

	@When("user enter userName {string}  and password {string}")
	public void user_enter_user_name_and_password(String email, String pass) {
		// Write code here that turns the phrase above into concrete actions
		retialPage.enterEmail(email);
		logger.info("usder enter the userName" + email);
		retialPage.enterPassword(pass);
		logger.info("user enter the password" + pass);
		try {
			Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		retialPage.clickOncontinueButtonAffilivate();
		logger.info("user clicked on login button");
		try {
			Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
	}

	@Then("user should be logged into myAccount Page")
	public void user_should_be_logged_into_my_account_page() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(retialPage.MyAccountTextIsPresent());
		logger.info("user should be in MyAccount Page");
		try {
			Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
	}
	///<================================>
	
	@When("User click on ‘Register for an Affiliate Account’ link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		retialPage.clicOnAffiliateAccountLink();
	    logger.info("User click on ‘Register for an Affiliate Account’ link");
	    try {
			Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
	}
	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> information = dataTable.asMaps(String.class, String.class);
		retialPage.enterCompanyName(information.get(0).get("CompanyNameValue"));
		retialPage.enterWebSiteName(information.get(0).get("WebsiteNameValue"));
		retialPage.enterTaxId(information.get(0).get("TaxIdValue"));
		logger.info("User fill affiliate form with below information");
		try {
			Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}

	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	   
	}
	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retialPage.selectChecqueOpion();
		logger.info("User check on About us check box");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@When("User click on Continue button Icon")
	public void user_click_on_continue_button_Icon() {
		retialPage.clickOncontinueButtonAffilivate();
		logger.info("User click on Continue button");
		try {
			Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
	}
	@Then("User should see a success message")
	public void user_should_see_a_success_message(String expected) {
		logger.info("User should see a success message");
	Assert.assertEquals(expected, retialPage.getSuccessMessageshown());
	Utility.takeScreenShot();
	try {
		Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		
	}
		}
	//<======================>
	@When("User click on ‘Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {
	  logger.info("User click on ‘Edit your affiliate informationlink");
	  retialPage.clickOnEditAffiliateInfoForBank();
	  try {
			Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			
		}
	}
	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
	 logger.info("user click on Bank Transfer radio button");
	 retialPage.clickOnBankTransferRadioBatton();
	 try {
			Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			
		}
	}
	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> information = dataTable.asMaps(String.class, String.class);
		retialPage.enterBankNameField(information.get(0).get("BankNameValue"));
		retialPage.enterBankBranchNumber(information.get(0).get("BranchNumberValue"));
		retialPage.enterInputSWIFTCode(information.get(0).get("SwiftCodeValue"));
		retialPage.enterInputAccountName(information.get(0).get("AccountNameValue"));
		retialPage.enterInputBankAccountNumber(information.get(0).get("BankAccountNumberValue"));
		logger.info("User fill affiliate form with below information");
		try {
			Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	
	@And("User click on Continue button option")
public void User_click_on_Continue_button_option() {
		// TODO Auto-generated method stub
		logger.info("User click on Continue button option");
		retialPage.clickOnContinueButtonBox();
	}
	
	@Then("User should see a successfull message")
	public void User_should_see_a_successfull_message() {
		logger.info("User should see a success message");
		Assert.assertTrue(retialPage.isUserShouldSeeASuccessMessageDisplayed());
	}

//<=====================================>
	
	@When("User click on ‘Edit your account information’ link")
	public void user_click_on_edit_your_account_information_link() {
	    retialPage.clickOnEditAffiliateInformatinLink();
	    logger.info("User click on ‘Edit your account information’ link");
	    try {
			Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			
		}
	}
	@When("User modify below information")
	public void user_modify_below_information(io.cucumber.datatable.DataTable dataTable) {
	  List<Map<String, String>> info = dataTable.asMaps(String.class, String.class);
	  retialPage.enterFirstName(info.get(0).get("firstNameValue"));
	  retialPage.enterFirstName(info.get(0).get("lastNameValue"));
	  retialPage.enterFirstName(info.get(0).get("emailValue"));
	  retialPage.enterFirstName(info.get(0).get("telephoneValue"));
	  logger.info("User modify below information");
	  try {
			Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			
		}
		
	}
	@When("User click on continue button")
	public void user_click_on_continue_button() {
       retialPage.clickOnContinueButtonE();
       try {
   		Thread.sleep(2000);
   		}catch(InterruptedException e) {
   			e.printStackTrace();
   		
   	}
     }
	@Then("User should see a message ‘Success: Your account has been successfully updated.")
	public void user_should_see_a_message_success_your_account_has_been_successfully_updated(String expected) {
	logger.info("User should see a message ‘Success: Your account has been successfully updated");
	Assert.assertEquals(expected, retialPage.successMessageEditAccountInfo());
	try {
		Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		
	}
	}
	
}







