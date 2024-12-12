package webProject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Santamonica {
	
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.santamonicaedu.in");
		driver.manage().window().maximize();
	}
	
	@Test
	public void searchTitle()
	{
		String exp="Santamonica Study Abroad Pvt. Ltd.";
		
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		if(exp.equalsIgnoreCase(actualTitle))
		{
			System.out.println("Title same");
		}
		else
		{
			System.out.println("Title not same");
		}       
	}
	@Test
	public void searchPageSource()
	{
		String source=driver.getPageSource();
		String sourceName="STUDY ABROAD";
		
		if(source.contains(sourceName))
		{   
			
			//driver.findElement(By.xpath("//*[@id='menu-item-567']/a")).click();
			driver.findElement(By.xpath("//*[@id=\"menu-item-567\"]/a")).click();
			
		}	
		
	}
}
