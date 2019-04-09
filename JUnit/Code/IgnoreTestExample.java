package junitexample;

import static org.junit.Assert.assertThat;

import org.junit.Ignore;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;

public class IgnoreTestExample {
	@Ignore("Test is ignored as a demonstration")
	@Test
	public void testSame() {
	    assertThat(1, is(2));
	}
}
