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
	@FindBy(xpath = "//a[normalize-space()='Laptops & Notebooks']")
	private WebElement laptopsAndNotebooksLink;

	@FindBy(xpath = "//a[normalize-space()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndNotebooks;

	@FindBy(xpath = "//a[normalize-space()='MacBook']")
	private WebElement macBookItem;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartBlueButton;

	@FindBy(xpath = "//div[text()='Success: You have added ']//a[text()='MacBook']")
//	div[@class='alert alert-success alert-dismissible']
	private WebElement macBookSuccessMessageAddToCart;

	@FindBy(xpath = "//h2[normalize-space()='$602.00']")
	private WebElement amountText;

	@FindBy(xpath = "//span[text()=' 1 item(s) - $602.00']")
	private WebElement blackCartButton;

	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement cartRemoveButton;

	@FindBy(xpath = "//span[text()=' 0 item(s) - $0.00']")
	private WebElement blackCartEmptyButton;
	public void clickOnLaptopAndNotebook() {
		laptopsAndNotebooksLink.click();
	}

	public void clickOnShowAllLaptopsAndNotebooks() {
		showAllLaptopsAndNotebooks.click();
	}

	public void clickOnMacBookItem() {
		macBookItem.click();
	}

	public void clickOnAddCartMacBookBlue() {
		addToCartBlueButton.click();
	}

	public boolean isCartSuccessMessageDisplayed() {
		if (macBookSuccessMessageAddToCart.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isItemAddedToBlackCartDisplayed() {
		String actualPurchaseValue = amountText.getText();
		String expectePurchaseValue = "$602.00";
		if (blackCartButton.isDisplayed() && actualPurchaseValue.equals(expectePurchaseValue)) {
			return true;
		} else {
			return false;
		}
	}

	public void clickOnBlackCart() {
		blackCartButton.click();
	}

	public void clickOnRedRemoveButton() {
		cartRemoveButton.click();
	}

	public boolean isItemRemovedFromBlackCartDisplayed() {
		if (blackCartEmptyButton.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	}

