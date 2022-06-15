package assignment19May;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scenario6 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(4000);         
		WebElement target = driver.findElement(By.xpath("//li[@class='menuparent repb']/a[@title='Rings']"));
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();
		driver.switchTo().frame(1);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);




	}

}
