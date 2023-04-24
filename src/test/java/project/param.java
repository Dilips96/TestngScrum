package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class param 
{

	WebDriver driver;
	
	
	
	@Test
	public void yahoo()
	{
        WebDriverManager.chromedriver().setup();
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");  
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.yahoo.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//a[text() =\"Sign in\"])[1]")).click();
		
		driver.findElement(By.xpath("//input[@autocomplete=\"username\"]")).clear();
		
		driver.findElement(By.xpath("//input[@autocomplete=\"username\"]")).sendKeys("dilipsahukar4@yahoo.com");
		
		driver.findElement(By.xpath("//input[@value=\"Next\"]")).click();
		
		driver.findElement(By.xpath("//label[@for=\"persistent\"]")).click(); // for checkbox
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("windows.scrollBy(0,350)", "");
		
		
		
		
	}
	
	
	
	
	
	
	
}
