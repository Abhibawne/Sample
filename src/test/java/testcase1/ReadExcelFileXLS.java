package testcase1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.maven.com.Utility;

public class ReadExcelFileXLS {
	@Test
	public void ReadxlsFile() throws IOException {

//		WebDriver driver = Utility.getDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://demo.guru99.com/test/newtours/");
		// Create an object of File class to open xls file
		File file = new File("C:\\Users\\HP\\eclipse-workspace\\com.maven.com\\src\\test\\resources\\Book2.xls");
		// Create an object of FileInputStream class to read excel file
		FileInputStream fileinputstream = new FileInputStream(file);
		// create object of HSSFWorkbook class because we are reading xls format file
		
		HSSFWorkbook Workbook = new HSSFWorkbook(fileinputstream);
		
		// Call getSheet() method to read sheet name inside the workbook. The getSheet()
		// method will return sheet name.
		// Since the return type of getSheet method is an XSSFSheet.
		// Therefore, we will store the returning value by using variable 'sheet' with
		// type HSSFSheet.
		
		HSSFSheet Sheet = Workbook.getSheet("Sheet1");

		int lastRowNum = Sheet.getLastRowNum();
		for (int i = 1; i <= lastRowNum; i++) {

			for (int j = 0; j < Sheet.getRow(i).getLastCellNum(); j++) {
				System.out.print(" " + Sheet.getRow(i).getCell(j).getStringCellValue());

//				driver.findElement(By.xpath("//input[@name='userName']"))
//						.sendKeys(Sheet.getRow(i).getCell(j).getStringCellValue());
//				driver.findElement(By.xpath("//input[@name='password']"))
//						.sendKeys(Sheet.getRow(i).getCell(j).getStringCellValue());
////				driver.findElement(By.xpath("//input[@name='submit']")).click();
//				
			}
			System.out.println();
		}
	}

}
