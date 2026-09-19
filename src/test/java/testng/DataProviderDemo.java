package testng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo extends Parentclass {
	@Test(dataProvider = "loginTestData")
	public void login(String username, String password) throws IOException, InterruptedException {
		 System.out.println("Login Method");
		
		driver.findElement(By.xpath("//a[text()='Practice']")).click();
		driver.findElement(By.xpath("//a[text()='Test Login Page']")).click();
		driver.findElement(By.id("username")).sendKeys(username);
		Thread.sleep(2000);
		System.out.println(readConfigFile("username"));
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		if (!username.equals("student") && password.equals("Password123")) {
			String errorText = driver.findElement(By.id("error")).getText();
			Assert.assertTrue(errorText.equals("Your username is invalid!"));
			
		} else if (username.equals("student") && !password.equals("Password123")) {
			String errorText = driver.findElement(By.id("error")).getText();
			Assert.assertTrue(errorText.equals("Your password is invalid!"));
			
		} else if (!username.equals("student") && !password.equals("Password123")) {
			String errorText = driver.findElement(By.id("error")).getText();
			Assert.assertTrue(errorText.equals("Your username is invalid!"));
			
		} else {
			Boolean displayStatus = driver.findElement(By.linkText("Log out")).isDisplayed();
			Assert.assertTrue(displayStatus);
		}
	}

	@DataProvider(name = "loginTestData",indices = {2,3})
	public Object[][] testData() {
		Object data[][] = 
			{ 		{ "student", "Password321" }, 
					{ "student1", "Password123" }, 
					{ "student1", "Password321" },
					{ "student", "Password123" }, };
		return data;
	}
}