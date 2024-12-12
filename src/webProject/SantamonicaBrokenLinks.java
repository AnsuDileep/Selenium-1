package webProject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SantamonicaBrokenLinks {

	EdgeDriver driver;
	@Before
	public void setUp() {
		driver = new EdgeDriver();
		driver.get("https://santamonicaedu.in/");
	}

	@Test
	public void brokenLinks() {

		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:" +linkList.size());
		for (WebElement links : linkList) {
			@Nullable
			String link = links.getAttribute("href");
			verify(link);
		}

	}

	public void verify(String link) {
	
		try 
		{
			@SuppressWarnings("deprecation")
			URL u = new URL(link);
			HttpURLConnection httpURL = (HttpURLConnection) u.openConnection();
			int code = httpURL.getResponseCode();
			if (code == 404) {
				
				System.out.println("Broken link: " +link);	
			}	
			else
			{
				System.out.println("Not a broken link");
			}
		}
		catch (Exception e) {

		}	
	}
	
}


