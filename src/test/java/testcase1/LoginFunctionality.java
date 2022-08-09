package testcase1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import com.maven.com.Utility;
import pages.LoginPage;

public class LoginFunctionality {
	WebDriver driver;
	LoginPage loginpage;

	@Test
	public void verifyValidlogin() {  
		driver = Utility.getDriver();
		loginpage = new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(Utility.getValue("url"));
		driver.manage().window().maximize();
		
		loginpage.setUserNameTextBox();
		loginpage.getUserNameTextBox().sendKeys("Admin");
		//sendKeys(Utility.getValue("userName"));
		
		loginpage.setPasswordTexBox();
		loginpage.getPasswordTexBox().sendKeys("admin123");
		//sendKeys(Utility.getValue("password"));
		
		loginpage.setLoginButton();
		loginpage.getLoginButton().click();
		
		WebElement element = driver.findElement(By.xpath("//b[text()='PIM']//parent::a"));
		element.click();                        // b[text()='PIM']/.. we can give
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
		driver.findElement(By.linkText("Employee List")).click();
		WebElement selectdropdown = driver.findElement(By.xpath("//select[@id='empsearch_employee_status']"));
		selectdropdown.click();
		Select select = new Select(selectdropdown);
		select.selectByVisibleText("Part-Time Contract");

	}

}
