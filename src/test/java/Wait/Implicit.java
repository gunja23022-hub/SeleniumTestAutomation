package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit {

	public static void main(String[] args) {
		
				// Launch Chrome
				WebDriver driver = new ChromeDriver();
				
				// Set implicit wait of 15 seconds
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
				//Navigate to URL
		        driver.get("https://www.flipkart.com");
				
				// Maximize browser
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("//span[@role='button']")).click();
				
				 // Locate search box and enter text
		        driver.findElement(By.name("q")).sendKeys("mobile phones");

		        // Locate search button and click
		        driver.findElement(By.cssSelector("button[type='submit']")).click();

		        
		        //Print current URL
		        System.out.println(driver.getCurrentUrl());
		        
		        // Print confirmation message
		        System.out.println("Implicit wait applied successfully");

		        // Close browser
		        driver.quit();
		        
		        
		        		
		        

	}

}
