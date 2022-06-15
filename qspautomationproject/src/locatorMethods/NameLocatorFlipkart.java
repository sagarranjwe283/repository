package locatorMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocatorFlipkart 
{
	public static void main(String[] args) 
    {
 	   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/?s_kwcid=AL!739!3!582822043916!p!!g!!flipkart%20login&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gclid=CjwKCAjwu_mSBhAYEiwA5BBmf96NIAv8tAPT6BNoPK-HJaxQNvRNclCi8-Ckh-BZPKNQkIDqkeKw4BoC1JUQAvD_BwE");
		driver.findElement(By.name("text")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.id("submit")).click();
    }
}
