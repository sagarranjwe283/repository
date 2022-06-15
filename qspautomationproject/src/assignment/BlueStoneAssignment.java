package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneAssignment 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//p[@class='lc-1mwyrdx e16i86ec0']")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("sagar");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sagar");
		driver.findElement(By.xpath("//input[@id='0vgi1ck7sjq9_146917605549304831']")).sendKeys("1234567890");
		
		
	}
}