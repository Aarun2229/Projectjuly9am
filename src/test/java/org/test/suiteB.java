package org.test;

import org.junit.Assert;
import org.junit.Test;

public class suiteB 
{
	@Test
	public void tc4()
	{
	Assert.assertTrue(true);
	System.out.println("test4");
	}
	
	@Test
	public void tc5()
	{
	Assert.assertTrue(true);
	System.out.println("test5");
		
	}
	
	@Test
	public void tc6()
	{
		Assert.assertTrue(false);
		System.out.println("test6");
		
		
	}

}
