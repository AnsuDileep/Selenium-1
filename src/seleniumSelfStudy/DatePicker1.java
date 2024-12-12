package seleniumSelfStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePicker1 {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
	}
	
	@Test
	public void datePick()
	{
		String month="May";
		String year="2025";
		String date="8";
		
		driver.findElement(By.id("datepicker1")).click();
		
		while(true)
		{
			String currentMonth = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
			String currentYear = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
			if((month.equalsIgnoreCase(currentMonth)) && (year.equalsIgnoreCase(currentYear)))
			{
				break;
			}
			
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
		}
		
		
		
	}

}
