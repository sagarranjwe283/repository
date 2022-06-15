package xPathLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case1 {

	public static void main(String[] args) 
	{
	        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver(); 
			driver.manage().window().maximize();
			driver.get("https://www.opensource-demo.orangehrmlive.com/");
			driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}

}
