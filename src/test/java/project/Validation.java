package project;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation 
{

	WebDriver driver;

	@BeforeMethod
	public void Setup()
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(option);
		
		driver.get("https://www.google.com/");
	
		
		driver.manage().window().maximize();  // to maximise the Browser
		
		driver.manage().deleteAllCookies();  // it will delete all the cookies
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test
	public void googletest()
	{
		 String title=driver.getTitle();
		 System.out.println(title);
		 AssertJUnit.assertEquals(title, "Google");
	}
	
	/* for validation purpose we are using Assertion
	 * Assert.assertEquals(actual, expected);
	 *  */
	
	
	
	
	@AfterMethod()
	public void close()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
