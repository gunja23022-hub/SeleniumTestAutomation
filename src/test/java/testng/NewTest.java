package testng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest extends Parentclass{
	
 
 
  @Test
  public void verifyLogoDisplayed() {
  System.out.println("Logo Method");
  Boolean logoDisplayStatus=driver.findElement(By.xpath("//img[@class='custom-logo']")).isDisplayed();
  System.out.println(logoDisplayStatus);
  }
  
  @Test
  public void login() throws IOException {
  System.out.println("Login Method");
  
 // String username=readConfigFile("username");
  //String  password=readConfigFile("password");
  
  driver.findElement(By.xpath("//a[text()='Practice']")).click();
  driver.findElement(By.xpath("//a[text()='Test Login Page']")).click();
  driver.findElement(By.id("username")).sendKeys(readConfigFile("username"));
  System.out.println(readConfigFile("username"));
  driver.findElement(By.id("password")).sendKeys(readConfigFile("password"));
  driver.findElement(By.id("submit")).click();
  
  }
  
}
