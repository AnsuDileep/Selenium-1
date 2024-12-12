package testNG;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleWindowsHandling {
	
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/popup.php");
	}
	
	@Test
	public void multipleWindows()
	{
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		
		Set<String> windowsSet = driver.getWindowHandles();
		for(String window:windowsSet)
		{
			if(!(window.equalsIgnoreCase(parentWindow)))
					{
				driver.switchTo().window(window);
				//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("\"/html/body/form/table/tbody/tr[5]/td[2]/input\""))).sendKeys("abc123");
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abc123");
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
				driver.close();
				
				
					}
			driver.switchTo().window(parentWindow);
		}
	}
				
				
	

}
