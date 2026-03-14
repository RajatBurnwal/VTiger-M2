package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionPractice {

	@Test
	public void strictLevelComparisonHardAssertion() {
		String expectedCity = "Mysore";
		String actualCity = "Mysuru";
		System.out.println("Strict level hard assertion starts");
		Assert.assertEquals(actualCity, expectedCity);
		System.out.println("Strict level hard assertion ends");
	}
	
	@Test
	public void containsLevelHardAssertion() {
		String expectedName = "babu";
		String actualName = "Giri Babu";
		System.out.println("Contains level Hard assertion starts");
//		Assert.assertTrue(actualName.contains(expectedName));
		Assert.assertEquals(actualName.contains(expectedName), true);
		System.out.println("Contains level Hard assertion ends");
	}
}
