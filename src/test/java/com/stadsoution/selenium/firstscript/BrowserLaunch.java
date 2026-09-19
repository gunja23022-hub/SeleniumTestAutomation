package com.stadsoution.selenium.firstscript;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver; 
/*1.Launch chrome browser 
2.Navigate to https://opensource-demo.orangehrmlive.com/web/index.php/auth/login 
3.Validate title as OrangeHRM
4.Close the browser*/ 
	

public class BrowserLaunch {

	public static void main(String[] args) {
		
		
		//ChromeDriver driver=new ChromeDriver(); 
		
		//1.Launch Chrome browser     
		WebDriver driver=new ChromeDriver(); 
		
	    //2.Navigate to https://opensource-demo.orangehrmlive.com/web/index.php/auth/login   
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");      
		
		//3.Validate title as OrangeHRM 
		
		 String actualTitle=driver.getTitle();     
		 
		 if(actualTitle.equals("OrangeHRM")) { 
		
			 System.out.println("Test is passed."); 
			 
		 }else { 
			 System.out.println("Test is failed.");            
			 }   
		 
		//4.Close the browser    
		 driver.close(); 
	}

}


