package testNG;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class Day2SkipTestCase {
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
	@Test(priority = 5,enabled = true)
	
	public void TurnOnMusic(){
		
		System.out.println("Music Turned ON");
		
		}

	
	
}
