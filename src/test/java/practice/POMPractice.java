package practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.PropertiesUtility;
import genericUtility.SeleniumUtility;
import objectRepo.HomePage;
import objectRepo.LoginPage;

public class POMPractice {
	
	@FindBy(name = "user_name")
	WebElement usernameTF;
	
	public POMPractice(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		
		PropertiesUtility pUtil = new PropertiesUtility();
		SeleniumUtility sUtil = new SeleniumUtility();
		String URL = pUtil.getDataFromPropertiesFile("url");
		String UN = pUtil.getDataFromPropertiesFile("username");
		String PWD = pUtil.getDataFromPropertiesFile("password");
		WebDriver driver = new ChromeDriver();
		sUtil.maximizeWindow(driver);
		sUtil.implicitWait(driver, 15);
		sUtil.accessApplication(driver, URL);
		LoginPage lp = new LoginPage(driver);
		lp.loginToApplication(UN, PWD);
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		hp.logoutOperation(driver);
//		WebElement usernameTF = driver.findElement(By.name("user_name"));
//		POMPractice p = new POMPractice(driver);
//		usernameTF.sendKeys(UN);
//		p.usernameTF.sendKeys(UN);
//		System.out.println(usernameTF);
//		Thread.sleep(2000);
//		sUtil.refreshWebpage(driver);
//		Thread.sleep(2000);
//		System.out.println(usernameTF);
//		p.usernameTF.sendKeys(UN);
//		usernameTF.sendKeys(UN);
		

	}

}
