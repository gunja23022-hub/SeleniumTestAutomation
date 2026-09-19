package Window_command;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Multiple_tab {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		// Main window
		driver.get("https://www.google.com");

		String mainWindow = driver.getWindowHandle();

		// Maximize browser
		driver.manage().window().maximize();

		// Open second tab
		((org.openqa.selenium.JavascriptExecutor) driver)
				.executeScript("window.open('https://www.wikipedia.org','_blank');");

		// Get all windows
		Set<String> windows = driver.getWindowHandles();

		// Convert to array
		String[] handles = windows.toArray(new String[0]);

		// Switch to second window
		driver.switchTo().window(handles[1]);
		System.out.println("Second Tab title: " + driver.getTitle());

		// Close second tab
		driver.close();

		// Switch back to Google
		driver.switchTo().window(mainWindow);

		System.out.println("Main window title: " + driver.getTitle());

		// Close browser
		driver.quit();

	}

}
