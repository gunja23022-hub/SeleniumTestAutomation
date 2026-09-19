package WebElementandAssertion;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.testng.Assert;

		public class assert_login {


			public static void main(String[] args) throws InterruptedException {
				//Launch Chrome browser
				WebDriver driver = new ChromeDriver();

				//Navigate to URL
				driver.get("https://www.automationexercise.com/login");

				//Maximize browser
				driver.manage().window().maximize();
			
				//locate email address
				 WebElement email = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
				 
				 // Locate Password field
			      WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
			     
			     //invalid email
			      driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("invalid@test.com ");
			      
			      //invalid password
			      
			      driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("wrongpass123 ");
			      
			      // Read entered values
			      System.out.println("Email:"+ email.getAttribute("value"));
			      
			      
			      System.out.println("Password: " + password.getAttribute("value"));
			      
			      Thread.sleep(2000);
			      
			      driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
			      
			      // Error message
			      WebElement error = driver.findElement(By.xpath("//p[text()='Your email or password is incorrect!']"));

			      String actual = error.getText();

			      if(actual.equals("Your email or password is incorrect!")) {
			            System.out.println("PASS");
			      } else {
			            System.out.println("FAIL");
			      }
			      
			      driver.quit();					 
			      
			}

		


	}


