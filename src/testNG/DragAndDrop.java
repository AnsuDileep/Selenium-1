package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDrop {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
	}
	
	@Test
	public void dragAndDrop()
	{
		Actions act=new Actions(driver);
		WebElement buttonDrag = driver.findElement(By.xpath("//li[@id='fourth'][1]/a"));
		WebElement amountDrop = driver.findElement(By.xpath("//ol[@id='amt7']/li"));
		WebElement bankDrag = driver.findElement(By.xpath("//li[@id='credit2']/a"));
		WebElement accountDrop = driver.findElement(By.xpath("//ol[@id='bank']/li"));
		
		
		act.dragAndDrop(buttonDrag, amountDrop).perform();
		act.dragAndDrop(bankDrag, accountDrop).perform();
		
		
	}

}
