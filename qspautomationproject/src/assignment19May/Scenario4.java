package assignment19May;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario4 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("apple watches");
		WebElement dropdownel = driver.findElement(By.xpath("//select[@class='gh-sb ']"));
		Select sel=new Select(dropdownel);
		sel.selectByVisibleText("Cell Phones & Accessories");
		driver.findElement(By.xpath("//input[@class='btn btn-prim gh-spr']")).click();
				
		WebElement txt = driver.findElement(By.xpath("//h3[.='Apple Watch Series 7 6 5 4 3D Edge Tempered Glass Full Screen Protector 41/45mm']"));
		String text = txt.getText();
		System.out.println(text);
	}

}
