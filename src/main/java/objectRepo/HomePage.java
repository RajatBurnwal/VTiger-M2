package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

/**
 * This is a Home page POM class
 * @author rajat burnwal
 * @version 26-02-12
 */
public class HomePage {

	@FindBy(xpath = "//td[@class='tabUnSelected']/a[text()='Leads']")
	private WebElement leadsMenu;
	
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contactsMenu;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement accountsIcon;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signoutOption;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLeadsMenu() {
		return leadsMenu;
	}

	public WebElement getContactsMenu() {
		return contactsMenu;
	}

	public WebElement getAccountsIcon() {
		return accountsIcon;
	}

	public WebElement getSignoutOption() {
		return signoutOption;
	}
	
	/**
	 * This is a business library to click on Leads menu
	 */
	public void clickOnLeadsMenu() {
		getLeadsMenu().click();
	}
	
	/**
	 * This is a business library to click on Contacts menu
	 */
	public void clickOnContactsMenu() {
		getContactsMenu().click();
	}
	
	/**
	 * This is a business library to perform logout operation
	 * @param driver
	 */
	public void logoutOperation(WebDriver driver) {
		SeleniumUtility sUtil = new SeleniumUtility();
		sUtil.mouseHoveringAction(driver, getAccountsIcon());
		getSignoutOption().click();
	}
}
