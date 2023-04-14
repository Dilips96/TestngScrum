package com.params;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameters 
{

	WebDriver  driver;
	
	@Test
	public void yahoologin() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(option);
		
		driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-IN&.intl=in&.done=https%3A%2F%2Fin.mail.yahoo.com%2Fd");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@autocomplete=\"username\"]")).sendKeys("dilipsahukar4@yahoo.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class=\"pure-button puree-button-primary challenge-button\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"login-passwd\"]")).sendKeys("7978006295");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//button[@value=\"Next\"]")).click();
		Thread.sleep(2000);
		
		System.out.println("Test");
		
		
		
	}
	
	
	
}
