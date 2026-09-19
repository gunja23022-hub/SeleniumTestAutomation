package testng;

import org.testng.annotations.Test;


public class TestNGDemo {
	
	@Test(priority=1)
	public void login()
	{
		System.out.println("Login into the Application sucessfully");
		
}
	
	@Test(priority=2)
	public void logout()
	{
		System.out.println("Logged out the Application sucessfully");
	
	}
	
	@Test(priority=3)
	public void applaunch()
	{
		System.out.println("Application lunched sucessfully");
		
	}
	
	
	
}

