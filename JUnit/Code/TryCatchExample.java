package junitexample;

import static org.junit.Assert.fail;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import java.util.ArrayList;

import org.junit.Test;

public class TryCatchExample {
	
	@Test
	public void testTryCatch(){
		try {
			new ArrayList<Object>().get(0);
			fail("Expected an IndexOutOfBoundsException to be thrown");
		}catch(IndexOutOfBoundsException anIndexOutOfBoundsException) {
			assertThat(anIndexOutOfBoundsException.getMessage(), is("Index: 0, Size: 0"));
		}
	}
}
