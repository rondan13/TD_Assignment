package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KindleMenuObjects {

	private WebDriver driver;

	public KindleMenuObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=("//*[@id=\"hmenu-content\"]/ul[@class='hmenu hmenu-visible hmenu-translateX']"))
	WebElement KindleMenu;
	public WebElement KindleMenu() {
		return KindleMenu;
		}
	
	@FindBy(xpath="//ul[@class='hmenu hmenu-visible hmenu-translateX']//div[contains(text(),'main menu')]")
	WebElement MainMenu;
	
	@FindBy(xpath="//div[@id=\"hmenu-canvas\"]/div/ul/li/a[text()='All-new Kindle']")
	WebElement AllNewKindle;
	
	@FindBy(xpath="//ul[@class='hmenu hmenu-visible hmenu-translateX']//a[text()='Kindle Paperwhite']")
	WebElement KindlePaperwhite;
	
	@FindBy(xpath="//ul[@class='hmenu hmenu-visible hmenu-translateX']//a[text()='Kindle Oasis']")
	WebElement KindleOasis;
	
	@FindBy(xpath="//ul[@class='hmenu hmenu-visible hmenu-translateX']//a[text()='Introducing Kindle Scribe']")
	WebElement IntroKindleScribe;
	
	@FindBy(xpath="//ul[@class='hmenu hmenu-visible hmenu-translateX']//a[text()='Kindle E-reader Accessories']")
	WebElement KindleERAccessories;
	
	public void clickMainMenu() {
		MainMenu.click();
		}
	public void clickAllNewKindle() {
		AllNewKindle.click();
		}
	public void clickKindlePaperwhite() {
		KindlePaperwhite.click();
		}

		
}
