package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a Creating New Contact page POM class
 * @author rajat burnwal
 * @version 26-02-13
 */
public class CreatingNewContactPage {

	@FindBy(name = "firstname")
	private WebElement firstNameTextfield;
	
	@FindBy(name = "lastname")
	private WebElement lastNameTextfield;
	
	@FindBy(name = "title")
	private WebElement titleTextfield;
	
	@FindBy(name = "department")
	private WebElement departmentTextfield;
	
	@FindBy(name = "email")
	private WebElement emailTextfield;
	
	@FindBy(name = "mobile")
	private WebElement mobileTextfield;
	
	@FindBy(name = "mailingcity")
	private WebElement mailingCityTextfield;
	
	@FindBy(name = "mailingstate")
	private WebElement mailingStateTextfield;
	
	@FindBy(name = "mailingcountry")
	private WebElement mailingCountryTextfield;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	public CreatingNewContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstNameTextfield() {
		return firstNameTextfield;
	}

	public WebElement getLastNameTextfield() {
		return lastNameTextfield;
	}

	public WebElement getTitleTextfield() {
		return titleTextfield;
	}

	public WebElement getDepartmentTextfield() {
		return departmentTextfield;
	}

	public WebElement getEmailTextfield() {
		return emailTextfield;
	}

	public WebElement getMobileTextfield() {
		return mobileTextfield;
	}

	public WebElement getMailingCityTextfield() {
		return mailingCityTextfield;
	}

	public WebElement getMailingStateTextfield() {
		return mailingStateTextfield;
	}

	public WebElement getMailingCountryTextfield() {
		return mailingCountryTextfield;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	/**
	 * This is a business library to create a new contact
	 * @param fName
	 * @param lName
	 * @param title
	 */
	public void createNewContact(String fName, String lName, String title) {
		getFirstNameTextfield().sendKeys(fName);
		getLastNameTextfield().sendKeys(lName);
		getTitleTextfield().sendKeys(title);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create a new contact
	 * @param lName
	 * @param dept
	 * @param email
	 * @param mob
	 */
	public void createNewContact(String lName, String dept, String email, String mob) {
		getLastNameTextfield().sendKeys(lName);
		getDepartmentTextfield().sendKeys(dept);
		getEmailTextfield().sendKeys(email);
		getMobileTextfield().sendKeys(mob);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create a new contact
	 * @param lName
	 * @param dept
	 * @param email
	 * @param mailingCity
	 * @param mailingState
	 * @param mailingCountry
	 */
	public void createNewContact(String lName, String dept, String email, 
			String mailingCity, String mailingState, String mailingCountry) {
		getLastNameTextfield().sendKeys(lName);
		getDepartmentTextfield().sendKeys(dept);
		getEmailTextfield().sendKeys(email);
		getMailingCityTextfield().sendKeys(mailingCity);
		getMailingStateTextfield().sendKeys(mailingState);
		getMailingCountryTextfield().sendKeys(mailingCountry);
		getSaveButton().click();
	}
}
