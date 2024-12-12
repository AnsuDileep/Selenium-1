package webProject;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateTag {
	
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
	}

	@Test
	public void getCount()
	{
		List<WebElement> linkCount=driver.findElements(By.tagName("a"));
		System.out.println("Number of links= "+linkCount.size());
		
		
	}
}
