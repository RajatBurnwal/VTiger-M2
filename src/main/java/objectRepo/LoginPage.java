package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a Login page POM class
 * @author rajat burnwal
 * @version 26-02-11
 */
public class LoginPage {

	//Locating the webelements

	@FindBy(name = "user_name")
	private WebElement usernameTextField;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwordTextField;

	@FindBy(id = "submitButton")
	private WebElement loginButton;

	//Initializing the webelements

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//public getters

	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	//Utilizing the webelements
	/**
	 * This is a business library used to perform login operation to application
	 * @param username
	 * @param password
	 */
	public void loginToApplication(String username, String password) {
		getUsernameTextField().sendKeys(username);
		getPasswordTextField().sendKeys(password);
		getLoginButton().click();
	}
}
 