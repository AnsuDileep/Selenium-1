package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HardAssertion {
ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}

	@Test
	public void hardAssertionTitleVerify()
	{
		//hard assertion..if condition failed-remaining steps will not execute...
		//soft assertion..if condition failed also--remaining steps will execute
		//String exp="Google";  
		String exp="google";  
		String actual = driver.getTitle();
		Assert.assertEquals(exp, actual);
		System.out.println("Hello");
	}
}
