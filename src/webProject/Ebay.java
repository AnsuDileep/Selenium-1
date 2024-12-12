package webProject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class Ebay {
	
	EdgeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.get("https://www.ebay.com");
	}
	
	@Test
	public void ebaySearch()
	{
		String exp="Ebay.com";
		
		String actual=driver.getTitle();
		if(exp.equalsIgnoreCase(actual))
		{
			System.out.println("Title same");
		}
		else
		{
			System.out.println("Title Not same");
		}
		
		String source=driver.getPageSource();
		String sourceName="Shop by category";
		
		if(source.contains(sourceName))
		{
			driver.findElement(By.id("gh-shop-a")).click();
			
		}
		
		driver.findElement(By.xpath("//table[@id='gh-sbc']/tbody/tr/td[1]/ul[1]/li[4]/a")).click(); 
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/section[3]/section[1]/div[2]/ul/li[2]/div/a/div[2]/span")).click();
		//driver.findElement(By.xpath("//div[@id='leftnav']/div/div/div/section/ul/li[2]/a")).click();
		//driver.findElement(By.xpath("//*[contains(text(),\"Art NFT\")]")).click();
		driver.findElement(By.xpath("//li[@id='gh-minicart-hover']/div/a[1]")).click();
		driver.findElement(By.id("gh-ac")).sendKeys("Books",Keys.ENTER);		
	}	
}
