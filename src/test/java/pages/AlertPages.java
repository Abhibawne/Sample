package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertPages {
	WebDriver driver;
	WebElement LongTimeTakenAlert;
	WebElement SimpleAlert;
	
	public AlertPages(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getLongTimeTakenAlert() {
		return LongTimeTakenAlert;
	}

	public void setLongTimeTakenAlert() {
		LongTimeTakenAlert = driver.findElement(By.xpath("//*[@id='timerAlertButton']"));
	}            

	public WebElement getSimpleAlert() {
		return SimpleAlert;
	}

	public void setSimpleAlert() {
		SimpleAlert = driver.findElement(By.xpath("//*[@id='promtButton']")); //we can use * instead of tag name
	}

}
