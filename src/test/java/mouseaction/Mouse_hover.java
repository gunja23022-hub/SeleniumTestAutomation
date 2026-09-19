package mouseaction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mouse_hover {

	private static WebElement pointMe;

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
				
				//Locate 'Point Me' button
				WebElement pointMe = driver.findElement(By.xpath("//button[normalize-space()='Point Me']"));
				
				// Hover mouse over 'Point Me'
		        Actions actions = new Actions(driver);
		        actions.moveToElement(pointMe).perform();
		        
		        //Locate 'Mobiles' sub-menu
				WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
				
				//Check whether Mobiles is displayed
		        System.out.println("Mobile is display :" +mobiles.isDisplayed());
		        
		        //Click Mobiles
		        mobiles.click();
		        
		        //Print success message
		        System.out.println("Mobiles sub-menu clicked successfully");
		        
		        //Close Browser
		        driver.close();
		        
		        
		        
	}

}
