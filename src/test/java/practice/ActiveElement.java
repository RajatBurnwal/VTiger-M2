package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActiveElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
//		Actions act = new Actions(driver);
//		act.sendKeys("hello").perform();
		driver.switchTo().activeElement().sendKeys("robin");

		
	}

}
