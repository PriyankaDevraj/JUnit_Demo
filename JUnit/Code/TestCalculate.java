package priyanka.javaupgradesexamples.junit;

import org.junit.Test;

import priyanka.javaupgradesexamples.Calculate;

import static org.junit.Assert.assertEquals;

public class TestCalculate {

	@Test
	public void testAdd() {
		Calculate cal = new Calculate();
		int expected = 9+10;
		int actual = cal.add(9, 10);
		
		assertEquals(expected,actual);
	}
	
	@Test
	public void testMul() {
		Calculate cal = new Calculate();
		int expected = 9*10;
		int actual = cal.mul(9, 10);
		
		assertEquals(expected,actual);
	}
	
}
