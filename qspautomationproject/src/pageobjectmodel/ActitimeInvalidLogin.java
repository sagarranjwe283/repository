package pageobjectmodel;

import java.io.IOException;

public class ActitimeInvalidLogin extends BaseTest
{

	public static void main(String[] args) throws IOException 
	{

		BaseTest bt=new BaseTest();
		bt.setUp();// open the browser
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		//get the row count to iterate the for loop
		int rc = flib.getRowCount("./Data/ActitimeLogin.xlsx","Sheet1");
		for(int i=1;i<=rc;i++)
		{
			String invalidUsername = flib.readExcelData("./Data/ActitimeLogin.xlsx","Sheet1", i, 0);
			String invalidPassword = flib.readExcelData("./Data/ActitimeLogin.xlsx","Sheet1", i, 1);
			//perform invalid login
			lp.actiTimeInvalidLogin(invalidUsername, invalidPassword);
		}
		//close the browser
		bt.tearDown();


	}
}
