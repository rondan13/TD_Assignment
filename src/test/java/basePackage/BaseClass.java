package basePackage;

import org.testng.annotations.BeforeClass;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class BaseClass {
	
	protected WebDriver driver;
	protected String baseURL;
	protected JavascriptExecutor js;
	protected WebDriverWait wait;
	protected Select sc;
	protected ChromeOptions options;
	protected DesiredCapabilities capabilities;
	protected FirefoxOptions foptions;
	public ExtentReports report;
	public ExtentTest test;
  @BeforeClass
  public void beforeClass() {
	  
	  final String FILEPATH = System.getProperty("user.dir") + "/Utilites/configuration.properties";
	  final String reportPath = System.getProperty("user.dir") + "/target";
	  FileReader utilReader = null;
	  try {
		  utilReader = new FileReader(FILEPATH);
	} catch (FileNotFoundException e) {
		System.out.println("File not found in Filepath");
	}
	  final Properties prop = new Properties();
	  try {
		prop.load(utilReader);
	} catch (IOException e) {
		e.printStackTrace();
	}
	 
	  String browserSelected = prop.getProperty("browser");
	  String headless = prop.getProperty("headlessmode");	  
	  baseURL = prop.getProperty("baseurl");

	  
	  if ( browserSelected.equals("chrome")) {
	  	  report = new ExtentReports(reportPath+"//chromeKindlePurchaseTest.html",true);
	  	  test = report.startTest("chromeKindlePurchaseTest");


		  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver107.exe");
		  if (headless.equals("true")) {
			  options = new ChromeOptions();
			  options.addArguments("headless");
		  	  driver = new ChromeDriver(options);	
		  	  test.log(LogStatus.INFO, "Chrome session started in headless mode");

		  	}
		  else {
		  		driver = new ChromeDriver();
			  	  test.log(LogStatus.INFO, "Chrome session started");

		  	}
		  
		  driver.manage().window().maximize();
	  	  wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		  	
	  }
	  else if (browserSelected.equals("firefox")) {
		  report = new ExtentReports(reportPath+"//firefoxKindlePurchaseTest.html",true);
	  	  test = report.startTest("firefoxKindlePurchaseTest");
		  System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/Drivers/geckodriver.exe");
		  if (headless.equals("true")) {
			  foptions = new FirefoxOptions();
			  foptions.setHeadless(true);  
			  driver = new FirefoxDriver(foptions);
		  	  test.log(LogStatus.INFO, "Firefox session started in headless mode");

		  	}
		  else {
			  driver = new FirefoxDriver();	
		  	  test.log(LogStatus.INFO, "Firefox session started");

			  }
		  driver.manage().window().maximize();
		  wait= new WebDriverWait(driver, Duration.ofSeconds(30));
	  }
	  else {
		  System.out.println("NO BROWSER SELECTED /N PLEASE SELECT A BROWSER");
	  }
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
