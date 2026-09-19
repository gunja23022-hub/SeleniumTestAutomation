package testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Parentclass {
	 WebDriver driver;
	 @BeforeSuite
	  public void launchApp() throws IOException {
		  
	  System.out.println("Before Suite");  
	  driver = new ChromeDriver();
	  
	  driver.get(readConfigFile("url"));
	  driver.manage().window().maximize();
	  
	  }
	 
	 @AfterSuite
	  public void tearDown()
	  {
	  System.out.println("After Suite");
	  driver.quit();
	  }
	 
	 public String readConfigFile(String Key) throws IOException {
		 Properties prop = new Properties();
		 
		 String configPath = System.getProperty("user.dir") + "\\src\\test\\java\\testng\\Config";
		 
		 FileInputStream fis = new  FileInputStream(configPath);
		 
		 prop.load(fis);
		 
		 String value=prop.getProperty(Key);
		 
		 return value;
		 
	 }
	 
}
