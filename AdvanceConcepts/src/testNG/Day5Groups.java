package testNG;

import org.testng.annotations.Test;

public class Day5Groups {

	
	@Test(groups = {"Vivo"})
	public void Vivo() {
		
		System.out.println("Vivo is Ok");
	}
	@Test(groups = {"Oppo"})
	public void Oppo() {
		System.out.println("Oppo is Ok");
	}
	@Test(groups = {"Redmi"})
	public void Redmi() {
		System.out.println("Redmi is Ok");
	}
	@Test(groups = {"Samsung"})
	public void Samsung() {
		System.out.println("Samsung is Ok");

	}
	@Test(groups = {"Apple"})
	public void Apple() {
		System.out.println("Apple is Ok");
	}
	@Test(groups = {"Nokia"})
	public void Nokia() {
		System.out.println("Nokia is Ok");

	
	}

}
