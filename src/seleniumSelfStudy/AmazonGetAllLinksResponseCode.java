package seleniumSelfStudy;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonGetAllLinksResponseCode {
	
	EdgeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
	}
	
	@Test
	public void getLinks()
	{
		List<WebElement> aTagList=driver.findElements(By.tagName("a"));
		System.out.println("Number of Links:"+aTagList.size());
		
		for(WebElement aTag:aTagList)
		{
			@Nullable
			String link = aTag.getAttribute("href");
			
			try {
			URL u=new URL(link);
			HttpURLConnection httpURL = (HttpURLConnection)u.openConnection();
			int responseCode = httpURL.getResponseCode();
			System.out.println("Response Code: "+responseCode);
			
			
		}
			catch(Exception e)
			{
				
			}
		
		
	}
	
	
	}
}
