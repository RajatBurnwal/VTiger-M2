package practice;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(genericUtility.ListenersImplementation.class)
public class TestNGPractice {

//	@Ignore
	@Test(priority = 1/*enabled = false,invocationCount = 0*/)
	public void createUser() {
		System.out.println("User created");
	}
	
	@Test(priority = 2, dependsOnMethods = {"deleteUser"})
	public void modifyUser() {
		System.out.println("User modified");
	}
	
	@Test(priority = 3)
	public void deleteUser() {
//		Assert.fail();
		System.out.println("User deleted");
	}
}
