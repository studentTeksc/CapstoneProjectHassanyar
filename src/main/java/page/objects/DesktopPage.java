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
		PageFactory.initElements(driver, this);}
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopTab;
	
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;
	
	@FindBy(tagName = "img")
	private List<WebElement> items;

	private WebElement logo;
	@FindBy(xpath = "(//span[text()='Add to Cart'])[3]")
	private WebElement clickOnHPLaptopAddToCartButton;

	@FindBy(xpath = "//button[text()='Add to Cart']")
	private WebElement addToCartButton2;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
   
	@FindBy(xpath="(//span[text()='Add to Cart'])[2]")
	private WebElement AddToCartButton;
	
	@FindBy(xpath="//select[@id=\"input-option226\"]")
	private WebElement SelectDropdown;
	
	@FindBy(xpath="//option[@value=\"15\"]")
	private WebElement selectColor;
	
	@FindBy(xpath="//input[@name=\"quantity\"]")
	private WebElement Qty;
	
	@FindBy(id="button-cart")
	private WebElement AddToCartButton2;
	
	@FindBy(xpath = "/html/body/div[2]/div[1]")
	private WebElement Successtext;
	
	@FindBy(css = "#content > div:nth-child(7) > div:nth-child(2) > div > div:nth-child(2) > div.caption > h4 > a")
	private WebElement CanonEOS5DCamera;

	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div[3]/p/a[2]")
	private WebElement Writeareviewlink;

	@FindBy(id="input-name")
	private WebElement nameInput;

	@FindBy(id="input-review")
	private WebElement YourreviewInput;

	@FindBy(css ="#form-review > div:nth-child(5) > div > input[type=radio]:nth-child(6)")
	private WebElement RadioButton;

	@FindBy(id="button-review")
	private WebElement continueButton;

	@FindBy(xpath="//*[@id=\"form-review\"]/div[2]")
	private WebElement textmessage;

    public void clickOnDeskTopTab() {
    	desktopTab.click();
    }
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
	public void clickOnAddtoCarButton() {
		addToCartButton2.click();
	}

	public boolean isSuccessMessageDisplayed() {
		if (successMessage.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickOnAddToCartTabOnCanonEOS5D() {
		AddToCartButton.click();
		}
		public void clickOnSelectDropdown() {
		SelectDropdown.click();
		}
		public void selectvisibleText(WebElement AvailableOptions, String text) {
		Select select = new Select(AvailableOptions);
		select.selectByVisibleText(text);
		}
		public void Qty(String q) {
		Qty.clear();
		Qty.sendKeys( q);
		}
		public void clickonAddToCartButton2() {
		AddToCartButton2.click();
		}
		public boolean SuccessTextIsPresent() {
		if(Successtext.isDisplayed())
		return true;
		else
		return false;
		}
		public void clickOnCanonEOS5DCamera() {
			CanonEOS5DCamera.click();
			}
			public void clickOnWriteareviewlink() {
			Writeareviewlink.click();
			}
			public void enterYourName(String nameValue) {
			nameInput.sendKeys(nameValue);
			}
			public void enterYourreview(String reviewValue) {
			YourreviewInput.sendKeys(reviewValue);
			}
			public void clickOnRadioButton() {
			RadioButton.click();
			}
			public void clickOncontinueButton() {
			continueButton.click();
			}
			public boolean textMessageIsPresent() {
			if(textmessage.isDisplayed())
			return true;
			else
			return false;
			}
		
}
