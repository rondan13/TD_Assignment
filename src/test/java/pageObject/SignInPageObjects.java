package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPageObjects {
		
		private WebDriver driver;

		public SignInPageObjects(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//input[@id='ap_email']")
		WebElement EmailPhoneField;
		
		public WebElement emailPhoneField() {
			return EmailPhoneField;
			}
		public void EnteremailPhoneField(String id) {
			EmailPhoneField.sendKeys(id);
		}
		
		@FindBy(xpath="//input[@id='continue']")
		WebElement ContinueButton;
		
		public WebElement ContinueButton() {
			return ContinueButton;
			}

}
