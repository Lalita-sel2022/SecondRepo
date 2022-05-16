package SuiteA;

import org.testng.annotations.Test;

public class TestC 
{
  @Test
  public void f() throws InterruptedException 
  {
	  System.out.println("Start C");
	  Thread.sleep(2000);
	  System.out.println("End C");
  }
}
