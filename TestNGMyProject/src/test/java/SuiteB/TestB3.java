package SuiteB;

import org.testng.annotations.Test;

public class TestB3
{
  @Test
  public void f() throws InterruptedException 
  {
	  System.out.println("Start B3");
	  Thread.sleep(2000);
	  System.out.println("End B3");
  }
}
