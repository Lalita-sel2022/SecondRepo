package SuiteA;

import org.testng.annotations.Test;

public class TestA 
{
  @Test
  public void f() throws InterruptedException 
  {
	  System.out.println("Start A");
	  Thread.sleep(2000);
	  System.out.println("End A");
  }
}
