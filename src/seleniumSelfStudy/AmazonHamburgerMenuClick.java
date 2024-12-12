package seleniumSelfStudy;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonHamburgerMenuClick {

	
	EdgeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
	}
	
	@Test
	public void ClickHamburgerMenu()
	{
		driver.findElement(By.xpath("//span[@class='hm-icon-label']")).click();
	}
}
