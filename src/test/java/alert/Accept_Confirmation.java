package alert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Accept_Confirmation {

	public static void main(String[] args) {
				// Launch Chrome
				WebDriver driver = new ChromeDriver();
			
				//Navigate to URL
				driver.get("https://testautomationpractice.blogspot.com/");
				
				// Maximize browser
				driver.manage().window().maximize();
				 
		       // Scroll to Simple Alert button
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,500)");
				
				
				//Click Simple Alert button
				driver.findElement(By.id("confirmBtn")).click();
				
				// Create WebDriverWait
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.alertIsPresent());

				
				 // Print alert message
		        System.out.println("Alert Message: " + driver.switchTo().alert().getText());

		        // Click OK
		        driver.switchTo().alert().accept();
		        
		        //Get result
		        String actual = driver.findElement(By.id("demo")).getText();
		        System.out.println("Result: " + actual);

		        // Assertion
		        Assert.assertEquals(actual, "You pressed OK!");
		        System.out.println("PASS");

		      //Close Browser
				driver.close();
				
		        
		        
	}

}
