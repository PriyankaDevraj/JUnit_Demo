package junitexample;

import java.util.ArrayList;

import org.junit.Test;

public class ExpectedExceptionTest {
	@Test(expected = IndexOutOfBoundsException.class) 
	public void empty() { 
	     new ArrayList<Object>().get(0); 
	}
}
