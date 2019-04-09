package priyanka.javaupgradesexamples.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import priyanka.javaupgradesexamples.PrivateInterfaceExample;

public class TestPrivateInterfaceExample {
	
	@Test
	public void testPrivateInterface() {
		PrivateInterfaceExample pie = new PrivateInterfaceExample();
		String actual = pie.sayImpl();
		String expected = "called private methods using default method";
		
		assertEquals(expected,actual);
	}

}
