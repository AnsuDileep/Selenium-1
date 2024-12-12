package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GooglePassParameter {
	
	EdgeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}
	
	@Parameters("search")
	@Test
	public void googleSearch(String search)
	{
		driver.findElement(By.name("q")).sendKeys(search,Keys.ENTER);
	}

}
