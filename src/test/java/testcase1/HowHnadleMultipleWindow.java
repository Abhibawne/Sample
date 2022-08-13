package testcase1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.maven.com.Utility;

public class HowHnadleMultipleWindow {

	@Test
	public void MultileWindow() throws InterruptedException {

		WebDriver driver = Utility.getDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/browser-windows");
		// getting current window handle
		String mainwindow = driver.getWindowHandle();

		// open new window
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();

		// to handle all new opened window
		Set<String> WindowHnadle = driver.getWindowHandles();

		for (String childwindow : WindowHnadle) {
			if (!(childwindow.equals(mainwindow))) {
				driver.switchTo().window(childwindow);
				driver.manage().window().maximize();
				Thread.sleep(1000);
				System.out.println(driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());
				driver.close(); // will close child window
			}
		}
		driver.switchTo().window(mainwindow);
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		// driver.close(); //will close main window
		// driver.quit(); //will close all window
	}

}
