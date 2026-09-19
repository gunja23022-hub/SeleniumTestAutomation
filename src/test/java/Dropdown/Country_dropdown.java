package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Country_dropdown {

	public static void main(String[] args) {
		//Launch Chrome browser
		WebDriver driver = new ChromeDriver();

		//Navigate to URL
		driver.get("https://www.automationexercise.com/login");

		//Maximize browser
		driver.manage().window().maximize();


		// Enter name and unique email
		driver.findElement(By.name("name")).sendKeys("Gunja");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("gunja23022@gmail.com");
		driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();


		// Wait for Account Information form to load
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("country")));
		
		// Country dropdown
		Select Country = new Select(driver.findElement(By.id("country")));
		
		//Get and print all options
		List<WebElement> options = Country.getOptions();

		    for (WebElement option : options) {
		    System.out.println(option.getText());
		    
		 // Print total number of options
	        System.out.println("Total options: " + Country.getOptions().size());

	        // Select India
	        Country.selectByVisibleText("India");

	        // Get selected option
	        String selected = Country.getFirstSelectedOption().getText();
	        
	        // Check selected option
	        Assert.assertEquals(selected, "India");

	        System.out.println("Selected: " + selected);
	        System.out.println("PASS");

	        // Check whether multiple options can be selected
	        System.out.println("Is Multiple: " +Country.isMultiple());

	        // Close browser
	        driver.quit();
	    

		    	
		}
		

	}

}
