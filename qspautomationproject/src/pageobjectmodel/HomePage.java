package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//declaration

	@FindBy(xpath="//a[@class='logout']") private WebElement logOutLink;
	@FindBy(xpath="//input[@value=\"Create New Tasks\"]") private WebElement createNewTask;
	@FindBy(xpath="//div[.='Settings']") private WebElement settings;
	@FindBy(xpath="//a[.='Open Tasks']") private WebElement openTask; //extra 


	//intialization

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	//utilization

	public WebElement getLogOutLink() {
		return logOutLink;
	}

	public WebElement getCreateNewTask() {
		return createNewTask;
	}
	public WebElement getSettings() {
		return settings;
	}
}
