package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleSearchCrossBrowser {
	
	WebDriver driver;
	
	@Parameters ("browser")
	@BeforeTest
	public void setUp(String browser) throws InterruptedException
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(5000);
			
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			Thread.sleep(5000);
			
		}
		else
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
	}
	
	@Test
	public void googleSearch()
	{
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("w3schools Java",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
		
	}
	
	

}
