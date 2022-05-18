package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;
public class ProductionComparison extends Base{


	public ProductionComparison() {
	   PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[normalize-space()='Laptops & Notebooks']")
	private WebElement laptopsAndNotebooksLink;
	public void clickOnLaptopAndNotebook() {
		laptopsAndNotebooksLink.click();
	}

	@FindBy(xpath = "//a[normalize-space()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndNotebooks;
	public void clickOnShowAllLaptopsAndNotebooks() {
		showAllLaptopsAndNotebooks.click();
	}
	
   @FindBy(xpath="(//i[@class='fa fa-exchange'])[2]")
   private WebElement comparisonMacBook;
   public void clickOnproductcomparisIconOnMacBook() {
	   comparisonMacBook.click();
   }
   
   @FindBy(xpath = "(//button[@type='button'])[19]")
   private WebElement ComaprisonMacBookAir;
   public void clickOnProductComparisonIconOnMacBookAir() {
	   ComaprisonMacBookAir.click();
   }
   
   @FindBy(xpath=" //div[text()=' Success: You have added ']")
   private WebElement successMessageComparisonMacBookAir;
   public boolean isSuccessMessageComparisonMacBookAirDisplayed() {
   if(successMessageComparisonMacBookAir.isDisplayed()) {
	   return true;
   }else {
	   return false;
   }
}
   @FindBy(xpath="//a[text()='product comparison']")
   private WebElement productComparisonLink;
   public void clickOnProductComparisonLink() {
	   productComparisonLink.click();
   }
  @FindBy(id="content")
  private WebElement productComparisonChart;
  public boolean isproductComparisonChartDisplayed() {
	  if(productComparisonChart.isDisplayed()) {
		  return true;
	  }else {
		  return false;
	  }
	  }
  
   
   
}
