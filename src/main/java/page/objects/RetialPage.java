package page.objects;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
public class RetialPage extends Base{

	public RetialPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='My Account']")
	private WebElement myAccount;

	public void clickOnMyaccount() {
		myAccount.click();
	}
	
	@FindBy(xpath="(//a[@href='http://tek-school.com/retail/index.php?route=account/login'])[1]")
	private WebElement loginoption;
	public void clickOnloginOption() {
		loginoption.click();
	}
	
	@FindBy(id = "input-email")
	private WebElement emailInput;
	public void enterEmail(String emailValue) {
		emailInput.sendKeys("emailValue");
	}
	
	@FindBy(id = "input-password")
	private WebElement passwordInput;
	public void enterPassword(String passwordValue) {
		passwordInput.sendKeys(passwordValue);
	}
	
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement login;
	public void clickOnLoginButton() {
		login.click();
	}
	
	
		public boolean MyAccountTextIsPresent() {
		if(myAccount.isDisplayed())
		return true;
		else
			return false;
				
	}
		//<================================>
		@FindBy(xpath = "//a[@href='http://tek-school.com/retail/index.php?route=account/affiliate/edit']")
		private WebElement affiliateAccount;
		public void clicOnAffiliateAccountLink() {
			affiliateAccount.click();
		}
		@FindBy(id="input-company")
		private WebElement companyField;
		public void enterCompanyName(String CompanyNameValue) {
			companyField.sendKeys(CompanyNameValue);
		}
		@FindBy(id="input-website")
		private WebElement webSiteField;
		public void enterWebSiteName(String WebsiteNameValue) {
			webSiteField.sendKeys(WebsiteNameValue);
		}
		@FindBy(id="input-tax")
		private WebElement taxIdField;
		public void enterTaxId(String TaxIdValue) {
			taxIdField.sendKeys(TaxIdValue);
		}
		@FindBy(xpath="//input[@checked='checked']")
		private WebElement chequeOption;
		public void selectChecqueOpion() {
			chequeOption.isSelected();
			chequeOption.isEnabled();
			chequeOption.isDisplayed();
		}
		@FindBy(id="input-cheque")
		private WebElement chequeNameField;
		public void chequeField(String ChequeNameValue) {
			chequeNameField.sendKeys(ChequeNameValue);
		}
//		@FindBy(xpath="//input[@name='agree']")
//		private WebElement privacyAffiliate;
//		public void clickOnprivacy() {
//			privacyAffiliate.click();
//		}
		@FindBy(xpath="//input[@class='btn btn-primary']")
		private WebElement continueButtonOne;
		public void clickOncontinueButtonAffilivate() {
			continueButtonOne.click();
		}
		@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
		private WebElement SuccessMessage;
		public String getSuccessMessageshown() {
			String actualMessage = SuccessMessage.getText();
			return actualMessage;
		}
		//<================================>
		@FindBy(xpath="//a[@href='http://tek-school.com/retail/index.php?route=account/affiliate/edit']")
		private WebElement editAffiliateInfo;
		public void clickOnEditAffiliateInfoForBank() {
			editAffiliateInfo.click();
			}
		@FindBy(xpath="(//div[@class='radio'])[3]")
		private WebElement bankTransferRadioButton;
		public void clickOnBankTransferRadioBatton() {
			bankTransferRadioButton.click();
		}
		@FindBy(id="input-bank-name")
		private WebElement BankNameField;
		public void enterBankNameField(String BankNameValue) {
			BankNameField.sendKeys(BankNameValue);
		}
		@FindBy(id="input-bank-branch-number")
		private WebElement bankBranchNumber;
		public void enterBankBranchNumber(String BranchNumberValue) {
			bankBranchNumber.sendKeys(BranchNumberValue);
		}
		@FindBy(id="input-bank-swift-code")
		private WebElement inputSWIFTCode;
		public void enterInputSWIFTCode(String SwiftCodeValue) {
			inputSWIFTCode.sendKeys(SwiftCodeValue);
					
		}
		@FindBy(id="input-bank-account-name")
		private WebElement inputAccountName;
		public void enterInputAccountName(String AccountNameValue) {
			inputAccountName.sendKeys(AccountNameValue);
			}
		@FindBy(id="input-bank-account-number")
		private WebElement inputBankAccountNumber;
		public void enterInputBankAccountNumber(String BankAccountNumberValue) {
			inputBankAccountNumber.sendKeys(BankAccountNumberValue);
		}
		@FindBy(xpath="//input[@value='Continue']")
		private WebElement ContinueButtonBox;
		public void clickOnContinueButtonBox() {
			ContinueButtonBox.click();
		}
		@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
		private WebElement shouldSeeASuccessMessage;
		public boolean isUserShouldSeeASuccessMessageDisplayed() {
			return shouldSeeASuccessMessage.isDisplayed();
		}
		
		//<==================================>
		
		@FindBy(xpath = "//a[normalize-space()='Edit your account information']")
		private WebElement editAccountInformationLink;
		public void clickOnEditAffiliateInformatinLink() {
			editAccountInformationLink.click();
		}

		@FindBy(xpath = "//input[@id='input-firstname']")
		private WebElement inputFirstName;
	    public void enterFirstName(String firstNameValue){
	    	inputFirstName.sendKeys(firstNameValue);
	    }

		@FindBy(xpath = "//input[@id='input-lastname']")
		private WebElement inputLastName;
		public void enterLastName(String lastNameValue) {
			inputLastName.sendKeys(lastNameValue);
		}
	  


		@FindBy(xpath = "//input[@id='input-email']")
		private WebElement inputEmail;
	    public void enterEmailTwo(String emailValue) {
	    	inputEmail.sendKeys(emailValue);
	    }


		@FindBy(xpath = "//input[@id='input-telephone']")
		private WebElement inputTelePhone;
	    public void enterTelephone(String telephoneValue) {
	    	inputTelePhone.sendKeys(telephoneValue);
	    }
	    @FindBy(xpath="//input[@value='Continue']")
	    private WebElement continueButtonTwo;
	    public void clickOnContinueButtonE() {
	    	continueButtonTwo.click();
	    }

		@FindBy(xpath = "//div[text()=' Success: Your account has been successfully updated.']")
		private WebElement GetsuccessMessageEditAccountInfo;
		public String successMessageEditAccountInfo() {
			String actualMessage =  GetsuccessMessageEditAccountInfo.getText();
			return actualMessage;
		}
}





