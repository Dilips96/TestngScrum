package project;

import org.testng.annotations.Test;

public class InvocationCountTest 
{

	@Test(invocationCount = 20)
	public void invoke()
	{
		int i = 20;
		int j= 40;
		
		int m= i+j;
		System.out.println("Sum is ===="+ m);
		
		/*if you want to run the same test case multiple time then we go for invocation count;
		 * we donot use invocationCountsome time you want to execute same test case again and again dump the data 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
