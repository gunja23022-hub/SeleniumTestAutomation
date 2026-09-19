package RadioButton;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Checkbox {

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
		
		 // 3. Wait for Account Information heading
        driver.findElement(By.xpath("//b[normalize-space()='Enter Account Information']"));

        // 4. Check initial state
        System.out.println("Newsletter initially: " + driver.findElement(By.id("newsletter")).isSelected());
        
        // 5. Select Newsletter
        driver.findElement(By.id("newsletter")).click();
        
        // 6. Select Special Offers
        driver.findElement(By.id("optin")).click();
        
        // 7. Assert both selected
        Assert.assertTrue(driver.findElement(By.id("newsletter")).isSelected());
        Assert.assertTrue(driver.findElement(By.id("optin")).isSelected());

        System.out.println("Newsletter selected: PASS");
        System.out.println("Special Offers selected: PASS");
        
        // 8. Deselect Newsletter
        driver.findElement(By.id("newsletter")).click();

        // 9. Check Newsletter deselected
        Assert.assertFalse(driver.findElement(By.id("newsletter")).isSelected());
        System.out.println("Newsletter deselected: PASS");

        // Check Special Offers remains selected
        Assert.assertTrue(driver.findElement(By.id("optin")).isSelected());
        System.out.println("Special Offers remains selected: PASS");

        // 10. Close browser
        driver.quit();
        
        


		
	}

}
