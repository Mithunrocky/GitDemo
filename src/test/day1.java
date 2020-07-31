package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day1 {

	
	@Test
	public void demo() {
		
		System.out.println("i am waiting");
	}
		@Test 
		public void loan()
		{
		System.out.println("car loan");
		
		}
		
		
		@BeforeMethod
		public void everyloan()
		{
		System.out.println("i will excute before everymethod in day3");
		
		}
		
		@AfterMethod 
		public void freebee()
		{
		System.out.println("i will excute after everymethod in day3");
		
		}
		
		
		
		}
		

	


