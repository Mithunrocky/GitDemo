package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day2 {

	

	@Test 
	public void carloan() {
		
		
		System.out.println("maruthi");
	}	
		@Test(enabled=true)
		public void carloan2 ()
		
		{
			System.out.println("honda");
		}
		
		@Test(groups= {"smoke"})
		public void carloan3 ()
		
		{
			System.out.println("ferrari");
		}
		
@Test
		public void zdance ()
		
		{
			System.out.println("hiphop");
		}
		
		@AfterClass
		public void westerdance ()
		
		{
			System.out.println("freestyle");
		}
		
		
	}
	
	
	
	
	
	
	

