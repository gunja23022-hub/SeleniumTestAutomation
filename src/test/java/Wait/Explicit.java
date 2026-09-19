package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {

	public static void main(String[] args) {
		// Launch Chrome
		WebDriver driver = new ChromeDriver();
		
		// Set implicit wait of 15 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
		//Navigate to URL
        driver.get("https://www.google.com");
		
		// Maximize browser
		driver.manage().window().maximize();
		
		// Create WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchBox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("q"))
        );

        searchBox.sendKeys("Explicit Wait in Selenium");

        WebElement searchButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.name("btnK"))
        );

        searchButton.click();

        System.out.println("Explicit wait worked correctly");

        driver.quit();


	}

}
