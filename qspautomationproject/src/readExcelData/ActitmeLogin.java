package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitmeLogin {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=c3b1l65crh9b8");
		FileInputStream fis = new FileInputStream("./data/ActitimeLogin.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet("Sheet1");
		Row row = sh.getRow(1);
		org.apache.poi.ss.usermodel.Cell cell = row.getCell(0);
		String username = cell.getStringCellValue();
		
		FileInputStream fis2 = new FileInputStream("./data/ActitimeLogin.xlsx");
		Workbook wb2 = WorkbookFactory.create(fis2);
		org.apache.poi.ss.usermodel.Sheet sh2 = wb2.getSheet("Sheet1");
		Row row2 = sh2.getRow(1);
		org.apache.poi.ss.usermodel.Cell cell2 = row2.getCell(1);
		String password = cell2.getStringCellValue();
		
		
		
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		
	}

}
