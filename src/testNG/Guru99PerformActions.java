package testNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99PerformActions {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	
	@Test
	public void guru99()
	{
		
		Actions act=new Actions(driver);
		WebElement rightClick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span[1]"));
		act.contextClick(rightClick).perform();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
		
		Alert a=driver.switchTo().alert();
		a.accept();
		
		WebElement doubleClick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(doubleClick).perform();
		a.accept();
		
		
	}

}
