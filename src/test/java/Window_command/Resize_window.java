package Window_command;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resize_window {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

        // Open GitHub
        driver.get("https://www.github.com");

     // Get current window size
        Dimension size = driver.manage().window().getSize();

        System.out.println("Current width: " + size.getWidth());
        System.out.println("Current height: " + size.getHeight());

        // Resize window to 1024 x 768
        driver.manage().window().setSize(new Dimension(1024, 768));

        // Get new window size
        Dimension newSize = driver.manage().window().getSize();

        System.out.println("New width: " + newSize.getWidth());
        System.out.println("New height: " + newSize.getHeight());

        // Maximize window
        driver.manage().window().maximize();

        System.out.println("Window operations complete");

        // Close browser
        driver.quit();
	}

}
