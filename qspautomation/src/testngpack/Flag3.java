package testngpack;

import org.testng.Reporter;

import org.testng.annotations.Test;

public class Flag3 {             // if method does not have any priority it is consider as 0
	@Test(priority = -1)          //method which has 1 priority executes after the method which has 1 priority
	public void validLogin()        // method with -ve priotites always executes first
	{                                 // if methods has same priority then executes alphabetically
		Reporter.log("valid Login",true);
	}
	
	
  @Test(priority = 1)
  public void e() 
  {
	  Reporter.log("e method",true);
  } 
  
  @Test(priority = 3)
  public void g() 
  {
	  Reporter.log("g method",true);
  }
  
  @Test(priority = 6)
  public void a() 
  {
	  Reporter.log("a method",true);
  }
  
  @Test
  public void f() 
  {
	  Reporter.log("f method",true);
  }
  
  @Test
  public void k() 
  {
	  Reporter.log("k method",true);
  }
  @Test
  public void s() 
  {
	  Reporter.log("s method",true);
  }
  
  @Test(priority = 6)
  public void v() 
  {
	  Reporter.log("v method",true);
  }
  
  @Test(priority = 2)
  public void z() 
  {
	  Reporter.log("z method",true);
  }
  
  @Test
  public void x() 
  {
	  Reporter.log("x method",true);
  }
}
