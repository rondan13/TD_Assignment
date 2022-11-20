package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllHambugerMenuObjects {

	private WebDriver driver;

	public AllHambugerMenuObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=("//*[@id=\"hmenu-content\"]/ul[@data-menu-id='1']"))
	WebElement HamburgerMenu;
	public WebElement HamburgerMenu() {
		return HamburgerMenu;
		}
	
	@FindBy(xpath="//div[@id=\"hmenu-content\"]/ul/li/a[text()='Best Sellers']")
	WebElement BestSellers;
	
	@FindBy(xpath="//div[@id=\"hmenu-content\"]/ul/li/a[text()='New Releases']")
	WebElement NewReleases;
	
	@FindBy(xpath="//div[@id=\"hmenu-content\"]/ul/li/a[text()='Movers @ Shakers']")
	WebElement MoversShakers;
	
	@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[7]/a/div")
	WebElement Echo_Alexa;
	
	@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[8]/a/div")
	WebElement Fire_tab_tv;
	
	@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[9]/a")
	WebElement Kindle;
	
	@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[10]/a")
	WebElement AudioBooks;
	
	@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[11]/a/div")
	WebElement PrimeVideo;
	
	@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[12]/a/div")
	WebElement AmazonMusic;
	
	@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[13]/a/div")
	WebElement AppstoreForAndroid;
	
	@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[16]/a/div")
	WebElement Books;
	
	public void clickBestSellers () {
		BestSellers.click();
	}
	public void clickNewReleases () {
		NewReleases.click();
	}
	public void clickMoversShakers () {
		MoversShakers.click();
	}
	public void clickEcho_Alexa () {
		Echo_Alexa.click();
	}
	public void clickFire_tab_tv () {
		Fire_tab_tv.click();
	}
	public void clickKindle () {
		Kindle.click();
	}
}
