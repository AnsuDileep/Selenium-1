package seleniumSelfStudy;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintLink {
	
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	
	@Test
	public void printLinks()
	{
		List<WebElement> arrayOfLinks = driver.findElements(By.tagName("a"));
		
		System.out.println("No: of Links: "+arrayOfLinks.size());
		
		for(WebElement link:arrayOfLinks)
		{
			System.out.println("Link Text: "+link.getText());
			//System.out.println(link.getLocation());
			
		}
	}
	

}
