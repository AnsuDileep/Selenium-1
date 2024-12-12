package testNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDrivenTest {
	
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void dataDriventest() throws IOException
	{
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		FileInputStream fis=new FileInputStream("C:\\Users\\atuls\\Downloads\\Untitled spreadsheet.xlsx");
		//@SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		int rowCount = sh.getLastRowNum();
		
		for(int i=1;i<=rowCount;i++)
		{
			String userName = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Username : "+userName);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			String passWord = sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Password : "+passWord);
			
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(userName);
			driver.findElement(By.id("pass")).sendKeys(passWord);
			driver.findElement(By.name("login")).click();	
		}
		
	}

}
