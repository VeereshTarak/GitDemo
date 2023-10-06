package Testcases;

import org.testng.annotations.Test;

import Commonmethods_utils.Apputils;
import Uncommonmethods_Libraries.Loginpage;

public class AdminloginwithInvaliddata 
{
	@Test
	public void AdminlogininvalidTest() throws InterruptedException {
		
		Apputils.openbrowser();
		
		Loginpage lb = new Loginpage();
		lb.Login("cm", "ntr");
		
		lb.IserrmsgDisplayed();
		
	     lb.Logout();
	     
	     Apputils.closebrowser();
		
	}
	
	

}
