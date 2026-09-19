package navigational_command;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_url {

	public static void main(String[] args) {
		
		  // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");
        System.out.println("Page Title:" + driver.getTitle());
        
     // Open Wikipedia
        driver.get("https://www.wikipedia.org");
        System.out.println("Wikipedia Title: " + driver.getTitle());

        // Open GitHub
        driver.get("https://www.github.com");
        System.out.println("GitHub Title: " + driver.getTitle());

        // Close browser
        driver.quit();

	}

}
