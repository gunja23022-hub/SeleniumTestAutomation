package window_switch;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_test_tab {

	public static void main(String[] args) {
		 // Launch Chrome
        WebDriver driver = new ChromeDriver();

        // Open website
        driver.get("https://testautomationpractice.blogspot.com/");
        
     // Maximize browser
 		driver.manage().window().maximize();

     // Save main window
        String mainHandle = driver.getWindowHandle();
        
   
     //  Scroll to New Tab button and click
        driver.findElement(By.xpath("//button[normalize-space()='New Tab']"))
              .click();
        
        
        // Wait for new tab
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        
     //  Get all window handles
        Set<String> window = driver.getWindowHandles();
        
        
        //Print total windows
        System.out.println("Total windows :" + window.size());
        
        //Switch to the new tab
        String newTab = window.toArray(new String[0])[1];
        driver.switchTo().window(newTab);
        
        // 8. Print title and URL of new tab
        System.out.println("New tab title: " + driver.getTitle());
        System.out.println("New tab URL: " + driver.getCurrentUrl());

        // 9. Close new tab
        driver.close();

        // 10. Switch back to main window
        driver.switchTo().window(mainHandle);

        // 11. Print main window title
        System.out.println("Main window title: " + driver.getTitle());

        // 12. Close browser
        driver.quit();
     
     
	}

}
