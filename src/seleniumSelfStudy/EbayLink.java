package seleniumSelfStudy;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EbayLink {
	
	EdgeDriver driver;
	@Before
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	}
	
	@Test
	public void linkCount() 
	{
		List<WebElement> aTagList = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links: "+aTagList.size());
		for(WebElement aTag:aTagList)
		{
			@Nullable
			String link = aTag.getAttribute("href");
			try {

			URL u=new URL(link);
			HttpURLConnection httpURL = (HttpURLConnection)u.openConnection();
			int respCode = httpURL.getResponseCode();
			
			if(respCode==200)
			{
				System.out.println("Response Code: 200"+link);
			}
			else if(respCode==404)
			{
				System.out.println("Error code: "+link);
			}
			else
			{
				System.out.println("Other links: "+link);
			}
		}
			catch(Exception e)
			{
				
			}
	}

}
}
