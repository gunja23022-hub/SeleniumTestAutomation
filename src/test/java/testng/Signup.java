package testng;

import org.testng.annotations.Test;

public class Signup {

	@Test(priority=1, groups= {"regression"})
	public void signupWithEmail()
	{
		System.out.println("Signup-Email");
	}

	@Test(priority=2, groups= {"regression"})
	public void signupWithMobile()
	{
		System.out.println("Signup-Mobile");
	}
}
