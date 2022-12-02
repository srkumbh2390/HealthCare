package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	public  WebDriver driver;
	
	public void launchBrowser()
	{
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void tear()
	{
		driver.quit();
	}
}
