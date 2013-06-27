package cn.bc.study;

import junit.framework.Assert;

import org.junit.Test;

public class MainTest {
	private Main main = new Main();
	
	@Test
	public void testDoDouble() {
		Assert.assertEquals(4, main.doDouble(2));
		Assert.assertEquals(10, main.doDouble(5));
		Assert.assertEquals(16, main.doDouble(8));
	}

}
