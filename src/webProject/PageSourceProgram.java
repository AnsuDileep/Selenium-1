package webProject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSourceProgram {
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
	
	driver=new ChromeDriver();
	driver.get("https://www.Google.com");
    }
	
	@Test
	public void pageSource()
	{
		String source=driver.getPageSource();
		String sourceName="Gmail";
		if(source.contains(sourceName))
		{
			System.out.println("Gmail is Present");
		}
		else
		{
			System.out.println("Gmail not present");
		}
		
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	} 
}