package com.dsce;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
	@Test
	public void testlogin1()
	{
		App myapp=new App();
		
		Assert.assertEquals(0,myapp.userlogin("abc","abc1234"));
	}
	@Test
	public void testlogin2()
	{
		App myapp=new App();
		Assert.assertEquals(1,myapp.userlogin("abc","abc@1234"));
	}
}