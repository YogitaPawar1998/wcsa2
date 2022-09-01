package testngpack;

import org.testng.Reporter;

import org.testng.annotations.Test;

public class Flag1 {  //this flag is used to provide description regarding project
	
  @Test(description= "this test is used to perform a valid login")
  public void validActitmeTest() 
  {
	  Reporter.log("valid login is perform",true);
  }
  
  
	  @Test(description= "this test is used to perform a invalid login")
	  public void InvalidActitmeTest() 
	  {
		  Reporter.log("invalid login is perform",true);
      }
}
