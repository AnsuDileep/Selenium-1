package seleniumSelfStudy;

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

public class ScreenshotFacebook {
	EdgeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.facebook.com");
	}
	
	@Test
	public void screenShot() throws IOException
	{
	 File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileHandler.copy(f, new File("./Screenshot/fbscreenshot.png"));
	 
	 WebElement createNewAccountButton = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div[5]/a"));
	 File buttonShot = createNewAccountButton.getScreenshotAs(OutputType.FILE);
	 FileHandler.copy(buttonShot, new File("./Screenshot/fbbuttonshot.png"));
	 
	}
	
	
	

}
