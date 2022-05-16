package SuiteB;

import org.testng.annotations.Test;

public class TestB2 
{
  @Test
  public void f() throws InterruptedException 
  {
	  System.out.println("Start B2");
	  Thread.sleep(2000);
	  System.out.println("End B2");
  }
}
