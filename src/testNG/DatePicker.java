package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePicker {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
	}
	
	@Test
	public void datePicker()
	{
		
		driver.findElement(By.id("datepicker1")).click();
		
		datePickerMethod("October 2025","25");
		
		
	}

	public void datePickerMethod(String expMonth, String expDate) {
		
		while(true) {
		
		String month = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
		if(month.equals(expMonth))
		{
			break;
		}
		else
		{
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
			break;
		}
		}
		
		List<WebElement> date = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));
	
	for(WebElement d:date)
	{
		String dateText=d.getText();
		if(dateText.equalsIgnoreCase(expDate))
		{
			d.click();
			break;
		}
		
	}
		
		
		 
		
		}
	}
	
	


