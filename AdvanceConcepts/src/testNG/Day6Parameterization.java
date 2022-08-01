package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day6Parameterization {

	@Test
	@Parameters("GiveName")
	public void Parameter(String name) {
		
		System.out.println("hi Hi hI"+name);
		
	}
	
	
	
	
	
	
}
