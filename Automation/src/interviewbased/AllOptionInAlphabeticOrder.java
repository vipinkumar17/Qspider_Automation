package interviewbased;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOptionInAlphabeticOrder {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		ArrayList<String> al = new ArrayList<>();
		driver.get("file:///E:/Dekstop%20Folder/html%20Code/Hotel.html");
		WebElement slvListBox = driver.findElement(By.id("slv"));
				Select s = new Select(slvListBox);
				List<WebElement> allOption = s.getOptions();
				int count = allOption.size();
				for(int i=0;i<count;i++)
				{
					String option = allOption.get(i).getText();
					al.add(option);
				}
				Collections.sort(al);
				for(String opt:al)
				{
					System.out.println(opt);
				}
				driver.close();
	}
}
