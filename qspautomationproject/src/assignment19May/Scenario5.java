package assignment19May;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario5 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//li[@class='menuparent repb']/a[@title='Rings']")).click();
		
		driver.findElement(By.xpath("//span[.='More Filters']")).click();
		driver.findElement(By.xpath("//span[@data-p='jewellery@filter@rings-rs+0+to+10000!!']")).click();
		driver.findElement(By.xpath("//span[@class='view-by-wrap title style-outline i-right']")).click();
		
		
	}

}
