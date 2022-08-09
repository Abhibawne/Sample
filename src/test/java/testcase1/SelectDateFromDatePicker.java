package testcase1;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import com.maven.com.Utility;
import pages.MainPage;

public class SelectDateFromDatePicker {
	MainPage mainPage;
	WebDriver driver;

	@Test
	public void VerifySelectDateFromDatePicker() {
		this.driver = Utility.getDriver();
		mainPage = new MainPage(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://demoqa.com/automation-practice-form");

		mainPage.setUserNameTextBox();
		mainPage.getUserNameTextBox().sendKeys("user1");
 
		mainPage.setLastNameTextBox();
		mainPage.getLastNameTextBox().sendKeys("userlastname");

		mainPage.setMaleRadioButton();
		System.out.println("before male button selected" +mainPage.getMaleRadioButton().isSelected());
		// creating the JavascriptExecutor interface object by type casting of webdriver
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", mainPage.getMaleRadioButton());
		
		System.out.println("After male button selected" +mainPage.getMaleRadioButton().isSelected());
		System.out.println("is displayed" +mainPage.getMaleRadioButton().isDisplayed());
		
		mainPage.setDatePickerTexBox();
		Utility.scrollIntoView(driver, mainPage.getDatePickerTexBox());
		mainPage.getDatePickerTexBox().click();

		mainPage.setYearDropDown();
		Select select = new Select(mainPage.getYearDropDown());
		select.selectByValue("1998");

		mainPage.setMonthDrodown();
		Select selectMonth = new Select(mainPage.getMonthDrodown());
		selectMonth.selectByVisibleText("September");

		Utility.setDate("25", driver);

		mainPage.setHobbiesCheckBox();
		executor.executeScript("arguments[0].click();", mainPage.getHobbiesCheckBox());

		mainPage.setUploadFile();
		mainPage.getUploadFile()
				.sendKeys("C:\\Users\\HP\\eclipse-workspace\\com.maven.com\\src\\test\\resources\\users.properties");
	}

}
