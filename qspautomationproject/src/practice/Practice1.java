package practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice1 {
  @Test
  public void setUp() 
  {
	// code that will be invoked when this test is instantiated
  }
  @Test(groups ="Fast" )
  public void aFastTest()
  {
	  Reporter.log("FastTest",true);
  }
  @Test(groups = "Slow")
  public void aSlowTest()
  {
	  Reporter.log("SlowTest",true);
  }
  
  
}
