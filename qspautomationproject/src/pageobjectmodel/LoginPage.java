package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//declaration
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginBtn;
	@FindBy(name="keepLoggedInCheckBox") private WebElement keepMeLoggedInCheckBox;
	@FindBy(xpath="//img[contains(@src,'timer')]") private WebElement logo;
	@FindBy(id="licenseLink") private WebElement licenselink;
	
	
	//initialisation
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//utilisation
	
	public WebElement getUsn() {
		return usn;
	}
	
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public WebElement getKeepMeLoggedInCheckBox() {
		return keepMeLoggedInCheckBox;
	}
	public WebElement getLogo() {
		return logo;
	}
	public WebElement getLicenselink() {
		return licenselink;
	}
	
	//generic reusable method
	public void actiTimeValidLogin(String validUsername, String validPassword)
	{
		usn.sendKeys(validUsername);
		pass.sendKeys(validPassword);
	}
	
	public void actiTimeInvalidLogin(String invalidUsername,String invalidPassword)
	{
		usn.sendKeys(invalidUsername);
		pass.sendKeys(invalidPassword);
		loginBtn.click();
		usn.clear();
		
	}
	
	
	//operational method
	
}

