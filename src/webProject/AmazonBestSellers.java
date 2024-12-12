package webProject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonBestSellers {
	
	EdgeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
	}
	

	@Test
	public void locateBestSellers()
	{
		driver.findElement(By.xpath("//a[4][@tabindex='0']")).click();
		
				
	}
}
