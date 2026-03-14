package practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationPractice {

	@BeforeSuite
	public void bsConfig() {
		System.out.println("Before Suite executed");
	}
	
	@BeforeClass
	public void bcConfig() {
		System.out.println("Before Class executed");
	}
	
	@BeforeMethod
	public void bmConfig() {
		System.out.println("Before Method executed");
	}
	
	@AfterMethod
	public void amConfig() {
		System.out.println("After Method executed");
	}
	
	@AfterClass
	public void acConfig() {
		System.out.println("After Class executed");
	}
	
	@AfterSuite
	public void asConfig() {
		System.out.println("After Suite executed");
	}
	
	@Test
	public void m1() {
		System.out.println("Test-1 executed");
	}

	@Test
	public void m2() {
		System.out.println("Test-2 executed");
	}
}
