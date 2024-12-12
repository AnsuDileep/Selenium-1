package seleniumSelfStudy;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3Schools {

	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com");
	}
	
	@Test
	public void searchJava()
	{
		String source=driver.getPageSource();
		
		if(source.contains("Java"))
		{
			driver.findElement(By.xpath("//*[@id=\"subtopnav\"]/a[6]")).click();
			driver.findElement(By.xpath("//*[@id=\"leftmenuinnerinner\"]/a[11]")).click();
		}
	}
	

}