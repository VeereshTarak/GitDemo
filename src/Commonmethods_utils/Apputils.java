package Commonmethods_utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apputils {
	
	public static String url = "http://www.orangeHRM.qedgetech.com";
	public static WebDriver driver;

	public static void openbrowser()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Veeresh K\\eclipse-workspace\\TestNG\\drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(url);
	   
}
	public static void closebrowser() 
	{
		driver.close();
		
	}
}