package testNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TrivagoDatePicker {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.trivago.in/en-IN?themeId=280&sem_keyword=trivago&sem_creativeid=598703244705&sem_matchtype=e&sem_network=g&sem_device=m&sem_placement=&sem_target=&sem_adposition=&sem_param1=&sem_param2=&sem_campaignid=12420248128&sem_adgroupid=118398954396&sem_targetid=kwd-5593367084&sem_location=9040212&cipc=br&cip=9119000005&gad_source=1&gclid=CjwKCAiA3Na5BhAZEiwAzrfagDIOlprYWcL3gHJD-kU3uMJBQqHHHrmlBU99nn5dB-R1Qj-DjxPyhxoCcrYQAvD_BwE#overlay-calendar");
	}
	
	@Test
	public void dateLocate()
	{
		 WebElement trivago = driver.findElement(By.xpath("//*[@id=\"overlay-root\"]/div/section/main/div/div/div/div[1]/div[1]/div[1]/button[1]/div/span"));
		 trivago.click();
		
		datePicker("January 2025","1");
	}

	private void datePicker(String expMonth, String expDate) {
		
		
		while(true)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a"))).click();
			WebElement acceptButton = driver.findElement(By.cssSelector(".accept-cookies-btn"));
			acceptButton.click();
			
			String trivagoPageSource = driver.getPageSource();
		   if(trivagoPageSource.contains(expMonth))
		   {
			 break;
		   }
		   
		   List<WebElement> allDates = driver.findElements(By.xpath("//*[@id=\"overlay-root\"]/div/section/main/div/div/div/div[2]/div[3]/div"));
		   
		   for( WebElement date:allDates)
		   {
			   String dateText = date.getText();
			  if( dateText.equals(expDate))
			   {
				   driver.findElement(By.xpath("//*[@id=\"overlay-root\"]/div/section/main/div/div/div/div[2]/div[3]/div/button[3]")).click();
				   break;
			   }
		   }
		 
			
			
			
			
			
			//*[@id="overlay-root"]/div/section/main/div/div/div/div[2]/div[3]/div
		}
		
	}
	
	
	

}
