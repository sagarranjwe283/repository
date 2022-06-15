package testngflag;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
  @Test
  public void b() {
  
	  Assert.fail();
	  Reporter.log("b",true);
  }
  @Test(dependsOnGroups = "b",alwaysRun = true)
  public void a() {
  
	  Assert.fail();
	  Reporter.log("a",true);
  }
}
