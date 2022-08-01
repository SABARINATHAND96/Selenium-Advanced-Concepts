package testNG;

import org.testng.annotations.Test;

public class Day1sample {

	@Test(priority = 0)
	
	public void FirstTestCase(){
		
		System.out.println("Hi buddy 1");
		
	}
	@Test(priority = 1)
	public void SecondTestCase(){
		
		System.out.println("Hi buddy 2");
		
	}
	@Test(priority = 2)
	public void ThirdTestCase(){
	
	System.out.println("Hi buddy 3");
	
	}
	@Test(priority = 3)
	public void FourthTestCase(){
	
	System.out.println("Hi buddy 4");
	
	}
	@Test(priority = 4)
public void FivthTestCase(){
	
	System.out.println("Hi buddy 5");
	
	}
	
	
	
	
	
	
}
