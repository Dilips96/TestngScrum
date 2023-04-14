package project;

import org.testng.annotations.Test;

public class Depends 
{

	@Test()
	public void login()
	{
		System.out.println("Login");
		//int i = 9/0;
	}
	
	

	@Test(dependsOnMethods = {"login"})
	public void homepage() 
	{
		System.out.println("Home page is Dependent on Login Module");
			
	}
		
	
	@Test(dependsOnMethods = {"login"})
	public void searchpage() 
	{
		System.out.println("searchpage is Dependent on Login Module");
			
	}
	
	
	@Test(dependsOnMethods = {"login"})
	public void regpage() 
	{
		System.out.println("regpage is Dependent on Login Module");
			
	}
	
			
	
	
//	System.out.println("If there are 100 test cases in a class and if it is dependent on other methods we go dependsOnMethod ");
	
	
	
	
	
	
	
	
	
	
	
}
