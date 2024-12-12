import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenshotPractice {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
	}
	
	
	@Test
	public void takeScreenshot() throws IOException
	{
		File imageFile = driver.findElement(By.xpath("//div[@id='HTML29']/div/img")).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(imageFile, new File("./Screenshot/screenshot2.png"));
		
	File pageFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(pageFile, new File("./Screenshot/screenshot3.png"));
		
	}

}
