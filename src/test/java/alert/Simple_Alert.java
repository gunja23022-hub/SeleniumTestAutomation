package alert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Simple_Alert {

	public static void main(String[] args) {
		
		// Launch Chrome
		WebDriver driver = new ChromeDriver();
	
		//Navigate to URL
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// Maximize browser
		driver.manage().window().maximize();
		
		// Create WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
       // Scroll to Simple Alert button
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		//Click Simple Alert button
		driver.findElement(By.id("alertBtn")).click();
		
		//Switch to alert
		String actual =driver.switchTo().alert().getText();
		
		//Get alert message
		System.out.println("Alert Text: " + actual);
		
		//Expected message
		Assert.assertEquals(actual, "I am an alert box!");
		System.out.println("PASS");
		
		//Accept Alert
		driver.switchTo().alert().accept();
		
		//Print Success message
		System.out.println("Simple alert accepted successfully");
		
		//Close Browser
		driver.close();
		
		
		
		
		
		
		
		
	}

}
