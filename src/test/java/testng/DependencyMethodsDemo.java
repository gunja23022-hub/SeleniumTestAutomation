package testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DependencyMethodsDemo extends Parentclass{
	
	String username;
	String password;
	
	WebDriver driver;
	 @Test
	  public void launchApp() throws IOException {
		  
	  System.out.println("Launch App"); 
	  driver = new ChromeDriver();
	  
	  driver.get(readConfigFile("url"));
	  
	  System.out.println(readConfigFile("url"));
	  
	  driver.manage().window().maximize();
	  
	  }
	 

	 @Test(priority=2, dependsOnMethods = {"launchApp"})
	  public void verifyLogoDisplayed() {
	  System.out.println("Logo Method");
	  Boolean logoDisplayStatus=driver.findElement(By.xpath("//img[@class='custom-logo']")).isDisplayed();
	  System.out.println(logoDisplayStatus);
	  }
	  
	  @Test(priority=3, dependsOnMethods= {"launchApp"})
	  public void login() throws IOException {
	  System.out.println("Login Method");
	  
	  username=readConfigFile("username");
	  password=readConfigFile("password");
	  driver.findElement(By.xpath("//a[text()='Practice']")).click();
	  driver.findElement(By.xpath("//a[text()='Test Login Page']")).click();
	  driver.findElement(By.id("username")).sendKeys(readConfigFile("username"));
	  System.out.println(readConfigFile("username"));
	  driver.findElement(By.id("password")).sendKeys(readConfigFile("password"));
	  driver.findElement(By.id("submit")).click();
	  }
	  
	  
	  @Test(priority=4, dependsOnMethods= {"launchApp","login"})
	  public void verifyLoginSucessful() throws IOException {
		  System.out.println("Log Out Button");
		  Boolean displayStatus= driver.findElement(By.linkText("Log out")).isDisplayed();
		  Assert.assertTrue(displayStatus);
	  }
	  
	  @Test(priority=5)
	  public void tearDown()
	  {
	  System.out.println("Browser Quit"); 
	  driver.quit();
	  }
	  
}

