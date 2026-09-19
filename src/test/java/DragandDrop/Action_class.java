package DragandDrop;

import java.awt.dnd.DropTarget;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class {

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
		        
		        //Print source text before drag
		        System.out.println("Source text: " + source.getText());
		        
		        // Perform drag and drop
		        Actions actions = new Actions(driver);
		        actions.dragAndDrop(source, target).perform();
		        
		     // Print target text after drop
		        System.out.println("Target text after drop: " + target.getText());

		        // Confirmation message
		        System.out.println("Drag and Drop performed successfully");

		        // Close browser
		        driver.quit();



	}

}
