package webProject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListRediffMail {
	
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void dropDown()
	{
		
		WebElement w=driver.findElement(By.xpath("//*[contains(@name,'DOB')]"));
		Select day=new Select(w);
		day.selectByValue("06");
	
		
		
		WebElement w2=driver.findElement(By.xpath("//select[contains(@name,'DOB')][2]"));
		Select month=new Select(w2);
		month.selectByValue("08");
		
		WebElement w3=driver.findElement(By.xpath("//select[contains(@name,'DOB')][3]"));
		Select year=new Select(w3);
		year.selectByValue("1999");
		
		WebElement w4=driver.findElement(By.xpath("//select[@id='country']"));
		Select country=new Select(w4);
		country.selectByValue("99");
		
		
	}
	

}
