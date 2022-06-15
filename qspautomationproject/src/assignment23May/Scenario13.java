package assignment23May;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario13 {

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
		WebElement target = driver.findElement(By.xpath("//li[@class='menuparent offers-menuparent pull-right']/span[@class='prcs-d']"));
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();
		//Additional 50% Off on your 1st Installment on GMS
		
		driver.findElement(By.xpath("//span[.='Additional 50% Off on your 1st Installment on GMS']")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
