package priyanka.javaupgradesexamples.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import priyanka.javaupgradesexamples.OptionalThrowDemo;

public class TestOptionalThrowDemo {
	@Test
	public void testOptional() {
		try {
		OptionalThrowDemo demoTest = new OptionalThrowDemo();
		String actual = demoTest.optionalThrowDemo(new String[10]);
		String expected = "String is null";
		
		assertEquals(expected,actual);
		}catch(NullPointerException ne) {System.out.println(ne.getMessage());}
	}
	
	@Test
	public void testOptionalThrowWithData() {
		OptionalThrowDemo demoTest = new OptionalThrowDemo();
		String[] str1 = {"Ameriaca","Africa","Europe","Asia","Australia","Antarctica"};
		String actual = demoTest.optionalThrowDemo(str1);
		String expected = "antarctica";
		
		assertEquals(expected,actual);
	}

}