package priyanka.javaupgradesexamples.junit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import priyanka.javaupgradesexamples.MethodReferenceLambda;

public class TestMethodReferenceLambda {

	@Test
	public void testThread(){
		MethodReferenceLambda.startThread();
		assertTrue(MethodReferenceLambda.t.isAlive());
	}
}
