package testng;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HardAssertionDemo {
	
	WebDriver driver;
	@Test
	public void hardAssertion()
	{
		driver = new ChromeDriver();
		
		//Navigate to URL
		driver.get("https://practicetestautomation.com/");
		
		// Maximize browser
		driver.manage().window().maximize();
		
		Assert.assertTrue(false);
		
		System.out.println("Line 1 after hard assert");
		
		System.out.println("Line 2 after hard assert");
		
		
	}

}
