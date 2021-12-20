package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class BaseClassCrossBrowser {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver..driver", "./driver.msedgedriver.exe");
	}
	public WebDriver driver;
	//@Parameters("browser")
	@BeforeTest
	public void openBrowser(String browser)
	{
		Reporter.log("OPEN Browser",true);
		if(browser.equals("chrome"))
		{
		driver = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		/*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@AfterTest
	public void closeBrowser()
	{
		Reporter.log("CLOSE Browser",true);
		driver.close();
	}
	@BeforeMethod
	public void login()
	{
		Reporter.log("LOGIN",true);
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("LOGOUT",true);
		driver.findElement(By.id("logoutLink")).click();
	}*/
}
}
