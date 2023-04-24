package project;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class ExceptionTimeout 
{

	@Test(timeOut = 2000)
	public void exceptiontout() 
	{
		int i=1;
		while(i==1)
		{
			System.out.println(i);
		}
		
		System.out.println("Here we are not increasing the value of i it will generate a infinite loop");
		/* Here we are not doing any increment opereation it will execute infinite times we are not terminating the loop      */
		
	}
	
	
	
	
	
	
}
