package locatorMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocatorTwitter 
{
	public static void main(String[] args) 
	{
		
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://twitter.com/i/flow/login");
	driver.findElement(By.name("text")).sendKeys("Admin");
	driver.findElement(By.id("btnLogin")).click();
    }
}
