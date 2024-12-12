package webProject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsProgram {

	EdgeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void locateElements()
	{
		WebElement email=new driver.findElement(null)
		driver.findElement(By.name("email")).sendKeys("Abcd123");
		driver.findElement(By.name("pass")).sendKeys("abcd");
		driver.findElement(By.name("login")).click();
		
	}
	
}
