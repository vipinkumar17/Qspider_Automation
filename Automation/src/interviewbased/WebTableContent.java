package interviewbased;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableContent {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Dekstop%20Folder/html%20Code/book.html");
		List<WebElement> values = driver.findElements(By.xpath("//td"));
		int count = values.size();
		for(int i=0;i<count;i++)
		{
			String text = values.get(i).getText();
			System.out.println(text);
		}
		driver.close();
	}
	
}
