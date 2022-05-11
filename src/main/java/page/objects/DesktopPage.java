package page.objects;
import java.util.List;

import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;
public class DesktopPage extends Base{

	public DesktopPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//a[text()='Desktops']")
	private WebElement desktopTab;
	public void clickOnDesktopTab() {
		Actions action = new Actions(driver);
		action.moveToElement(desktopTab).build().perform();
			}
	@FindBy(xpath ="//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;
	public void clickOnShowAllDesktops() {
		showAllDesktops.click();
	}
	@FindBy(tagName = "img")
	private List<WebElement> items;
	public List<WebElement> elements() {
		List<WebElement> DesktopsItems = items;
		return DesktopsItems;
	}
	private WebElement logo;
	public boolean isLogoDisplayed() {
		if (logo.isDisplayed())
			return true;
		else
			return false;
	}
	@FindBy(xpath="(//*[@class='img-responsive'])[13]")
	private WebElement clickOnHPDeskTop;
	public void clickOnHPDesktopCom() {
		clickOnHPDeskTop.click();
	}
	@FindBy(xpath="//input[@name='quantity']")
	private WebElement quantityHP;
	public void selectQuantity() {
		quantityHP.click();
		quantityHP.clear();
		quantityHP.sendKeys("1");
		
	}		
		@FindBy(xpath="(//button[@type='button'])[9]")
				private WebElement addToCartButton2;
		public void clickOnAddtoCarButton2() {
			addToCartButton2.click();
			}
		@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
		private WebElement successMessage;
		public boolean  isSuccessMessageDisplayed() {
			if(successMessage.isDisplayed()) 
				return true;
						
			else
				return false;
			}
		@FindBy(xpath="(//*[@class='img-responsive'])[3]")
		private WebElement clickOnCameraImg;
		public void clickOnCanonCamera() {
			clickOnCameraImg.click();
		}
			@FindBy(xpath="(//select[@name='option[226]']//child::option[@value='15']")
			private WebElement selectOption;
			public void clickOnSelectOption() throws InterruptedException {
				selectOption.click();
				
			}
			@FindBy(xpath="//input[@name='quantity']")
			private WebElement quantityCamera;
			public void selectQuantityCamera() {
				quantityCamera.click();
				quantityCamera.clear();
				quantityCamera.sendKeys("1");
			} 
			@FindBy(xpath="//button[@class='btn btn-primary btn-lg btn-block']")
			private WebElement addToCartButtonCamra2;
			public void clickOnAddToCartButtonCamera2() {
				
			}
			@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
			private WebElement getsuccessMessage;
			public String getSuccessMessage() {
				String actualMessage = getsuccessMessage.getText();
				return actualMessage;
			}
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
		

