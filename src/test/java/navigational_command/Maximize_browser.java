package navigational_command;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize_browser {

	public static void main(String[] args) {
	    // Launch Chrome
        WebDriver driver = new ChromeDriver();

        // Maximize browser before navigation
        driver.manage().window().maximize();

        // Open Amazon
        driver.get("https://www.amazon.in");

        // Print page title
        System.out.println("Page Title: " + driver.getTitle());

        // Print current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Close browser
        driver.quit();
    }
}