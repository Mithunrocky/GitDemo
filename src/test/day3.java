package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day3 {

	@Test 
	public void bikeloan() {
		
		
		System.out.println("tvs");
	}	
		@Test
		public void bikeloan2 ()
		
		{
			System.out.println("hero");
		}
		
		@Test(groups={"smoke"})
		public void bikeloan3 ()
		
		{
			System.out.println("ducati");
		}
		
		@AfterTest
		public void bikezone ()
		
		{
			System.out.println("duke");
		}
	
		@BeforeTest
		public void bikezone2 ()
		
		{
			System.out.println("apache");
		}
	
	
	
	
}
