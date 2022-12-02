package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
   @FindBy(xpath="//input[@placeholder='Username']")
   public WebElement username;
   
   @FindBy(xpath="//input[@placeholder='Password']")
   public WebElement password;
   
   @FindBy(xpath="//input[@name='login-button']")
   public WebElement loginButton;
   
   public LoginPage(WebDriver driver)
   {
	   PageFactory.initElements( driver,this);
   }
   
   public void LoginApplication()
   {
	   username.sendKeys("standard_user");
	   password.sendKeys("secret_sauce");
   }
   
   public void clickOnLoginbutton()
   {
	   loginButton.click();
   }
   
   
   
   
}