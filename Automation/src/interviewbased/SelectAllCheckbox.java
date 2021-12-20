package interviewbased;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllCheckbox {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	driver.get("https://smartwebby.com/PHP/Phptips2.asp");
	List<WebElement> cb = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
	for(int i=0;i<cb.size();i++)
	{
		 cb.get(i).click();
	}
	Thread.sleep(4000);
	driver.close();
}
}