package mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Doubleclick {

	public static void main(String[] args) {
	
		// Launch Chrome browser
		WebDriver driver = new ChromeDriver();
	
		//Navigate to URL
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// Maximize browser
		driver.manage().window().maximize();
		        
       // Scroll to Simple Alert button
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		
		//Get Field1 value
		String feild1 = driver.findElement(By.id("field1")).getAttribute("value");
		System.out.println("Field1 value is: " + feild1);
				
		//Get Field2 value before double click
				String feild2 = driver.findElement(By.id("field2")).getAttribute("value");
				System.out.println("Field2 value is: " + feild2);
				
				//Double click Copy Text button
				new Actions(driver).doubleClick( driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"))).perform();
				
				//Get Field2 value after double click
				String feild21 = driver.findElement(By.id("field2")).getAttribute("value");
				System.out.println("Field2 after: " + feild21);
				
				//Assertion
				Assert.assertEquals(feild21, "Hello World!");
				System.out.println("PASS");
				
				//Close Browser
				driver.quit();
		}
			
		
}
	
