package pagePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPage {
	
	WebDriver driver;
	                            //ObjectRepository
	//By fbEmail=By.id("email");
	//By fbPassword=By.id("pass");
	//By fbLoginButton=By.name("login");
	
								//PageFactory
	
	@FindBy(id="email")
	WebElement fbEmail;
	
	@FindBy(id="pass")
	WebElement fbPassword;
	
	@FindBy(name="login")
	WebElement fbLoginButton;
	
	public FbLoginPage(WebDriver driver)
	{
		this.driver=driver;
		
								//PageFactory
		PageFactory.initElements(driver, this);
	}
	
	public void setValues(String email,String password)
	{
								//ObjectRepository
		//driver.findElement(fbEmail).sendKeys(email);
		//driver.findElement(fbPassword).sendKeys(password);
		
								//PageFactory
		fbEmail.sendKeys(email);
		fbPassword.sendKeys(password);
	}
	
	public void login()
	{
							//ObjectRepository
		//driver.findElement(fbLoginButton).click();
		
		
						//PageFactory
		fbLoginButton.click();
	}

}
