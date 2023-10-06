package Uncommonmethods_Libraries;

import org.openqa.selenium.By;

import Commonmethods_utils.Apputils;



public class Loginpage extends Apputils 
{
	public void Login(String username, String password)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
	}

	public void Logout() throws InterruptedException 
	{
		driver.findElement(By.partialLinkText("Welcome ")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
	}
	
	public boolean IsAdminModuleDisplayed() 
	{
		if(driver.findElement(By.linkText("Admin")).isDisplayed()) 
		{
			return true;
		}else 
		{
			return false;
		}
				
				
	}
	public boolean IsEmpModuleDisplayed() 
	{
		if(driver.findElement(By.linkText("Admin")).isDisplayed()) 
		{
			return true;
		}else 
		{
			return false;
		}
	}
	
	public boolean IserrmsgDisplayed() 
	{
		
	String errmsg = driver.findElement(By.id("spanMessage")).getText();
	if(errmsg.contains("Invalid")) 
	{
		return true;
	}else 
	{ 
		return false;
	}
	}

}

