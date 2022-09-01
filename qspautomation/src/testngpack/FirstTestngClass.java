package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestngClass {
  @Test
  public void method1() {
	  Reporter.log("method1",true);
  }
	  public void method2() {
		  Reporter.log("method2",true);
	  
	  }
	  
	  @Test
	  public void method3() {
		  Reporter.log("method3",true);
	  }
	  
	  @Test
	  public void method4() {
		  int i=9;
		  int j=0;
		  int res=i/j;
		  System.out.println(res);
		  Reporter.log("method4",true);
		  
		  
  }
}
