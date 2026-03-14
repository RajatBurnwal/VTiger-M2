package practice;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericUtility.PropertiesUtility;
import genericUtility.SeleniumUtility;
import objectRepo.LoginPage;

public class DataProviderPractice {

	@Test(dataProvider = "loginData", dataProviderClass = practice.DataProviderLogin.class)
	public void loginTest(HashMap<String, String> h1) throws IOException, InterruptedException {
//		public void loginTest(String UN, String PWD) throws IOException, InterruptedException {
		SeleniumUtility sUtil = new SeleniumUtility();
		PropertiesUtility pUtil = new PropertiesUtility();
		WebDriver driver = new ChromeDriver();
		sUtil.maximizeWindow(driver);
		sUtil.implicitWait(driver, 20);
		String URL = pUtil.getDataFromPropertiesFile("url");
//		String UN = pUtil.getDataFromPropertiesFile("username");
//		String PWD = pUtil.getDataFromPropertiesFile("password");
		sUtil.accessApplication(driver, URL);
		LoginPage lp = new LoginPage(driver);
//		lp.loginToApplication(UN, PWD);
		lp.loginToApplication(h1.get("username"), h1.get("password"));
		Thread.sleep(3000);
		driver.close();
	}

}
