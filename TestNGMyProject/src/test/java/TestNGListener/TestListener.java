package TestNGListener;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import project.BaseTest;

public class TestListener extends BaseTest implements ITestListener 
{
	



public void onTestStart(ITestResult result) 
{
	//Test has started give information
	Reporter.log("Test started running :" + result.getMethod().getMethodName());
	
}

public void onTestSuccess(ITestResult result) 

{
	//information for test success
	if(result.isSuccess())
	{
	
		try 
		{
			File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(scrFile,  new File(property+"//success//"+filePath +".png"));
			
			// Add screenshot into the html report
			Reporter.log("<a href=' "+property+"//success//"+filePath +".png"+"'> <img src='"+property+"//success//"+filePath +".png"+"' height ='100' width='100'/> </a>");
			Reporter.log("Test has success : "+result.getMethod().getMethodName());
			
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
	}
	
}

public void onTestFailure(ITestResult result) 
{
	if(!result.isSuccess())
	{
	
		try 
		{
			File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(scrFile,  new File(property+"//failure//"+filePath +".png"));
			
			// Add screenshot into the html report
			Reporter.log("<a href=' "+property+"//failure//"+filePath +".png"+"'> <img src='"+property+"//failure//"+filePath +".png"+"' height ='100' width='100'/> </a>");
			Reporter.log("Test has failed : "+result.getMethod().getMethodName());
			
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
	}
	
}

public void onTestSkipped(ITestResult result)
{
	Reporter.log("Test is skipped :"+ result.getMethod().getMethodName());
	
}

public void onTestFailedButWithinSuccessPercentage(ITestResult result)
{
	// TODO Auto-generated method stub
	
}

public void onStart(ITestContext context)
{
	// TODO Auto-generated method stub
	
}

public void onFinish(ITestContext context)
{
	// TODO Auto-generated method stub
	
}
}
