package page.objects;

import java.util.List;

import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;

public class DesktopPage extends Base {

	public DesktopPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopTab;

	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;

	@FindBy(tagName = "img")
	private List<WebElement> items;

// find element for logo
	private WebElement logo;

	@FindBy(xpath = "(//span[text()='Add to Cart'])[3]")
	private WebElement clickOnHPLaptopAddToCartButton;

	@FindBy(xpath = "//input[@name='quantity']")
	private WebElement quantityHP;

	@FindBy(xpath = "//button[text()='Add to Cart']")
	private WebElement addToCartButton2;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;

	@FindBy(xpath = "(//div[@class='product-thumb'])[2]")
	private WebElement clickOnCameraImg;

	@FindBy(xpath = "(//select[@name='option[226]']//child::option[@value='15']")
	private WebElement selectOption;

	@FindBy(id="input-quantity")
	private WebElement quantityCamera;

	@FindBy(xpath = "//button[@class='btn btn-primary btn-lg btn-block']")
	private WebElement addToCartButtonCamra2;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement getsuccessMessage;

	public void clickOnShowAllDesktops() {
		showAllDesktops.click();
	}

	public boolean isLogoDisplayed() {
		if (logo.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickOnHPLaptopAddToCartButton() {
		clickOnHPLaptopAddToCartButton.click();
	}

	public void selectQuantity() {
		quantityHP.clear();
		quantityHP.sendKeys("1");

	}

	public void clickOnAddtoCarButton() {
		addToCartButton2.click();
	}

	public boolean isSuccessMessageDisplayed() {
		if (successMessage.isDisplayed())
			return true;

		else
			return false;
	}

	public String getSuccessMessage() {
		String actualMessage = getsuccessMessage.getText();
		return actualMessage;
	}

	public void clickOnDesktopTab() {
		Actions action = new Actions(driver);
		action.moveToElement(desktopTab).build().perform();
	}

	public void clickOnAddToCartButtonCamera2() {

	}

	public void selectQuantityCamera() {
		quantityCamera.click();
		quantityCamera.clear();
		quantityCamera.sendKeys("1");
	}

	public void clickOnSelectOption() throws InterruptedException {
		selectOption.click();

	}
	
	public List<WebElement> elements() {
		List<WebElement> DesktopsItems = items;
		return DesktopsItems;
		
	}

}
