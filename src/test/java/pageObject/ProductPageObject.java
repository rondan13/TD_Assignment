package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPageObject {

	private WebDriver driver;

	public ProductPageObject(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"productTitle\"]")
	WebElement ProductTitle;
	
	public WebElement ProductTitle() {
		return ProductTitle;
		}
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement AmazonSearchbar;
	
	public void inputSearchText (String searchText){
		AmazonSearchbar.sendKeys(searchText);
	}
	
	
	@FindBy(xpath="//*[@id=\"corePrice_feature_div\"]//span[2]")
	WebElement ProductPrice;
	
	public WebElement ProductPrice() {
		return ProductPrice;
		}
	
	@FindBy(xpath="//*[@id=\"quantity\"]")
	WebElement QuantitySelection;
	
	public WebElement QuantitySelection() {
		return QuantitySelection;
		}
	
	@FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
	WebElement AddToCart;
	
	public void clickAddToCart() {
		AddToCart.click();
		}
	
	@FindBy(xpath="//*[@id=\"buy-now-button\"]")
	WebElement BuyNow;
	
	public void clickBuyNow() {
		BuyNow.click();
		}

}
