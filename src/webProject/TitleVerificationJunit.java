package webProject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerificationJunit {
	
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

	@Test
	public void titleVerification()
	{
		String actualTitle=driver.getTitle();
		System.out.println("Actual Title: "+actualTitle);
		
		String exp="Facebook";
		System.out.println("Expected Title: "+exp);
		
		if(exp==actualTitle)
		{
			System.out.println("Title is same");
		}
		else
		{
			System.out.println("Title not same");
		}
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
}
