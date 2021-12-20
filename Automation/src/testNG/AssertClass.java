package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertClass {
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
		Assert.assertEquals(actualTitle , expectedTitle);
		driver.close();
	}
}

