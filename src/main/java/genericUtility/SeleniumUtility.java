package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

/**
 * This is an utility class which has functionalities from Selenium library
 */
public class SeleniumUtility {

	/**
	 * This is a generic method to access a web application
	 * @param driver
	 * @param url
	 */
	public void accessApplication(WebDriver driver, String url) {
		driver.get(url);
	}
	
	/**
	 * This is a generic method to refresh the current webpage
	 * @param driver
	 */
	public void refreshWebpage(WebDriver driver) {
		driver.navigate().refresh();
	}
	
	/**
	 * This is a generic method to access a maximize the window
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	/**
	 * This is a generic method to provide implicit wait
	 * @param driver
	 * @param maxTime
	 */
	public void implicitWait(WebDriver driver, int maxTime) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxTime));
	}
	
	/////////******** Handling mouse actions *********/////////
	
	/**
	 * This is a generic method to perform mouse hovering action on an element
	 * @param driver
	 * @param element
	 */
	public void mouseHoveringAction(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	/**
	 * This is a generic method to perform right click action on an element
	 * @param driver
	 * @param element
	 */
	public void rightClickAction(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick(element).perform();
	}
	
	/**
	 * This is a generic method to perform double click action on an element
	 * @param driver
	 * @param element
	 */
	public void doubleClickAction(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
	}
	
	//////////******* Handling dropdowns *******/////////
	
	/**
	 * This is a generic method to select an option in a dropdown by using index
	 * @param dropdownEle
	 * @param index
	 */
	public void selectOptionByIndex(WebElement dropdownEle, int index) {
		Select sel = new Select(dropdownEle);
		sel.selectByIndex(index);
	}
	
	/**
	 * This is a generic method to select an option in a dropdown by using value attribute
	 * @param dropdownEle
	 * @param valueAttribute
	 */
	public void selectOptionByValue(WebElement dropdownEle, String valueAttribute) {
		Select sel = new Select(dropdownEle);
		sel.selectByValue(valueAttribute);
	}
	
	/**
	 * This is a generic method to select an option in a dropdown by using visible text
	 * @param dropdownEle
	 * @param visibleText
	 */
	public void selectOptionByVisibleText(WebElement dropdownEle, String visibleText) {
		Select sel = new Select(dropdownEle);
		sel.selectByVisibleText(visibleText);
	}
	
	///////******** Handling alert popup *******/////////
	
	/**
	 * This is a generic method to accept an alert popup
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	/**
	 * This is a generic method to cancel an alert popup
	 * @param driver
	 */
	public void cancelAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	//////////******** Taking webpage screenshot ******///////
	
	/**
	 * This is a generic method to capture the screenshot of the webpage
	 * @param driver
	 * @param screenshotName
	 * @return
	 * @throws IOException
	 */
	public String captureScreenshot(WebDriver driver, String screenshotName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\Screenshots\\"+screenshotName+".png");
		Files.copy(src, dest);
		return dest.getAbsolutePath(); 			//used in listeners
	}
}
