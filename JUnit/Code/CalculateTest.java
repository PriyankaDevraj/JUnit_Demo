package junitexample;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;

import org.junit.Test;
//import org.junit.runner.Runner;

public class CalculateTest {

	
	@Test
	public void testAssertArrayEquals() {
		byte[] b = "Hello World".getBytes();
		byte[] c = "Hello World".getBytes();
		assertArrayEquals(b,c);
	}
	
	@Test
	public void testAssertArrayEqualsWithMsg() {
		Integer[] intAr1 = {1,2,3,4,5,6,7,8,9};
		Integer[] intAr2 = {1,2,3,4,5,6,7,8,9};
		assertArrayEquals("Test failed 1", intAr1, intAr2);
	}
	
	@Test
	public void testAssertEquals() {
		
		assertEquals("Assert Equals Test Failed","Hello World","Hello World");
	}
	
	@Test
	public void testAssertFalse() {
		
		assertFalse("Test Failed 2","Hello World".equalsIgnoreCase("World"));
	}
	
	@Test
	public void testAssertNotNUll() {
		
		assertNotNull("Test Failed 3",5);
	}
	@Test
	public void testAssertNull() {
		
		assertNull("Test Failed 6",null);
	}
	
	@Test
	public void testassertNotSame() {
		
		assertNotSame("Test Failed 4",5,6);
	}
	
	@Test
	public void testassertSame() {
		
		assertSame("Test Failed 5",5,5);
	}
	
	@Test
	public void testassertThat() {
		
		assertThat("good", allOf(equalTo("good"), startsWith("good")));
		
	}

}
