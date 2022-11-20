package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageNavigationObject {
	
	private WebDriver driver;

	public HomePageNavigationObject(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='nav-logo-sprites']")
	WebElement AmazonLogo;
	
	public WebElement AmazonLogo() {
		return AmazonLogo;
		}
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement AmazonSearchbar;
	
	@FindBy(xpath="//i[@class='hm-icon nav-sprite']")
	WebElement AllHamburgerbutton;
	public WebElement AllHamburgerbutton() {
		return AllHamburgerbutton;
		}
	
	@FindBy(xpath="//*[@id=\"nav-xshop\"]/a[text()='Best Sellers']")
	WebElement BestSellers;
	
	@FindBy(xpath="//*[@id=\"nav-xshop\"]/a[text()='Deals Store']")
	WebElement DealsStore;
	
	@FindBy(xpath="//*[@id=\"nav-xshop\"]/a[text()='New Releases']")
	WebElement NewReleases;
	
	@FindBy(xpath="//*[@id=\"nav-xshop\"]/a[text()='Customer Service']")
	WebElement CustomerService;
	
	@FindBy(xpath="//*[@id=\"nav-link-amazonprime\"]")
	WebElement Prime;
	
	
	public void clickAmazonLogo() {
		AmazonLogo.click();
		}
	public void clickAllHamburgerbutton() {
		AllHamburgerbutton.click();
		}
	public void clickBestSellers() {
		BestSellers.click();
		}
	public void clickDealsStore() {
		DealsStore.click();
		}
	public void clickNewReleases() {
		NewReleases.click();
		}
	public void clickCustomerService() {
		CustomerService.click();
		}
	public void clickPrime() {
		Prime.click();
		}
	
	public void inputSearchText (String searchText){
		AmazonSearchbar.sendKeys(searchText);
	}
	
}
