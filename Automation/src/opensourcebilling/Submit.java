package opensourcebilling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.opensourcebilling.org/");
	driver.findElement(By.id("user_login_btn")).submit();
}
}
