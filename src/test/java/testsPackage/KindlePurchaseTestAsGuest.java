package testsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import basePackage.BaseClass;
import pageObject.*;

public class KindlePurchaseTestAsGuest extends BaseClass{
  @Test
  public void AmazonTest() throws InterruptedException {
	  
	  HomePageNavigationObject homePage = new HomePageNavigationObject(driver);
	  KindleMenuObjects kindleMenu = new KindleMenuObjects(driver);
	  AllHambugerMenuObjects hamburgerOptions = new AllHambugerMenuObjects(driver);
	  ProductPageObject ProductPage = new ProductPageObject(driver);
	  SignInPageObjects SignInPage = new SignInPageObjects(driver);
	  
	  driver.get(baseURL);
	  String LogoText;
	  try {
	  LogoText =homePage.AmazonLogo().getAttribute("aria-label");}
	  catch(Exception e) {
		  driver.navigate().refresh();
		  LogoText =homePage.AmazonLogo().getAttribute("aria-label");}
	  
	  Assert.assertEquals(LogoText,"Amazon.ca");
  	  test.log(LogStatus.PASS,"Assertion Pass - Amazon Logo text as expected");

	  
	  homePage.clickAllHamburgerbutton();
	  wait.until(ExpectedConditions.visibilityOf(hamburgerOptions.HamburgerMenu()));
	  Assert.assertTrue(hamburgerOptions.HamburgerMenu().isDisplayed());
  	  test.log(LogStatus.PASS,"Assertion Pass -Hamburger Menu is Displayed");

  	  
	  hamburgerOptions.clickKindle();
	  wait.until(ExpectedConditions.visibilityOf(kindleMenu.KindleMenu()));
      Assert.assertTrue(kindleMenu.KindleMenu().isDisplayed());
  	  
  	  test.log(LogStatus.PASS,"Assertion Pass - Kindle Menu is displayed");

	  
	  kindleMenu.clickAllNewKindle();
	  wait.until(ExpectedConditions.visibilityOf(ProductPage.ProductTitle()));
	  Assert.assertTrue(ProductPage.ProductTitle().isDisplayed());
  	  test.log(LogStatus.PASS,"Assertion Pass - Product Title is displayed");

	  sc= new Select(ProductPage.QuantitySelection());
	  //SELECTING QUANTITY AS 1
	  sc.selectByIndex(0);
	  
	  ProductPage.clickBuyNow();
	  Assert.assertTrue(SignInPage.emailPhoneField().isDisplayed());
  	  test.log(LogStatus.PASS,"Assertion Pass - User is asked for email or phone number");
	  
	  report.endTest(test);
	  report.flush();
	  
  }
  
}
