package priyanka.javaupgradesexamples.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import priyanka.javaupgradesexamples.MyLambda;

public class TestMyLambda {

	@Test
	public void testMyLambda() {
		MyLambda ml = new MyLambda();
		int actual = ml.myLambda();
		assertEquals(5*15,actual);
	}
}
