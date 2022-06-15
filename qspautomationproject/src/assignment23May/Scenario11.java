package assignment23May;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario11 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(4000);
		WebElement target = driver.findElement(By.xpath("//li[@class='menuparent offers-menuparent pull-right']/span[@class='prcs-d']"));
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();
		//10% Making Charges Off on Plain Gold Jewellery.
		
		driver.findElement(By.xpath("//span[.='10% Making Charges Off on Plain Gold Jewellery']")).click();
		Thread.sleep(3000);
		driver.quit();
		
	}
}
