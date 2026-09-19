package navigational_command;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_current_url {

	public static void main(String[] args) {
		
		  // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Open GitHub
        driver.get("https://www.github.com");

        // Print current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Print page title
        System.out.println("Page Title: " + driver.getTitle());

        // Close browser
        driver.quit();
    }
}