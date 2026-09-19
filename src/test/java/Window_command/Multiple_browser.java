package Window_command;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_browser {

	public static void main(String[] args) {
		// Launch Chrome
		WebDriver driver = new ChromeDriver();
					
		//Navigate to URL
		driver.get("https://www.google.com");
					
		// Get first window
	    	String firstWindow = driver.getWindowHandle();
	    
		// Maximize browser
		driver.manage().window().maximize();
		
		// Open second tab
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.open('https://www.wikipedia.org')");
		
		 // Get all window handles
		Set<String> allWindows = driver.getWindowHandles();
		
	    
		// Convert to array
		 String[] handles = allWindows.toArray(new String[0]);

		// Switch to second window
	  	  driver.switchTo().window(handles[1]);
	   	 System.out.println("Second window title: " + driver.getTitle());

	    
		// Switch back to first window
	    driver.switchTo().window(firstWindow);

	    System.out.println("First window title: " + driver.getTitle());

	    // Close browser
	    driver.quit();
		
		}

	
	
	}


