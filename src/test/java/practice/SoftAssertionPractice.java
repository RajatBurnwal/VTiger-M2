package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionPractice {

	@Test
	public void strictLevelComparisonSoftAssertion() {
		String expectedFood = "Benne Dosa";
		String actualFood = "Benn Dosa";
		System.out.println("Strict level Soft Assertion starts");
		SoftAssert s = new SoftAssert();
		s.assertEquals(actualFood, expectedFood);
		System.out.println("Strict level Soft Assertion ends");
		s.assertFalse(actualFood.contains(expectedFood));
		s.assertAll();
	}
	
	@Test
	public void containsLevelComparisonSoftAssertion() {
		String expectedMovie = "Avatar";
		String actualMovie = "Avatar 3";
		System.out.println("Contains level Soft Assertion starts");
		SoftAssert s = new SoftAssert();
		s.assertTrue(actualMovie.contains(expectedMovie));
		System.out.println("Contains level Soft Assertion ends");
		s.assertAll();
	}
}
