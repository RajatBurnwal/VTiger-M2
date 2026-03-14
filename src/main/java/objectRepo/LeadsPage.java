package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a Leads Page POM class
 * @author rajat burnwal
 * @version 26-02-12
 */
public class LeadsPage {

	@FindBy(xpath = "//img[@alt='Create Lead...']")
	private WebElement createNewLeadicon;
	
	public LeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateNewLeadicon() {
		return createNewLeadicon;
	}
	
	/**
	 * This is a business library to click on Create New Lead icon
	 */
	public void clickOnCreateNewLeadIcon() {
		getCreateNewLeadicon().click();
	}
}
