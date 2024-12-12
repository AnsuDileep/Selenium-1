package webProject;

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
	public void AmazonSearchMobiles()
	{
		driver.findElement(By.xpath("//form[@id='nav-search-bar-form']/div[2]/div[1]/div[1]/input")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//form[@id='nav-search-bar-form']/div[3]/div[1]/span/input")).click();		
	}
}
