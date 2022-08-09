package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	WebElement userNameTextBox;
	WebElement passwordTexBox;
	WebElement loginButton;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getUserNameTextBox() {
		return userNameTextBox;
	}

	public void setUserNameTextBox() {
		userNameTextBox = driver.findElement(By.xpath("//input[@name='txtUsername']"));
	}  ////input[@name='txtUsername']

	public WebElement getPasswordTexBox() {
		return passwordTexBox;
	}

	public void setPasswordTexBox() {
		passwordTexBox = driver.findElement(By.xpath("//input[@name='txtPassword']"));
	} ////input[@name='txtPassword']

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton() {
		loginButton = driver.findElement(By.xpath("//input[@name='Submit']"));
	} ////input[@name='Submit']
}
