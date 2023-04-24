package project;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

  
public class GoogleTest 
{
	
	WebDriver driver;

	
	@BeforeMethod
	public void Setup()
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(option);
		
		driver.get("https://v2trade.ekbazaar.com/");
	
		
		driver.manage().window().maximize();  // to maximise the Browser
		
		driver.manage().deleteAllCookies();  // it will delete all the cookies
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test(priority = 0)
	public void launchbrowser()
	{
		
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		
	}
	
	
	@Test(priority =2)
	public void logodisplay()
	{
		 boolean s = driver.findElement(By.xpath("//*[@id=\"not-active-head\"]/div[2]/div/div[1]/div[2]/img")).isDisplayed();
	}
	
	@Test(priority=1)
	public void pricingclick() throws InterruptedException
	{
		// boolean d = driver.findElement(By.xpath("//a[text()=\"Pricing\"]")).isDisplayed();
		driver.findElement(By.xpath("//a[text()=\"Pricing\"]")).click();
		Thread.sleep(3000);
		
	}
	
	
	
	
	
	@AfterMethod
	public void closebrowser()
	{
		
		driver.close();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
