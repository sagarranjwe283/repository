package locatorMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocatorActitime 
{
       public static void main(String[] args) 
       {
    	   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
   		WebDriver driver=new ChromeDriver();
   		driver.manage().window().maximize();
   		driver.get("https://integrator.actitime.com/auth/at");
   		driver.findElement(By.name("actiTimeUrl")).sendKeys("Admin");
   		driver.findElement(By.name("username")).sendKeys("Admin");
   		driver.findElement(By.name("password")).sendKeys("admin123");
   		driver.findElement(By.id("submit")).click();
       }
}
