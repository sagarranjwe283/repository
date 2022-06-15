package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
  @Test
  public void method1() 
  {
	  Reporter.log("method1 executed",true);
  }
  @Test
  public void method2() 
  {
	  Reporter.log("method2 executed",true);
  }
  @Test
  public void method3() 
  {
	  Reporter.log("method3 executed",true);
  }
  @Test
  public void method4() 
  {
	  Reporter.log("method4 executed",true);
  }
  
}

