package org.test;



import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({suiteA.class,suiteB.class,suiteC.class})

public class suiteExecute 
{
	public static void main(String[] args)
	{
		Result rs = JUnitCore.runClasses(suiteA.class,suiteB.class,suiteC.class);
		int ignoreCount = rs.getIgnoreCount();
		System.out.println("ignore count : " +ignoreCount);
		
		int runCount = rs.getRunCount();
		System.out.println("run count : " +runCount);
		
		
		long  runTime = rs.getRunTime();
		System.out.println("run time : " +runTime);
		
		int failureCount = rs.getFailureCount();
		System.out.println("run failure : " +failureCount);
		
		List<Failure> fail =rs.getFailures();
		
		for(Failure x : fail)
		{
			System.out.println(x);
		}
		
		
}
}