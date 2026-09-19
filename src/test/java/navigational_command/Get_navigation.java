package navigational_command;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_navigation {

	public static void main(String[] args) {
		
		// Launch Chrome
				WebDriver driver = new ChromeDriver();
			
		// Open Google using get()
		        driver.get("https://www.wikipedia.org");
		        
		     // Print page title
		        System.out.println("Page Title: " + driver.getTitle());

		        // Verify title
		        if (driver.getTitle().contains("Wikipedia")) {
		            System.out.println("PASS");
		        } else {
		            System.out.println("FAIL");
		        }

		        // Close browser
		        driver.quit();

}
}
