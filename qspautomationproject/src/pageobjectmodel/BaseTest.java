package pageobjectmodel;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import readExcelData.Flib;

public class BaseTest
{
	static WebDriver driver;
	//method to open the browser
	@SuppressWarnings("deprecation")
	
	public void setUp() throws IOException 
	{
		Flib flib=new Flib();
		//read the data from property file
		String browserValue =flib.readPropertyFile("./Data/config.properties","browser");
		//read the data from property file
		String url=flib.readPropertyFile("./Data/config.properties","url");
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
		}
		else
		{
			System.out.println("enter the correct choice");

		}
	}
	public void tearDown()
	{
		driver.quit();
	}
}
