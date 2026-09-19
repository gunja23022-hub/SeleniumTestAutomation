package DragandDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickandHold {

public static void main(String[] args) {
		
// Launch Chrome browser
WebDriver driver = new ChromeDriver();

//Navigate to URL
driver.get("https://testautomationpractice.blogspot.com/");

// Maximize browser
driver.manage().window().maximize();
        
// Scroll to Drag and Drop section
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,1200)");

// Locate draggable element
WebElement source = driver.findElement(By.id("draggable"));

// Locate droppable element
WebElement target = driver.findElement(By.id("droppable"));

//Perform drag and drop using Actions chaining
Actions actions = new Actions(driver);
actions
.clickAndHold(source)   // Press and hold source
.moveToElement(target)  // Move to target
.release()              // Release mouse
.build().perform();     // Execute action

//5. Print target text after drop
System.out.println("Target text after drop: " + target.getText());

// 6. Close browser
driver.quit();




	}
	
}
