package SuiteA;

import org.testng.annotations.Test;

public class TestB

{
  @Test
  public void f() throws InterruptedException 
  {
	  System.out.println("Start B");
	  Thread.sleep(2000);
	  System.out.println("End B");
  }
}
