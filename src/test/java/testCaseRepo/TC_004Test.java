package testCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepo.ContactsPage;
import objectRepo.CreatingNewContactPage;
import objectRepo.HomePage;

public class TC_004Test extends BaseClass{

	@Test(groups = {"Regression"})
	public void CON_001() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.clickOnContactsMenu();
		ContactsPage cp = new ContactsPage(driver);
		cp.clickOnCreateNewContactIcon();
		String fName = eUtil.getSingleCellDataFromExcel("Contacts", 1, 1);
		String lName = eUtil.getSingleCellDataFromExcel("Contacts", 1, 2);
		String title = eUtil.getSingleCellDataFromExcel("Contacts", 1, 3);
		CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
		cncp.createNewContact(fName, lName, title);
	}
}
