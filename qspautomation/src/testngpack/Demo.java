package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f() {
	 // System.out.println("hello");
	 // Reporter.log("hiii");
	  Reporter.log("hiiii",true);
  }
}
