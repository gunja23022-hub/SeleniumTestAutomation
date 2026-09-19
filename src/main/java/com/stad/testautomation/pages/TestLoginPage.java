package com.stad.testautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestLoginPage {
	
	
	//Constructor - To initialize the driver
	
		WebDriver driver; // this is declaration
		
		public TestLoginPage(WebDriver driver){
			
		
		this.driver=driver;
		PageFactory.initElements(driver, this); //Mandatory
		
		}
		
		// Locators/Page Element
		
		//By txtFeild_Login_Username = By.id("username");
		//By txtFeild_Login_Password = By.id("password");
		//By btn_Login_Submit = By.id("submit");
		//By btn_Login_Logout = By.xpath("//a[text()='Log out']");
		
		@FindBy(id="username")
		WebElement txtFeild_Login_Username;
		
		@FindBy(id="password")
		WebElement txtFeild_Login_Password;
		
		@FindBy(id="submit")
		WebElement btn_Login_Submit;
		
		@FindBy(xpath="//a[text()='Log out']")
		WebElement btn_Login_Logout;
		
		//Action Methods
		
		public void LoginToApplication(String username,String password) throws InterruptedException {
			
			
		//driver.findElement(txtFeild_Login_Username).sendKeys(username);
		//driver.findElement(txtFeild_Login_Password).sendKeys(password);
		//driver.findElement(btn_Login_Submit).click();
			
			txtFeild_Login_Username.sendKeys(username);
			Thread.sleep(3000);
			txtFeild_Login_Password.sendKeys(password);
			Thread.sleep(3000);
			btn_Login_Submit.click();
		}
		
		public Boolean logoutBtnDisplayed() throws InterruptedException
		{
			//Boolean btnDisplayedStatus = driver.findElement(btn_Login_Logout).isDisplayed();
			Boolean btnDisplayedStatus = btn_Login_Logout.isDisplayed();
			
			return btnDisplayedStatus;
		}
	
			
		}

	



