package testcase1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.maven.com.Utility;

public class NavigationCommand {
	
	@Test
	public void NaviCommand() throws InterruptedException {
		WebDriver driver=Utility.getDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/alerts");
		System.out.println("title of url :" +driver.getTitle());
		System.out.println("current url" +driver.getCurrentUrl());
		
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().refresh();
//		Thread.sleep(1000);
//		driver.navigate().forward();
//		WebElement element =driver.findElement(By.xpath(""));
//		element.click();
	
	}

}
