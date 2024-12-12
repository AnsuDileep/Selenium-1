package seleniumSelfStudy;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonSearch {
	
	EdgeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
	}

	@Test
	public void amazonSearchClick()
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Womens Kurti under 500");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
	}
}
