package priyanka.javaupgradesexamples.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import priyanka.javaupgradesexamples.OptionalDemo;

public class TestOptionalDemo {
	@Test
	public void testOptional() {
		OptionalDemo demoTest = new OptionalDemo();
		String actual = demoTest.optionalDemo(new String[10]);
		String expected = "String is null";
		
		assertEquals(expected,actual);
	}
	
	@Test
	public void testOptionalWithData() {
		OptionalDemo demoTest = new OptionalDemo();
		String[] str1 = {"Ameriaca","Africa","Europe","Asia","Australia","Antarctica"};
		String actual = demoTest.optionalDemo(str1);
		String expected = "antarctica";
		
		assertEquals(expected,actual);
	}

}
