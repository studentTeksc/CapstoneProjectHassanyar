package page.objects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
public class wishList extends Base{

	public wishList() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//i[@class='fa fa-heart'])[6]")
	private WebElement hearticonLaptop;
	public void clickOnheartIconLaptopWishList() {
		hearticonLaptop.click();
	}
   @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
   private WebElement alertSuccessMessage;
   public boolean isalertsuccessMessageDisplayed() {
	   if(alertSuccessMessage.isDisplayed()) {
		   return true;
	   }else {
		   return false;
	   }
   }
	
	
	
}
