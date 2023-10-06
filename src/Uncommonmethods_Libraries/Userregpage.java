package Uncommonmethods_Libraries;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Commonmethods_utils.Apputils;

public class Userregpage extends Apputils
{
	public boolean Userreg(String empname, String uname, String pwd,String cpwd,String usname ) throws InterruptedException 
	{
		driver.findElement(By.linkText("Admin")).click();
		
		Actions a = new Actions(driver);
		 
		a.moveToElement(driver.findElement(By.id("menu_admin_UserManagement")));
		WebElement move = driver.findElement(By.id("menu_admin_viewSystemUsers"));
		a.moveToElement(move).doubleClick().build().perform();
		
		driver.findElement(By.id("btnAdd")).click();
		
		Select emp = new Select(driver.findElement(By.id("systemUser_userType")));
		emp.selectByIndex(1);
		
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(empname);
		driver.findElement(By.id("systemUser_userName")).sendKeys(uname);
		String urname = driver.findElement(By.id("systemUser_userName")).getAttribute(usname);
		Select un = new Select(driver.findElement(By.id("systemUser_status")));
		un.selectByIndex(0);
	
		driver.findElement(By.id("systemUser_password")).sendKeys(pwd);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(cpwd);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("btnSave")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(usname);
		
		driver.findElement(By.id("searchBtn")).click();
		
		WebElement table=driver.findElement(By.id("resultTable"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		List<WebElement> coloms = rows.get(1).findElements(By.tagName("td"));
		if(coloms.get(1).getText().equals(urname))
			return true;
		else
			return false;
				
		
		
		
		
		
		 
		
		
	}

}
