package priyanka.javaupgradesexamples.junit;

import static org.junit.Assert.assertThat;
import java.io.FileNotFoundException;

import org.junit.Test;

import priyanka.javaupgradesexamples.TryResourcesExample1;

import static org.hamcrest.CoreMatchers.is;

public class TestTryResourceExample1 {

	@Test
	public void testFinalVariable() {
		try {
		TryResourcesExample1 tryresource1 = new TryResourcesExample1();
		boolean success = tryresource1.createFile();
		assertThat(success,is(true));
		}catch(FileNotFoundException aFileNotFoundException) {
			System.out.println(aFileNotFoundException.getMessage());
		}
		
	}

}
