package priyanka.javaupgradesexamples.junit;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

import priyanka.javaupgradesexamples.AnnotationExample;

public class TestAnnotationExample {
	
	@Test
	public void executeFindLength() {
		AnnotationExample ae = new AnnotationExample();
		int actual = ae.findLength("Hello Annotations");
		assertNotNull(actual);
	}

}
