package WebElementandAssertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {

	public static void main(String[] args) {
				//Launch Chrome browser
				WebDriver driver = new ChromeDriver();

				//Navigate to URL
				driver.get("https://www.automationexercise.com/login");

				//Maximize browser
				driver.manage().window().maximize();
			
				//locate email address
				 WebElement email = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
				 
				 // 3. Locate Password field
			        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));

			      // 4. Locate Login button
			        WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
			        
			      //5.Print Email properties
			        System.out.println("Email Address Field");
			        System.out.println("Tag Name: " + email.getTagName());
			        System.out.println("Displayed: " + email.isDisplayed());
			        System.out.println("Enabled: " + email.isEnabled());

			        // Print Password properties
			        System.out.println("Password Field");
			        System.out.println("Tag Name: " + password.getTagName());
			        System.out.println("Displayed: " + password.isDisplayed());
			        System.out.println("Enabled: " + password.isEnabled());

			        // Print Login button properties
			        System.out.println("Login Button");
			        System.out.println("Tag Name: " + loginButton.getTagName());
			        System.out.println("Displayed: " + loginButton.isDisplayed());
			        System.out.println("Enabled: " + loginButton.isEnabled());

			        // 6. Print page title
			        System.out.println("Page Title: " + driver.getTitle());

			        // 7. Close browser
			        driver.quit();
			    }
			
}
			        
			        
			        
				
	


