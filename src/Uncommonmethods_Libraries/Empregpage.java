package Uncommonmethods_Libraries;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Commonmethods_utils.Apputils;

public class Empregpage extends Apputils{
	
	public boolean empreg(String firstname, String lastname) 
	{
	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.linkText("Add Employee")).click();
	driver.findElement(By.id("firstName")).sendKeys(firstname);
	driver.findElement(By.id("lastName")).sendKeys(lastname);
	
	String empid = driver.findElement(By.name("employeeId")).getAttribute("value");
	
	driver.findElement(By.xpath("//*[@value ='Save']")).click();
	
	driver.findElement(By.linkText("Employee List")).click();
	
	driver.findElement(By.id("empsearch_id")).sendKeys(empid);
	
	driver.findElement(By.xpath("//*[@value='Search']")).click();
	
	WebElement table= driver.findElement(By.id("resultTable"));
	
	List<WebElement> rows = table.findElements(By.tagName("tr"));
	List<WebElement> coloms = rows.get(1).findElements(By.tagName("td"));
	
	if(coloms.get(1).getText().equals(empid))
		return true;
		else
			return false;
		
		
	}

}
