package org.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit2 
{
	@AfterClass
	public static void AfterClass()
	{
		System.out.println("AfterClass");
	}
	
	@BeforeClass
	public static void BeforeClass()
	{
		System.out.println("BeforeClass");
	}
	
	@Before
	public void Before()
	{
		System.out.println("Before");
	}
	
	@After
	public void After()
	{
		
		System.out.println("After");
	}
	
	@Test
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("test2");
	}
	
	@Test
	public void test3()
	{
		System.out.println("test3");
	}


}
