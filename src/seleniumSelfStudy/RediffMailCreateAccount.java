package seleniumSelfStudy;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffMailCreateAccount {
	
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void createAccount()
	{
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("Arundati Roy");
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input")).sendKeys("ansu.s100");
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).click();
		driver.findElement(By.xpath("//input[@id='newpasswd']")).sendKeys("Arundati@123");
		driver.findElement(By.xpath("//input[@id='newpasswd1']")).sendKeys("Arundati@123");
		
		//Dropdown List
		WebElement day=driver.findElement(By.xpath("//*[contains(@name,'DOB')][1]"));
		Select dayDetails=new Select(day);
		dayDetails.selectByValue("17");
		
		WebElement month = driver.findElement(By.xpath("//*[contains(@name,'DOB')][2]"));
		Select monthDetails=new Select(month);
		monthDetails.selectByValue("11");
		
		WebElement year = driver.findElement(By.xpath("//*[contains(@name,'DOB')][3]"));
		Select yearDetails=new Select(year);
		yearDetails.selectByValue("1993");
		
		//Radiobutton
		driver.findElement(By.xpath("//*[contains(@name,'gender')][2]")).click();
		
		
		
	}
	

}
