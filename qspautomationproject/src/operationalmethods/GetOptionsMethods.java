package operationalmethods;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/SAGAR-pc/Desktop/HTML/singleselectdropdown.html");

		WebElement dropdownElement = driver.findElement(By.id("menu"));

		Select sel = new Select(dropdownElement);
		List<WebElement> options = sel.getOptions();
		
		//for loop
		for(WebElement option:options)
		{
			String value = option.getText();
			System.out.println(value);
		}
		
		
		
		
		
		
	}

}



