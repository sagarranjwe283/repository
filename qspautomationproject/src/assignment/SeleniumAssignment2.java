package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumAssignment2 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, AWTException 
	{

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev");
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//a[@class='nav-link']/span[.='Downloads']"));
		target.click();
		Thread.sleep(2000);
		WebElement target2 = driver.findElement(By.xpath("//h1[@class='display-1 mt-0 mt-md-5 pb-1']"));


		Actions act= new Actions(driver);
		Thread.sleep(4000);
		act.doubleClick(target2).perform();	

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		driver.findElement(By.xpath("//input[@class='form-control td-search-input ds-input']")).click();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

	}
}