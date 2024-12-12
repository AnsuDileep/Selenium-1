package testNG;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonWindowsHandle {
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@Test
	public void titleVerification()
	{
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobile phones",Keys.ENTER);
		String expTitle="Amazon.in : Mobile Phones";
		
		String actualTitle = driver.getTitle();
		if(expTitle.equalsIgnoreCase(actualTitle))
		{
			System.out.println("actual = Expecetd");
		}
		
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String window:allWindows)
		{
			if(!(window.equalsIgnoreCase(parentWindow)))
			{
				driver.findElement(By.xpath("//*[@id=\"nav-cart-count\"]")).click();
				//driver.close();
			}
			driver.switchTo().window(parentWindow);
		}
		
		
		
	}
 
	
		
				
				 
				 
				
				

	

}
