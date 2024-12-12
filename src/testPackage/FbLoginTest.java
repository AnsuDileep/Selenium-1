package testPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagePackage.FbLoginPage;

public class FbLoginTest {
	
public static WebDriver driver;

@BeforeTest
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
}

@Test
public void loginTest()
{
	FbLoginPage ob=new FbLoginPage(driver);
	ob.setValues("abc123@gmail.com", "abc12345");
	ob.login();
}



}
