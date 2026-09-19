package navigational_command;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_command {

	public static void main(String[] args) {
		// Launch Chrome
		WebDriver driver = new ChromeDriver();
	
		// Open Google using get()
        driver.get("https://www.google.com");
        
     // Print page title
        System.out.println("Page Title:" + driver.getTitle());
       
        // Close browser
        driver.close();
        
}
}
