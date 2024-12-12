package webProject;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PrintLinkAndLinkText {
	
	EdgeDriver driver;
	@Before
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.get("https:www.amazon.in");
	}
 
	@Test
	public void PrintLinks()
	{
		List<WebElement> linkCount=driver.findElements(By.tagName("a"));
		System.out.println("Number of links= "+linkCount.size());
		
		for(WebElement element:linkCount)
		{
			String link=element.getAttribute("href");
			System.out.println("Link= "+link);
			String linkText=element.getText();
			System.out.println("Link text="+linkText);
		}
	}
}
