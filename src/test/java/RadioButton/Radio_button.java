package RadioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Radio_button {

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
				
				//Check Mr. before clicking
				System.out.println("Mr. before clicking: " + driver.findElement(By.id("id_gender1")).isSelected());
				
				// Click Mr.
		        driver.findElement(By.id("id_gender1")).click();
		        
		        //Check Mr
		        Assert.assertTrue(driver.findElement(By.id("id_gender1")).isSelected());
		        System.out.println("Mr. selected: PASS");
		        
		        //Click Mrs.
		        driver.findElement(By.id("id_gender2")).click();
		        
		       // Check Mrs.
		        Assert.assertTrue(driver.findElement(By.id("id_gender2")).isSelected());
		        System.out.println("Mrs. selected: PASS");

		        // Check Mr. deselected
		        Assert.assertFalse(driver.findElement(By.id("id_gender1")).isSelected());
		        System.out.println("Mr. deselected: PASS");

		        driver.quit();
		        
		        
		        
		        
		        
		        
		        
		        


	}

}
