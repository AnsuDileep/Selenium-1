package webProject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertHandling {
	
	EdgeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.get("file:///C:/Users/atuls/Desktop/Selenium/HtML/alert_example.html");
	}
	
	@Test
	public void alertMessage()
	{
		driver.findElement(By.xpath("/html/body/input")).click();
		Alert a = driver.switchTo().alert();  //switching from driver to alert Interface
		String alertText=a.getText();   //to get text of the alert 
		System.out.println(alertText);
		a.accept();   //to accept alert
		//a.dismiss();   -to cancel alert
		driver.findElement(By.name("firstname")).sendKeys("Athulya");
		driver.findElement(By.name("lastname")).sendKeys("Mohan");
		
		
	}

}
