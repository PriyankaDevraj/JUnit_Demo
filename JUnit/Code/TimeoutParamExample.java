package junitexample;

import static org.junit.Assert.assertThat;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
public class TimeoutParamExample {
	
	@Test(timeout=1000)
	public void testExpression() throws InterruptedException{
		
		assertThat("Hello",is("World"));
	}

}
