package seleniumSelfStudy;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OmayoWindowHandle {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
	}

	@Test
	public void windowHandle()
	{
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		String parentWindow = driver.getWindowHandle();
		
		driver.findElement(By.id("selenium143")).click();
		
		
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String w:allWindows)
		{
			if(!(w.equalsIgnoreCase(parentWindow)))
			{
				driver.switchTo().window(w);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"HTML4\"]/div[1]/table/tbody/tr/td[3]/a/img"))).click();
				
				
			}
			driver.switchTo().window(parentWindow);
			
		}
		
	}
		
}
