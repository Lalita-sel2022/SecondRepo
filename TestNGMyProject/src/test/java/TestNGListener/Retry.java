package TestNGListener;

import org.apache.log4j.Logger;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Retry implements IRetryAnalyzer
{
	public static final Logger l= Logger.getLogger(Retry.class.getName());
			
			
    private int retryCount =0;
    private int maxRetryCount =0;
	public boolean retry(ITestResult result)
	{
		if(retryCount<maxRetryCount)
		{
			log("Retry test"+ result.getName()+"with status "+ getResultStatusName(result.getStatus()));
		}
		
		return false;
	}

	public void log(String string) 
	{
		l.info(string);
		Reporter.log(string);
		
	}

	public  String getResultStatusName(int status) 
	{
		String resultName= null;
		if(status==1)
		{
			resultName="SUCCESS";
			
			if(status==2)
				resultName="FAILURE";
			
			if(status==3)
				
			resultName ="Skip";
				
		}
	
		return resultName;

	}
}


