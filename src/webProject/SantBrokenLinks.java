package webProject;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SantBrokenLinks {
	
	EdgeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.get("https://www.santamonicaedu.in");
	}
	
	@Test
	public void link()
	{
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		
	};

}
