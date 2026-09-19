package mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RangeSlider {

	public static void main(String[] args) {
		// Launch Chrome browser
		WebDriver driver = new ChromeDriver();
	
		//Navigate to URL
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// Maximize browser
		driver.manage().window().maximize();
		        
       // Scroll to Simple Alert button
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		// locate the range slider
		WebElement slider = driver.findElement(By.xpath("//div[@id='slider-range']"));
		
		
		 // Print current amount
        String currentAmount = driver.findElement(By.id("amount")).getAttribute("value");
        System.out.println("Current amount: " + currentAmount);

        // Drag slider 50 pixels to the right
        new Actions(driver)
                .clickAndHold(slider)
                .moveByOffset(50, 0)
                .release()
                .perform();

        // Print new amount
        String newAmount = driver.findElement(By.id("amount")).getAttribute("value");
        System.out.println("New amount: " + newAmount);

        // Success message
        System.out.println("Slider moved successfully");

        // Close browser
        driver.quit();
	}

}
