package testNG;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonScrollDown {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@Test
	public void addToCart() throws InterruptedException
	{
		//String parentWindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobile phones",Keys.ENTER);
		Thread.sleep(4000);
		WebElement iPhone = driver.findElement(By.linkText("Apple iPhone 13 (128GB) - Pink"));
		
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,1000)");
			
			js.executeScript("arguments[0].scrollIntoView", iPhone);
			iPhone.click();
			
			
		
	
	
	
	
	
	}
	
	
	
	
	
	

}
