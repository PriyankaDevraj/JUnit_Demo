package priyanka.javaupgradesexamples.junit;

import static org.junit.Assert.assertThat;
import java.io.FileNotFoundException;

import org.junit.Test;

import priyanka.javaupgradesexamples.TryResourcesExample;

import static org.hamcrest.CoreMatchers.is;

public class TestTryResourceExample {

	@Test
	public void testFinalVariable() {
		try {
		TryResourcesExample tryresource = new TryResourcesExample();
		boolean success = tryresource.createFile();
		assertThat(success,is(true));
		}catch(FileNotFoundException aFileNotFoundException) {
			System.out.println(aFileNotFoundException.getMessage());
		}
		
	}

}
