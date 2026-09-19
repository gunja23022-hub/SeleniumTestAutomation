package testng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTesting  {
	
	WebDriver driver;
	@Test(priority=1)
	@Parameters({"browser"})
	
	public void launchApp(String browserName) throws IOException {
		  
		   switch(browserName.toLowerCase()) {
		   case "chrome":
			   driver = new ChromeDriver();
			   break;
			   
		   case "edge":
			   driver= new EdgeDriver();
			   break;
			   
		   case "firefox":
			   driver= new FirefoxDriver();
			   break;
			   
		   default:
			   System.out.println("Invalid browsername");
			   
			   
		   }
		//  driver = new ChromeDriver();
		  
		  driver.get("https://practicetestautomation.com/");
		  
		  System.out.println("https://practicetestautomation.com/");
		  
		  driver.manage().window().maximize();
		  
		 
		  
		  }
	
	@Test(priority=2)
	public void login() throws IOException, InterruptedException {
			
		  System.out.println("Login Method");	
		  driver.findElement(By.xpath("//a[text()='Practice']")).click();
		  driver.findElement(By.xpath("//a[text()='Test Login Page']")).click();
		  driver.findElement(By.id("username")).sendKeys("student");
		  Thread.sleep(3000);
		  driver.findElement(By.id("password")).sendKeys("Password123");
		  Thread.sleep(3000);
		  driver.findElement(By.id("submit")).click();
		  Thread.sleep(3000);
		  }

		@Test(priority=3)
		 public void tearDown()
		  {
		  System.out.println("After Suite");
		  driver.quit();
		  }
}
