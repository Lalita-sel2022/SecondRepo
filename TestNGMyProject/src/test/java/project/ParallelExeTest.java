package project;

import java.util.Arrays;

import org.testng.annotations.Test;

import com.beust.testng.TestNG;

public class ParallelExeTest
{
  @Test
  public void f() 
  {
	  TestNG obj = new TestNG();
	  obj.setTestSuites(Arrays.asList(new String[] {System.getProperty("user.dir")+"//megasuite.xml"}));
	  obj.setSuiteThreadPoolSize(2);
	  obj.run();
  }
}
