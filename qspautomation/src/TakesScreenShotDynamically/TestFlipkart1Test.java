package TakesScreenShotDynamically;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFlipkart1Test extends BaseTest {
	
	@BeforeMethod
	  public void setUp()
	  {
		  initialization();
		  
	  }
	  
	  
	  
	  @Test
	  public void TestFlipkart1() 
	  {
		 Assert.fail(); 
	  }
	  
	  @Test
	  public void TestFlipkart2() 
	  {
		 Assert.fail(); 
	  }
	  
	  @Test
	  public void TestFlipkart3() 
	  {
		 Assert.fail(); 
	  }
	  
	  @Test
	  public void TestFlipkart4() 
	  {
		 Assert.fail(); 
	  }
	  
	  @Test
	  public void TestFlipkart5() 
	  {
		 Assert.fail(); 
	  }

	  @AfterMethod
	  public void tearDown() 
	  {
		  driver.close();
	  }


}
