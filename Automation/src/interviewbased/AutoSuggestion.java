package interviewbased;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(.,'selenium')]"));
		int count  = allSugg.size();
		for(int i =0;i<count;i++)
		{
			String sugg = allSugg.get(i).getText();
			System.out.println(sugg);
		}
		driver.close();
	}

}
