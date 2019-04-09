package priyanka.javaupgradesexamples.junit;

import org.junit.Test;

import priyanka.javaupgradesexamples.FactoryMethodsExample;

import static org.junit.Assert.assertEquals;


import java.util.List;

public class TestFactoryMethodsExample {

	@Test
	public void getListOfTech() {
		FactoryMethodsExample fme = new FactoryMethodsExample();
		List<String> actual = fme.getListofTech();
		List<String> expected = List.of("Java","JavaFX","Spring","Hibernate","JSP");
		
		assertEquals(expected,actual);
		
		
	}
}
