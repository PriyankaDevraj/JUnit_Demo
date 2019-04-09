package priyanka.javaupgradesexamples.junit;

import org.junit.Test;

import priyanka.javaupgradesexamples.NewToArrayDemo;

import static org.junit.Assert.assertEquals;

import java.util.Set;

public class TestNewToArrayDemo {
	
	@Test
	public void testToArrayDemo() {
		NewToArrayDemo nd = new NewToArrayDemo();
		Set<String> courses = Set.of("ISEM","Project Management","Computer Science","Analytics");
		String actual = nd.toArrayDemo(courses);
		
		String expected = courses.toString();
		assertEquals(expected,actual);
		
	}

}
