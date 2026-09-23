package com.stad.testautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticePage {
	
	//Constructor - To initialize the driver
	
		WebDriver driver;
		
		public PracticePage(WebDriver driver){
			
		
		this.driver=driver;
		PageFactory.initElements(driver, this); //Mandatory for all page class
		
		}
		
		// Locators/Page Element
		
		//By link_Practice_TestLoginPage= By.xpath("//a[text()='Test Login Page']");
		
		@FindBy(xpath="//a[text()='Test Login Page']")
		WebElement link_Practice_TestLoginPage;
		
		
		//Action Methods
		
		public void clickOnPracticeLink() {
			
		//driver.findElement(link_Practice_TestLoginPage).click();
			link_Practice_TestLoginPage.click();
			
		}

}



