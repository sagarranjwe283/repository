package assignment23May;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario16 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		//gold coin 1gm by weight.
		
		WebElement target = driver.findElement(By.xpath("//li[@class='menuparent gold-coins']/a[@title='Coins']"));
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();
		driver.findElement(By.xpath("//span[@data-p=\"gold-coins-weight-20gms,m\"]")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
