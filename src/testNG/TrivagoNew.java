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

public class TrivagoNew {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.trivago.in/en-IN?themeId=280&sem_keyword=trivago&sem_creativeid=598703244705&sem_matchtype=e&sem_network=g&sem_device=m&sem_placement=&sem_target=&sem_adposition=&sem_param1=&sem_param2=&sem_campaignid=12420248128&sem_adgroupid=118398954396&sem_targetid=kwd-5593367084&sem_location=9040212&cipc=br&cip=9119000005&gad_source=1&gclid=CjwKCAiA3Na5BhAZEiwAzrfagDIOlprYWcL3gHJD-kU3uMJBQqHHHrmlBU99nn5dB-R1Qj-DjxPyhxoCcrYQAvD_BwE#");  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	
	}
	
	
	@Test
	public void datePick()
	{
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='__next']/div/div[2]/section/div[2]/div/div/div/button[2]/span/span[2]/span[2]"))).click();
		datePicker("December 2024","31");
	}

	private void datePicker(String expMonth, String expDate) {
		while(true)
		{
			String actualMonth = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[1]/div/div/button[2]/span/span[2]/span[2]")).getText();
			
			if(expMonth.equalsIgnoreCase(actualMonth))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]/span")).click();
			}
		}
		List<WebElement> allDates = driver.findElements(By.xpath("//*[@id='\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
		for(WebElement date:allDates)
		{
			String dateText = date.getText();
			if(dateText.equalsIgnoreCase(expDate))
			{
				date.click();
				break;
			}
		}
	}
}
