package interviewbased;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonURLLinks {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> allUrl = driver.findElements(By.xpath("//a"));
		int count = allUrl.size();
		for(int i =0;i<count;i++)
		{
			String url = allUrl.get(i).getAttribute("href");
			System.out.println(url);
		}
		driver.close();
	}
}