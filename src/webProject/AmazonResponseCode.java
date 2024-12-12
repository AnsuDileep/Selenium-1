package webProject;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonResponseCode {
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
			verify(link);
			
		}	
	}
	
	public void verify(String link)
	{
		try
		{
			
			@SuppressWarnings("deprecation")
			URL u=new URL(link);
			HttpURLConnection code = (HttpURLConnection)u.openConnection();	
			int cod = code.getResponseCode();
			
			if(cod==200)
			{
				System.out.println("Response Code: "+cod);
			}
			else if(cod==404)
			{
				System.out.println("Response Code: "+cod);
			}
			else
			{
				System.out.println("Other Response Code");
			}
		}
		catch(Exception e)
		{
			
		}
		
		
		
		
	}

}
