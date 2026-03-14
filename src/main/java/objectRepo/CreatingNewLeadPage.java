package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

/**
 * This is a Creating New Lead page POM class
 * @author rajat burnwal
 * @version 26-02-13
 */
public class CreatingNewLeadPage {

	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstNameTextField;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastNameTextField;
	
	@FindBy(xpath = "//input[@name='company']")
	private WebElement companyTextField;
	
	@FindBy(xpath = "//input[@id='designation']")
	private WebElement titleTextField;
	
	@FindBy(xpath = "//select[@name='leadsource']")
	private WebElement leadSourceDropdown;
	
	@FindBy(xpath = "//input[@id='noofemployees']")
	private WebElement noOfEmployeesTextField;
	
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement phoneTextField;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailTextField;
	
	@FindBy(xpath = "//input[@id='state']")
	private WebElement stateTextField;
	
	@FindBy(xpath = "//input[@id='country']")
	private WebElement countryTextField;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	public CreatingNewLeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getCompanyTextField() {
		return companyTextField;
	}

	public WebElement getTitleTextField() {
		return titleTextField;
	}

	public WebElement getLeadSourceDropdown() {
		return leadSourceDropdown;
	}

	public WebElement getNoOfEmployeesTextField() {
		return noOfEmployeesTextField;
	}

	public WebElement getPhoneTextField() {
		return phoneTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getStateTextField() {
		return stateTextField;
	}

	public WebElement getCountryTextField() {
		return countryTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	/**
	 * This is a business library to create a new lead
	 * @param firstName
	 * @param lName
	 * @param company
	 */
	public void createNewLead(String firstName, String lName, String company) {
		getFirstNameTextField().sendKeys(firstName);
		getLastNameTextField().sendKeys(lName);
		getCompanyTextField().sendKeys(company);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create a new lead
	 * @param lName
	 * @param company
	 * @param title
	 * @param leadSource
	 * @param noOfEmp
	 */
	public void createNewLead(String lName, String company, String title,
			String leadSource, String noOfEmp) {
		getLastNameTextField().sendKeys(lName);
		getCompanyTextField().sendKeys(company);
		getTitleTextField().sendKeys(title);
		SeleniumUtility sUtil = new SeleniumUtility();
		sUtil.selectOptionByValue(getLeadSourceDropdown(), leadSource);
		getNoOfEmployeesTextField().sendKeys(noOfEmp);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create a new lead
	 * @param lName
	 * @param company
	 * @param noOfEmp
	 * @param phone
	 * @param email
	 * @param state
	 * @param country
	 */
	public void createNewLead(String lName, String company, String noOfEmp,
			String phone, String email, String state, String country) {
		getLastNameTextField().sendKeys(lName);
		getCompanyTextField().sendKeys(company);
		getNoOfEmployeesTextField().sendKeys(noOfEmp);
		getPhoneTextField().sendKeys(phone);
		getEmailTextField().sendKeys(email);
		getStateTextField().sendKeys(state);
		getCountryTextField().sendKeys(country);
		getSaveButton().click();
	}
}
