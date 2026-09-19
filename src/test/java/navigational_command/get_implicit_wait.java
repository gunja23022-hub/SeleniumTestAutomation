package navigational_command;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_implicit_wait {

	public static void main(String[] args) {
		 // Launch Chrome
        WebDriver driver = new ChromeDriver();

        // Set implicit wait for 10 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open Flipkart
        driver.get("https://www.flipkart.com");

        // Locate search box and type laptop
        driver.findElement(By.name("q")).sendKeys("laptop");

        // Print message
        System.out.println("Page loaded and search performed");

        // Close browser
        driver.quit();
    }
}
