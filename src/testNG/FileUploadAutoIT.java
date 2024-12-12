package testNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUploadAutoIT {
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/word_to_pdf");
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void fileUpload() throws InterruptedException, IOException
	{
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("\"C:\\Users\\atuls\\Desktop\\Selenium\\File Upload\\AutoIT\\t4.exe\"");
		Thread.sleep(3000);
	}
	

}
