package locatorMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocatorLinkedin 
{
	public static void main(String[] args) 
    {
 	   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.coursera.org/login");
		driver.findElement(By.name("session_key")).sendKeys("Admin");
		driver.findElement(By.name("session_password")).sendKeys("admin123");
		driver.findElement(By.id("submit")).click();  //coursera works
    }
}
