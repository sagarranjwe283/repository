package pageobjectmodel;

import java.io.IOException;

public class TestActiTimeValidLogin extends BaseTest{
	
	public static void main(String[] args) throws IOException {
		
		BaseTest bt =new BaseTest();
		bt.setUp();//open the browser and launch the web app
		Flib flib = new Flib();
		
		//read the data from excel file by using generic reusable methods
		String validUsername = flib.readPropertyFile("./Data/config.properties", "username");
		String validPassword = flib.readPropertyFile("./Data/config.properties", "password");
		
		LoginPage lp = new LoginPage(driver);
		//perform login
		lp.actiTimeValidLogin(validUsername, validPassword);
		//close the browsers
		bt.tearDown();
	}

}