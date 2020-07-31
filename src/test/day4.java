package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day4 {

	@Test 
	public void bankhomeloan() {
		
		
		System.out.println("sbi");
	}	
		@Test(groups= {"smoke"})
		public void bankhomeloan2 ()
		
		{
			System.out.println("axis");
		}
		
		@Test
		public void bankhomeloan3 ()
		
		{
			System.out.println("iob");
		}
		@BeforeSuite
		public void goatrip ()
		
		{
			System.out.println("freetrip");
		}
		@AfterSuite
		public void mysoretrip ()
		
		{
			System.out.println("paidtrip");
		}
	
}
