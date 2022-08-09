package testcase1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import com.maven.com.Utility;

public class FluientWait {

	@Test
	public void Wait() {
		WebDriver driver = Utility.getDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://demoqa.com/alerts");

		//driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		driver.findElement(By.xpath("(//button)[3]")).click();  //by index
		// Declare and initialise a fluent wait
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		// Specify the timout of the wait
		wait.withTimeout(Duration.ofSeconds(6));
		// Sepcify polling time
		wait.pollingEvery(Duration.ofMillis(2));
		wait.ignoring(NoSuchElementException.class);
		// Specify what exceptions to ignore
		wait.until(ExpectedConditions.alertIsPresent());

		driver.switchTo().alert().accept();

	}

}
