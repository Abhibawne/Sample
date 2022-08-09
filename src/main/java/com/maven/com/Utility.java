package com.maven.com;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {
	static Properties properties;

	public static String getValue(String key) {

		try {
			File file = new File(
					"C:\\Users\\HP\\eclipse-workspace\\com.maven.com\\src\\test\\resources\\users.properties");
			FileInputStream fileinputstream = new FileInputStream(file);
			properties = new Properties();
			properties.load(fileinputstream);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return (String) properties.get(key);
	}

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", getValue("chromeDriverPath"));
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	public static void setDate(String str, WebDriver driver) {
		driver.findElement(By.xpath("//div[text()='" + str + "']")).click();
	}

	public static void scrollIntoView(WebDriver driver, WebElement element) {
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver; // typecast
		javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
	}
}
