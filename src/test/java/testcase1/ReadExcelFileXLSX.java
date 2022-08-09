package testcase1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.maven.com.Utility;

public class ReadExcelFileXLSX {

	@Test
	public void readExcelXlsx() throws IOException {
//		WebDriver driver= Utility.getDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
//		
		// create file class object to open the xlsx file
		File file = new File("C:\\Users\\HP\\eclipse-workspace\\com.maven.com\\src\\test\\resources\\Book1.xlsx");
		// create object of fileinputstream class to read file
		FileInputStream fileInputStream = new FileInputStream(file);
		// create XSSFWORK object
		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);

		XSSFSheet xssfsheet = xssfWorkbook.getSheet("Sheet1");

		int lastRowNum = xssfsheet.getLastRowNum();
		
		for (int i = 1; i < lastRowNum; i++) {
			for (int j = 0; j < xssfsheet.getRow(i).getLastCellNum(); j++) {
				System.out.print(" " + xssfsheet.getRow(i).getCell(j).getStringCellValue());
			}
			System.out.println();
		}
	}

}
