import java.time.Duration;

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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/datepicker/");
	}
	
	@Test
	public void jqueryDatePicking()
	{
		driver.switchTo().frame(0);
		try {
			
			driver.switchTo().frame(0);
		String expMonth="November";
		String expYear="1993";
		String expDate="17";
		
		
		driver.findElement(By.id("datepicker")).click();
		
		while(true)
		{
			String actualMonth = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/div/span")).getText();
			String actualYear = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/div/span[2]")).getText();
			
			if(actualMonth.equalsIgnoreCase(expMonth)&&(actualYear.equalsIgnoreCase(expYear)))
			{
				break;
			}
			
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]")).click();
		}
		}
		catch(Exception e)
		{
			
		}
		
		
	}

}
