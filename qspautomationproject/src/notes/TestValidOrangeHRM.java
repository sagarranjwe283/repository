package notes;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestValidOrangeHRM {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(4000);
		
		Flib flib = new Flib();
		String username = flib.readExcelData("./Data/TestData1.xlsx","Sheet1",1, 0);
		String password = flib.readExcelData("./Data/TestData1.xlsx","Sheet1",1, 1);
		WebElement usn = driver.findElement(By.id("txtUsername"));
		usn.sendKeys(username);
		WebElement pwd = driver.findElement(By.id("txtPassword"));
		pwd.sendKeys(password);
		WebElement loginbtn = driver.findElement(By.id("btnLogin"));
		loginbtn.click();
	  
		
		
	}

}
