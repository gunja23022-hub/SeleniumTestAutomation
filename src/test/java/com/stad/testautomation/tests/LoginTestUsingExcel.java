package com.stad.testautomation.tests;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.stad.testautomation.pages.HomePage;
import com.stad.testautomation.pages.PracticePage;
import com.stad.testautomation.pages.TestLoginPage;

import excel.ReadDataFromExcel;

public class LoginTestUsingExcel {
	
	WebDriver driver;  
	//Before hook
	@BeforeClass
	public void setup()
	{
			driver=new ChromeDriver();// this is initialization
			driver.get("https://practicetestautomation.com/");
			driver.manage().window().maximize();
			
}
	@Test
	public void loginUsingExcelData() throws IOException, InterruptedException
	{
	List<String> list=ReadDataFromExcel.ReadDataFromExcelFile();
	
	String username1=list.get(0);
	String password1=list.get(1);
	
	String username2=list.get(2);
	String password2=list.get(3);
	
	String username3=list.get(4);
	String password3=list.get(5);
	
	String username4=list.get(6);
	String password4=list.get(7);
	
	login(username1,password1);
	login(username2,password2);
	login(username3,password3);
	login(username4,password4);
			
	
	}
	
	public void login(String username,String password) throws InterruptedException
	
	{
		HomePage homepage = new HomePage(driver);
		PracticePage practicepage = new PracticePage(driver);
		TestLoginPage testloginpage = new TestLoginPage(driver);
		
		homepage.clickOnPracticeLink();
		practicepage.clickOnPracticeLink();
		testloginpage.LoginToApplication(username, password);
	//	Boolean displayStatus=testloginpage.logoutBtnDisplayed();
		
	//	Assert.assertTrue(displayStatus);
		
	}
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	
	}
	
}



