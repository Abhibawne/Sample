package testcase1;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.maven.com.Utility;

public class HowToScrollTillEnd {
	@Test
	public void ScrollTillEnd() {
		WebDriver driver = Utility.getDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		driver.get("https://demoqa.com/alerts");
		JavascriptExecutor JavascriptExecutor =(JavascriptExecutor)driver; //type cast
		JavascriptExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

}
