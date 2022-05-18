package page.objects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
public class MacBookPrice extends Base{

	public MacBookPrice() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//img[@class='img-responsive'])[5]")
	private WebElement MacBookProItem;
	public void clickOnMacBookProItem() {
		MacBookProItem.click();
	}
	@FindBy(xpath="//ul[@class='list-unstyled']")
	private WebElement Priceshouldbeseen;
	public boolean isthePricDisplayed() {
		if(Priceshouldbeseen.isDisplayed()) {
		return true;
	}else {
		return false;
	}
}
}
