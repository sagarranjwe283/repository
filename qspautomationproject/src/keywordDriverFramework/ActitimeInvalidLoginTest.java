package keywordDriverFramework;

import java.io.IOException;

import org.openqa.selenium.By;

import readExcelData.Flib;

public class ActitimeInvalidLoginTest extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt=new BaseTest();
		bt.openBrowser();
		Thread.sleep(2000);
		Flib flib=new Flib();
		int rc=flib.getRowCount(EXCEL_PATH,"Sheet1");
		
		for(int i=1;i<=rc;i++)
		{
			String username = flib.readExcelData(EXCEL_PATH,"Sheet1",i,0);
			String password = flib.readExcelData(EXCEL_PATH,"Sheet1",i,1);
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
			
		}
		bt.closeBrowser();
	}
	
}
