package navigational_command;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_compare {

	public static void main(String[] args) {
		// Launch Chrome
        WebDriver driver = new ChromeDriver();

        // Open Google using get()
        driver.get("https://www.google.com");
        System.out.println("Google Title: " + driver.getTitle());

        // Go to Wikipedia using navigate().to()
        driver.navigate().to("https://www.wikipedia.org");
        System.out.println("Wikipedia Title: " + driver.getTitle());

        // Go back to Google
        driver.navigate().back();
        System.out.println("Back to Google Title: " + driver.getTitle());

        // Print completion message
        System.out.println("Demonstration complete");

        // Close browser
        driver.quit();
    
	   // Close browser
		driver.close();

	}

}
