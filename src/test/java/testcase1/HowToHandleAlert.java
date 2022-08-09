package testcase1;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.maven.com.Utility;
import pages.AlertPages;

public class HowToHandleAlert {
	AlertPages alertpages;
	WebDriver driver;

	@Test
	public void VarifyAlert() throws InterruptedException {

		this.driver = Utility.getDriver(); // return webdriver
		alertpages = new AlertPages(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		alertpages.setLongTimeTakenAlert();
		Utility.scrollIntoView(driver, alertpages.getLongTimeTakenAlert());
		alertpages.getLongTimeTakenAlert().click();
		// explicitlywait
		WebDriverWait webdriverwait = new WebDriverWait(driver, Duration.ofSeconds(6));
		webdriverwait.until(ExpectedConditions.alertIsPresent());

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(5000);
		alert.accept();
		// alert.dismiss(); this click cancel button not aplicable here

		alertpages.setSimpleAlert();
		Utility.scrollIntoView(driver, alertpages.getSimpleAlert());
		alertpages.getSimpleAlert().click();
		Alert alert1 = driver.switchTo().alert();
		alert1.sendKeys("this is alert");
		Thread.sleep(5000);
		System.out.println(alert1.getText());
		alert1.accept();
		//alert.dismiss(); //we can accept or dismiss alert
	}

}
