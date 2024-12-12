package seleniumSelfStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RadioButton {

	WebDriver driver;
	
	
	@Parameters ("browser")
	@BeforeTest
	public void setUp(String browser) throws InterruptedException
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(4000);
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			Thread.sleep(4000);
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			Thread.sleep(4000);
		}
		else
		{
			driver=new SafariDriver();
			driver.manage().window().maximize();
			Thread.sleep(4000);
		}
		
	}
	
	@BeforeMethod
	public void siteLoad()
	
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void maleRBClick()
	{
		//locate radiobutton
		WebElement maleRB = driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[24]/td[3]/input"));
		if(!maleRB.isSelected())
		{
			maleRB.click();
		}
		
		Assert.assertTrue(maleRB.isSelected(), "Male Radio button should be selected");
	}
	
	

	@Test
	public void femaleRBClick()
	{
		WebElement femaleRB = driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[24]/td[3]/input[2]"));
		
		if(!femaleRB.isSelected())
		{
			femaleRB.click();
		}
		
		Assert.assertTrue(femaleRB.isSelected(), "Female Radio button should be selected");
	}
	
	
}
