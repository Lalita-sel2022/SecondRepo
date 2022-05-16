package project;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestDependency 
{
  @Test(priority=1)
  public void orange() 
  {
	  System.out.println("Orange");
  }
  @Test(priority=2,dependsOnMethods = {"orange"})
  public void blue() 
  {
	  System.out.println("Blue");
  }
  
  @Test(priority=3, dependsOnMethods = {"blue"})
  
  public void white() 
  {
	  
	  System.out.println("White");
	 // Assert.fail("white test is fail");
	  throw new SkipException("White test is skipped");
	 
  }
  @Test(priority=4, dependsOnMethods = {"white"})
  public void green() 
  {
	  System.out.println("Green");
  }
}
