package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {
	WebDriver driver; 
	 @Test 
	 public void launchApp() {
	  
	driver = new ChromeDriver(); 
	driver.get("https://practicetestautomation.com/"); 
	driver.manage().window().maximize(); 
	String actualTitle=driver.getTitle(); 
	  
	String expectedTitle="Practice Test Automation | Learn Selenium WebDriver"; 
	  
	  
	if (actualTitle.equals(expectedTitle)) { 
	System.out.println("Test Pass"); 
	//Assert.assertEquals(actualTitle, expectedTitle); 
	Assert.assertTrue(true); 
	} else { 
	System.out.println("Test Fail"); 
	//Assert.assertEquals(actualTitle, expectedTitle); 
	Assert.assertTrue(false); 
	} 
	// Assert.assertEquals(123, 123); //Pass 
	// Assert.assertEquals("123", 123); //Fail 
	// Assert.assertNotEquals("Test Automation", "Test Automation");  //Fail 
	// Assert.assertNotEquals("Test Automation", "Test "); //Pass //Assert.assertTrue(actualTitle.equals(expectedTitle));
	// Assert.assertTrue(true); //Pass 
	// Assert.assertTrue(false); //Fail 
	//Assert.assertFalse(actualTitle.equals(expectedTitle),"Test  Message");  
	 } 
	} 


