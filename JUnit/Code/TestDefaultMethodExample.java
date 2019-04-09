package priyanka.javaupgradesexamples.junit;

import org.junit.Test;

import priyanka.javaupgradesexamples.DefaultMethodExample;

import static org.junit.Assert.assertEquals;

public class TestDefaultMethodExample {
	
	@Test
	public void testMethods() {
		DefaultMethodExample defaultMethodExample = new DefaultMethodExample();
		assertEquals((10+30),defaultMethodExample.add(10,30));
		assertEquals((30-10),defaultMethodExample.substract(30,10));
	}

}
