package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CopyPaste {

	EdgeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void copyPaste()
	{
		Actions a=new Actions(driver);
		WebElement name = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
	 	name.sendKeys("Gopika Rajan");
		WebElement id = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		
		a.keyDown(name, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		a.keyDown(name, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		a.keyDown(id, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		a.perform();
	}
}
