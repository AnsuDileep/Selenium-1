package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SoftAssertion {
ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}

	@Test
	public void softAssertionTitleVerify()
	{
		//soft assertion..if condition failed also--remaining steps will execute
		String exp="google";
		String actual = driver.getTitle();
		if(exp.equals(actual))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
		System.out.println("Hello");
	}
}
