package seleniumSelfStudy;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {

	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void dropDown()
	{
		WebElement day=driver.findElement(By.xpath("//*[contains(@name,'DOB')]"));		
		Select dayDetails=new Select(day);
		dayDetails.selectByValue("06");
		
		WebElement month=driver.findElement(By.xpath("//*[contains(@name,'DOB')][2]"));
		Select monthDetails=new Select(month);
		monthDetails.selectByValue("06");
		
		WebElement year=driver.findElement(By.xpath("//*[contains(@name,'DOB')][3]"));
		Select yearDetails=new Select(year);
		yearDetails.selectByValue("1986");
		
	}
}
