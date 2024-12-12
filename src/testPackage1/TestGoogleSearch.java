package testPackage1;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagePackage1.GoogleSearchPage;

public class TestGoogleSearch {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@Test
	public void googleSearchTest()
	{
		GoogleSearchPage gsp=new GoogleSearchPage(driver);
		gsp.enterSearch("Selenium Tutorial");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		gsp.clickSearch();
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
