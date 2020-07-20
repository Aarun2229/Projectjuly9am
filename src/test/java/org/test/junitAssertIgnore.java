package org.test;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class junitAssertIgnore 
{
	
	@Test
	public void tc1()
	{   Assert.assertTrue(true);
		System.out.println("test1");	
	}
	
	@Test
	public void tc2()
	{
		Assert.assertTrue(false);
		System.out.println("test2");	
	}
	
	@Test
	public void tc3()
	{
		System.out.println("test3");	
	}
	
	@Test
	public void tc4()
	{
		Assert.assertEquals(false,true);
		System.out.println("test4");	
	}
	
	//@Ignore
	
	@Ignore
	@Test
	public void tc5()
	{
		System.out.println("test5");	
	}
	
	


}
