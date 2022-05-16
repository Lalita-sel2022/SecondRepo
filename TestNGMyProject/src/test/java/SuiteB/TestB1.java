package SuiteB;

import org.testng.annotations.Test;

public class TestB1 
{
  @Test
  public void f() throws InterruptedException 
  {
	  System.out.println("Start B1");
	  Thread.sleep(2000);
	  System.out.println("End B1");
  }
}
