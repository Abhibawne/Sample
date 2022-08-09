package testcase1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.maven.com.Utility;

public class HowToTakeScreenshot {

	@Test
	public void takeScreenshot() throws IOException {
		WebDriver driver = Utility.getDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		// to tkae screenshot
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,
				new File("C:/Users/HP/eclipse-workspace/com.maven.com/src/test/resources/screenshot.png"));
	}

}
