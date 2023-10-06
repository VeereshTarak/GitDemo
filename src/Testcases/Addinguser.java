package Testcases;

import org.testng.annotations.Test;

import Commonmethods_utils.Apputils;
import Uncommonmethods_Libraries.Loginpage;
import Uncommonmethods_Libraries.Userregpage;

public class Addinguser
{
	@Test
	public void AdduserTest() throws InterruptedException {
		
		Apputils.openbrowser();
		Loginpage ln = new Loginpage();
		ln.Login("Admin", "Qedge123!@#");
		
		ln.IsAdminModuleDisplayed();
		
		Userregpage un = new Userregpage();
		un.Userreg("senior ntr", "gr ntr","Jrntr123!@#", "Jrntr123!@#","gr ntr");
		
		ln.Logout();
		
	   Apputils.closebrowser();
	}
	
}
