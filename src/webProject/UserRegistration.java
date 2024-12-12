package webProject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UserRegistration {
	
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://copyright.gov.in/UserRegistration/frmNewUser.aspx");
	}
	
	@Test
	public void UserReg()
	{
		WebElement title = driver.findElement(By.xpath("//select[@name='ctl00$ContentPlaceHolder1$ddlTitle']"));
		
		Select s=new Select(title);
		s.selectByValue("28");
		
		
		
	}

}


