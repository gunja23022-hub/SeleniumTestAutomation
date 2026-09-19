package testng;

import org.testng.annotations.Test;

public class Registration {

	@Test(priority=1, groups= {"sanity","regression","Functional"})
	public void RegisterWithEmail()
	{
		System.out.println("Register-Email");
	}

	@Test(priority=2,groups= {"sanity","regression","Functional"})
	public void RegisterWithMobile()
	{
		System.out.println("Register-Mobile");
	}
}
