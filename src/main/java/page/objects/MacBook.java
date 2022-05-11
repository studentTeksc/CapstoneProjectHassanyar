package page.objects;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
public class MacBook extends Base {

	public MacBook() {
	   PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//a[@class ='dropdown-toggle'])[1]")
	private WebElement laptopAndNoteBooktab;
	public void clickOnLaptopAndNoteBooktab(){
		Actions action = new Actions(driver);
		action.moveToElement(laptopAndNoteBooktab).build().perform();
		}
	@FindBy(xpath="(//a[@class='see-all'])[1]")
	private WebElement showallLaptopAndNoteBookoption;
	public void clickOnshowallLaptopAndNoteBookoption() {
		showallLaptopAndNoteBookoption.click();
	}
	@FindBy(xpath="(//img[@class='img-thumbnail'])[1]")
	private WebElement macBookitem;
	public void clickOnMacBookitem() {
		macBookitem.click();
	}
	@FindBy(id="button-cart")
	private WebElement  addtoCartbutton;
	public void clickOnAddtoCartbutton() {
		addtoCartbutton.click();
	}
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
	public void clickOnSuccessMessage() {
		Assert.assertTrue(successMessage.isDisplayed());
		}
	@FindBy(id="cart-total")
	private WebElement item;
	public void itemDisplayed() {
		Assert.assertTrue(item.isDisplayed());
	}
	@FindBy(xpath="//a[@href='http://tek-school.com/retail/index.php?route=checkout/cart']")
	private WebElement shoppingcart;
	public void clickOnShoppingcart() {
		shoppingcart.click();
	}
	@FindBy(xpath="//i[@class ='fa fa-times-circle']")
	private WebElement  buttontoremove;
	public void clickOnbuttontoremove() {
		buttontoremove.click();
	}
	@FindBy(id="cart-total")
	private WebElement  showzeroitem;
	public void zeroItemisDisplayed(){
		Assert.assertTrue(showzeroitem.isDisplayed());
	}
	
}
