package webProject;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	EdgeDriver driver;
	@Before
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.get("file:///C:/Users/atuls/Desktop/Selenium/HtML/alert_example.html");
	}
	
	@Test
	public void screenShot() throws IOException
	{
		
		
		//Page Screenshot -  cast to TakesScreenshot Interface  -  getScreenshotAs()
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//FileHandler.copy(f, new File("C:\\Users\\atuls\\Desktop\\Selenium\\Screenshot\\pagescreenshot.png"));
		FileHandler.copy(f, new File("./Screenshot/pageScreenShot.png"));
		
		
		//WebEelement screenshot
		WebElement button = driver.findElement(By.xpath("/html/body/input[1]"));
		File buttonScreenshot = button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(buttonScreenshot,new File("C:\\\\Users\\\\atuls\\\\Desktop\\\\Selenium\\\\Screenshot\\\\buttonscreenshot.png"));
	}
	
	
	
}
