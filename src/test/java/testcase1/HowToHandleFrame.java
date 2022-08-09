package testcase1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.maven.com.Utility;

public class HowToHandleFrame {
	WebDriver driver;

	@Test
	public void HandleFrame() {
		driver = Utility.getDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

		driver.get("https://demoqa.com/frames");
		WebElement element = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(element);
		String str = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
		System.out.println(str);
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//header/a")).getAttribute("href"));
	}

}
