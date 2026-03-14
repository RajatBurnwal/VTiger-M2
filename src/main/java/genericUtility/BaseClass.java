package genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import objectRepo.HomePage;
import objectRepo.LoginPage;

public class BaseClass {

	public ExcelUtility eUtil = new ExcelUtility();
	public SeleniumUtility sUtil = new SeleniumUtility();
	public PropertiesUtility pUtil = new PropertiesUtility();
	public WebDriver driver;
	public static WebDriver sDriver;	//used for listeners
	
	@BeforeSuite(alwaysRun = true)
	public void bsConfig() {
		System.out.println("Create DB connection");
	}
	
//	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void bcConfig(/*@Optional("chrome") String BROWSER*/) throws IOException {
		String BROWSER = System.getProperty("browser");
		if(BROWSER.equals("chrome"))
			driver = new ChromeDriver();
		else if(BROWSER.equals("edge")) {
			System.setProperty("webdriver.edge.driver", ".\\src\\main\\resources\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else if(BROWSER.equals("firefox"))
			driver = new FirefoxDriver();
		else if(BROWSER.equals("safari"))
			driver = new SafariDriver();
		else
			driver = new ChromeDriver();
		sDriver = driver;		//used for listeners
		sUtil.maximizeWindow(driver);
		sUtil.implicitWait(driver, 20);
		String URL = pUtil.getDataFromPropertiesFile("url");
		sUtil.accessApplication(driver, URL);
		System.out.println("Browser launched successfully");
	}
	
	@BeforeMethod(alwaysRun = true)
	public void bmConfig() throws IOException {
		String UN = pUtil.getDataFromPropertiesFile("username");
		String PWD = pUtil.getDataFromPropertiesFile("password");
		LoginPage lp = new LoginPage(driver);
		lp.loginToApplication(UN, PWD);
		System.out.println("Login done successfully");
	}
	
	@AfterMethod(alwaysRun = true)
	public void amConfig() {
		HomePage hp = new HomePage(driver);
		hp.logoutOperation(driver);
		System.out.println("Logout done successfully");
	}
	
	@AfterClass(alwaysRun = true)
	public void acConfig() {
		driver.quit();
		System.out.println("Browser closed successfully");
	}
	
	@AfterSuite(alwaysRun = true)
	public void asConfig() {
		System.out.println("DB connection closed");
	}
}
