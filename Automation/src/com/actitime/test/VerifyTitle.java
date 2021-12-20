package com.actitime.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void testVerifyTitle()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String expectedTitle = "Doodle";
		String actualTitle = driver.getTitle();
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("title is matching so PASS");
		}
		else
		{
			System.out.println("Title is not Matching so FAILED");
		}
		driver.close();
	}
}