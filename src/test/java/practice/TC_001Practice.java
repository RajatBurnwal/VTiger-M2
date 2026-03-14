package practice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import genericUtility.PropertiesUtility;
import genericUtility.SeleniumUtility;
import objectRepo.CreatingNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;
import objectRepo.LoginPage;

public class TC_001Practice extends BaseClass{

	@Test
	public void m1() throws IOException {
//		ExcelUtility eUtil = new ExcelUtility();
//		PropertiesUtility pUtil = new PropertiesUtility();
//		SeleniumUtility sUtil = new SeleniumUtility();
//		WebDriver driver = new ChromeDriver();
//		sUtil.maximizeWindow(driver);
//		sUtil.implicitWait(driver, 15);
//		String URL = pUtil.getDataFromPropertiesFile("url");
//		String UN = pUtil.getDataFromPropertiesFile("username");
//		String PWD = pUtil.getDataFromPropertiesFile("password");
//		sUtil.accessApplication(driver, URL);
//		LoginPage lp = new LoginPage(driver);
//		lp.loginToApplication(UN, PWD);
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		LeadsPage lep = new LeadsPage(driver);
		lep.clickOnCreateNewLeadIcon();
		String fName = eUtil.getSingleCellDataFromExcel("Leads", 1, 1);
		String lName = eUtil.getSingleCellDataFromExcel("Leads", 1, 2);
		String company = eUtil.getSingleCellDataFromExcel("Leads", 1, 3);
		CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		cnlp.createNewLead(fName, lName, company);
//		hp.logoutOperation(driver);
//		driver.quit();
	}
}
