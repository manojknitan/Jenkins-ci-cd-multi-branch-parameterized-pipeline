/**
 * @author: Manoj Kumar
 * @created date: 18-04-2026
 * @description: TODO
 */

package com.learning.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo {

    @Test
    public void testPass()
    {
        System.out.println("Test Passed");
        Assert.assertTrue(true);
    }

    @Test
    public void testFail()
    {
        System.out.println("Test Failed");
        Assert.assertTrue(true);
    }
	
	@Test
	public void testOne()
	{
		System.out.println("Test One Passed");
		Assert.assertTrue(true);
	}
	
	@Test
	public void testTwo()
	{
		System.out.println("Test Two Passed");
		Assert.assertTrue(true);
	}
}
