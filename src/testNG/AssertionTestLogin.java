package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class AssertionTestLogin {
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	
	@Test
	public void logIn()
	{
		//Hard Assertion- login 
		String expURL = "https://practicetestautomation.com/logged-in-successfully/";
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		
		String actual = driver.getCurrentUrl();
		
		Assert.assertEquals(expURL, actual);
		
		System.out.println("Login Success");
		
		
		
		
		
		
		
	}

}
