package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;
public class loginPage extends Base{

	public loginPage() {
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
		emailInput.sendKeys(emailValue);
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

}
