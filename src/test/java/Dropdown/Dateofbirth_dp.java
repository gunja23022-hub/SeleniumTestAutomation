package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dateofbirth_dp {

public static void main(String[] args) {
		
//Launch Chrome browser
WebDriver driver = new ChromeDriver();

//Navigate to URL
driver.get("https://www.automationexercise.com/login");

//Maximize browser
driver.manage().window().maximize();


// Enter name and unique email
driver.findElement(By.name("name")).sendKeys("Gunja");
driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("gunja23022@gmail.com");
driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();


// Wait for Account Information form to load
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("days")));




new Select(driver.findElement(By.id("days"))).selectByValue("15");

new Select(driver.findElement(By.id("months"))).selectByVisibleText("December");

new Select(driver.findElement(By.id("years"))).selectByValue("1997");

System.out.println("Selected Day: " + new Select(driver.findElement(By.id("days"))).getFirstSelectedOption().getText());

System.out.println("Selected Month: " + new Select(driver.findElement(By.id("months"))).getFirstSelectedOption().getText());

System.out.println("Selected Year: " + new Select(driver.findElement(By.id("years"))).getFirstSelectedOption().getText());

driver.close();






}

}

     