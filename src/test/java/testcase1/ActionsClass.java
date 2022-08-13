package testcase1;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsClass {

	 static Logger log = Logger.getLogger(ActionsClass.class);

	@Test
	public void AdvanceActions() {
		
		PropertyConfigurator.configure("log4j.properties");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\com.maven.com\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		log.info("before open google.com");
		driver.get("https://www.google.com/");
		Assert.assertEquals(driver.getTitle(), "amazon");
		log.info("after open google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(driver.getTitle());

		WebElement element = driver.findElement(By.xpath("//a[@aria-label='Google apps']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();

		element = driver.findElement(By.xpath("//input[@title='Search']"));
		actions.keyDown(element, Keys.SHIFT).sendKeys("A").keyUp(Keys.SHIFT).build().perform();
		actions.contextClick(element).build().perform();
		//actions.keyDown(element, Keys.ALT).clickAndHold().keyUp(Keys.ALT).build().perform();
	}

}
