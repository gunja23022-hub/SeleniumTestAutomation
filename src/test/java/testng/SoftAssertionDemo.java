package testng;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo {
	WebDriver driver;
	@Test
	public void SoftAssertion()
	{
		driver = new ChromeDriver();
		
		//Navigate to URL
		driver.get("https://practicetestautomation.com/");
		
		// Maximize browser
		driver.manage().window().maximize();
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertTrue(false);
				
		
		System.out.println("Line 1 after soft assert");
		
		System.out.println("Line 2 after soft assert");
		
		sa.assertAll();
		
	}

}


