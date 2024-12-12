import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUploadPractice {

	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/word_to_pdf");
	}
	
	@Test
	public void setfile() throws AWTException
	{
		driver.findElement(By.id("pickfiles")).click();
		
		fileUpload("\"C:\\Users\\atuls\\Desktop\\Java\\Trivago Date Picker.docx\"");
	}

	private void fileUpload(String file) throws AWTException {
		
		StringSelection fileCopy=new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileCopy, null);
		
		Robot filePaste=new Robot();
		filePaste.delay(2000);
		
		filePaste.keyPress(KeyEvent.VK_CONTROL);
		filePaste.keyPress(KeyEvent.VK_V);
		filePaste.keyRelease(KeyEvent.VK_V);
		filePaste.keyRelease(KeyEvent.VK_CONTROL);
		filePaste.delay(3000);
		
		filePaste.keyPress(KeyEvent.VK_ENTER);
		filePaste.keyRelease(KeyEvent.VK_ENTER);
		filePaste.delay(3000);
		
		
	}
	
	
}


