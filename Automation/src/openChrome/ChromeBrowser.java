package openChrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChromeBrowser {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");
	WebDriver driver1 = new EdgeDriver();
	driver1.get("https://www.google.co.in/");
	driver.close();
}

}
