package testNG;

import org.testng.annotations.Test;

public class Day3DependsOn {

	
	
	@Test
	public void HighSchool(){
		
		System.out.println("High School Passed");
		
	}
	@Test(dependsOnMethods = "HighSchool")
	public void HigherSchool(){
		
		System.out.println("Higher School Passed");
		
	}
	@Test(dependsOnMethods = "HigherSchool")
	public void College(){
		
		System.out.println("You Will Join College");
		
	}
	
	
	
	
}
