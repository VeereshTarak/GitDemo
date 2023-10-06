package Testcases;

import org.testng.annotations.Test;

import Commonmethods_utils.Apputils;
import Uncommonmethods_Libraries.Loginpage;

public class AdminLoginwithValiddata {
	
	@Test
	public void AdminLogintest() throws InterruptedException 
	{
		Apputils.openbrowser();
		
		Loginpage lp = new Loginpage();
		lp.Login("Admin", "Qedge123!@#");
		
		boolean res = lp.IsAdminModuleDisplayed();
		
		
		lp.Logout();
		
		
		Apputils.closebrowser();
		
		
	
		
	}

}
