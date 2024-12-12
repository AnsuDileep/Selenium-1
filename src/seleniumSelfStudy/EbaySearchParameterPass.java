package seleniumSelfStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EbaySearchParameterPass {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	}
	
	@Parameters("s")
	@Test
	public void search(String s)
	{
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys(s,Keys.ENTER);
	}

}
