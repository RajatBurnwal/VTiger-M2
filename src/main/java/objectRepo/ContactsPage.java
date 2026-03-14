package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a Contacts page POM class
 * @author rajat burnwal
 * @version 26-02-13
 */
public class ContactsPage {

	@FindBy(xpath = "//img[@alt='Create Contact...']")
	private WebElement createNewContactIcon;
	
	public ContactsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateNewContactIcon() {
		return createNewContactIcon;
	}
	
	/**
	 * This is a business library to click on Create new Contact icon
	 */
	public void clickOnCreateNewContactIcon() {
		getCreateNewContactIcon().click();
	}
}
