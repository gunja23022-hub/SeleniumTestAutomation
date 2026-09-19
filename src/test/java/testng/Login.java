package testng;

import org.testng.annotations.Test;

public class Login {
	
	@Test(priority=1, groups= {"sanity"})
	public void loginWithEmail()
	{
		System.out.println("Login-Email");
	}

	@Test(priority=2, groups= {"sanity"})
	public void loginWithMobile()
	{
		System.out.println("Login-Mobile");
	}
}
