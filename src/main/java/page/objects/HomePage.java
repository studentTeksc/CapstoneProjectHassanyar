package page.objects;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
public class HomePage extends Base{
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	// Locators for Scenario: User verify currency values change
	@FindBy(xpath = "//div[@class='pull-left']")
	private WebElement currency;
	public void clickOnCurrency() {
		currency.click();
	}
	@FindBy(xpath="//button[@class='currency-select btn btn-link btn-block']")
	private WebElement choseEuro;
	public void selectEuroCurrency() {
		choseEuro.isSelected();
	    choseEuro.isEnabled();
	    choseEuro.isDisplayed();
	}
	// Locators for Scenario: User empty Shopping cart message displays 
	  @FindBy(xpath="(//i[@class='fa fa-shopping-cart'])[1]")
	  private WebElement emptyShopptingCart;
	  public void clickOnEmptyShoppingCart() {
		 }
	  @FindBy(id="content")
	  private WebElement shoppingCartMessage;
	  public boolean isEmptyShoppingCartMessage() {
		  if(shoppingCartMessage.isDisplayed()) {
			  return true;
		  }else {
			  return false;
		  }
	  }
	  
	
}
