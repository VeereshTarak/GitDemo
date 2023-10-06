package Testcases;

import org.testng.annotations.Test;

import Commonmethods_utils.Apputils;
import Uncommonmethods_Libraries.Empregpage;
import Uncommonmethods_Libraries.Loginpage;

public class AddingEmp {
	
   @Test
	public void Addemp() throws InterruptedException
	{
		
	   Apputils.openbrowser();
	   
	   Loginpage lr = new Loginpage();
	   lr.Login("Admin", "Qedge123!@#");
	   
	   Empregpage er = new Empregpage();
	   er.empreg("Taraka", "Ramarao");
	   
	   lr.Logout();
	   
	   Apputils.closebrowser();
	   	
		
	}
}
