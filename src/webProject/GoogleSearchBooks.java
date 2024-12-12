package webProject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class GoogleSearchBooks {

	EdgeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void GoogleSearch()
	{
		driver.findElement(By.name("q")).sendKeys("books",Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();
		
	}
}
