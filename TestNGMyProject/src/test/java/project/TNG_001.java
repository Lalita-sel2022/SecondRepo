package project;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;

public class TNG_001 extends BaseTest

{

  @BeforeMethod(groups = {"regression","Sanity"})
  @Parameters("browser")
  public void beforeMethod(String bType) throws IOException, InterruptedException 
  {
		init();
		Thread.sleep(3000);
		launcher(bType);
		navigateUrl("amazonurl");
	  
  }
  
  @Test(groups = {"regression","Sanity"})
  public void f() 
  {

		driver.findElement(By.id("searchDropdownBo")).sendKeys("Books");
		
		driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
  }

  @AfterMethod
  public void afterMethod()
  {
	
	  driver.quit();
	  
  }

}
