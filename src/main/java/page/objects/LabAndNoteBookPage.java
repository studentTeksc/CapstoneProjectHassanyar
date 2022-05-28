package page.objects;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
public class LabAndNoteBookPage extends Base {

	public LabAndNoteBookPage() {
	   PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[normalize-space()='Laptops & Notebooks']")
	private WebElement laptopsAndNotebooksLinkOne;

	@FindBy(xpath = "//a[normalize-space()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndNotebooksOne;

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
	public void clickOnLaptopAndNotebookOne() {
		laptopsAndNotebooksLinkOne.click();
	}

	public void clickOnShowAllLaptopsAndNotebooksOne() {
		showAllLaptopsAndNotebooksOne.click();
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
	
   @FindBy(xpath="(//button[@type='button'])[15]")
   private WebElement comparisonMacBook;
   public void clickOnproductcomparisIconOnMacBook() {
	   comparisonMacBook.click();
   }
   
   @FindBy(xpath = "(//button[@type='button'])[18]")
   private WebElement ComaprisonMacBookAir;
   public void clickOnProductComparisonIconOnMacBookAir() {
	   ComaprisonMacBookAir.click();
   }
   @FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
   private WebElement successMessage;
   public boolean isSuccessMessageDisplayed() {
	   if(successMessage.isDisplayed()) {
		return true;
	   }else {
		   return false;
	   }
   }
   
 
   @FindBy(xpath="//a[@href='http://tek-school.com/retail/index.php?route=product/compare']")
   private WebElement productComparisonLink;
   public void clickOnProductComparisonLink() {
	   productComparisonLink.click();
   }
  @FindBy(xpath="//h1[text()='Product Comparison']")
  private WebElement productComparisonChart;
  public boolean isproductComparisonChartDisplayed() {
	  if(productComparisonChart.isDisplayed()) {
		  return true;
	  }else {
		  return false;
	  }
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
	   @FindBy(xpath="(//img[@class='img-responsive'])[5]")
		private WebElement MacBookProItemOne;
		public void clickOnMacBookProItemOne() {
			MacBookProItemOne.click();
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
	

	

