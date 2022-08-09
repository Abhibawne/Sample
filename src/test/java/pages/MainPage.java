package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	WebDriver driver;
	WebElement userNameTextBox;
	WebElement lastNameTextBox;
	WebElement maleRadioButton;
	WebElement datePickerTexBox;
	WebElement yearDropDown;
	WebElement monthDrodown;
	WebElement uploadFile;
	WebElement hobbiesCheckBox;
	
	
	public MainPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getUserNameTextBox() {
		return userNameTextBox;
	}

	public void setUserNameTextBox() {
		this.userNameTextBox = driver.findElement(By.xpath("//input[@id='firstName']"));
	}

	public WebElement getLastNameTextBox() {
		return lastNameTextBox;
	}

	public void setLastNameTextBox() {
		this.lastNameTextBox = driver.findElement(By.id("lastName"));
	}

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public void setMaleRadioButton() {
		this.maleRadioButton = driver.findElement(By.xpath("//input[@value='Male']"));
	}

	public WebElement getDatePickerTexBox() {
		return datePickerTexBox;
	}

	public void setDatePickerTexBox() {
		this.datePickerTexBox = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
	}

	public WebElement getYearDropDown() {
		return yearDropDown;
	}

	public void setYearDropDown() {
		this.yearDropDown = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
	}

	public WebElement getMonthDrodown() {
		return monthDrodown;
	}

	public void setMonthDrodown() {
		this.monthDrodown = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
	}                  

	public WebElement getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile() {
		this.uploadFile = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
	}

	public WebElement getHobbiesCheckBox() {
		return hobbiesCheckBox;
	}

	public void setHobbiesCheckBox() {
		this.hobbiesCheckBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
	}
	

}
