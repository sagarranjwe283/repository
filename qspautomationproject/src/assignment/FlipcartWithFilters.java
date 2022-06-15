package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartWithFilters {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Dell Laptop");
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			driver.findElement(By.xpath("//div[@class='_3879cV']")).click();
			driver.findElement(By.xpath("//div[.='Windows 10']")).click();
			driver.findElement(By.xpath("//div[.='15 inch - 15.9 inch']")).click();
			
	}
}
