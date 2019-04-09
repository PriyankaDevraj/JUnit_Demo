package priyanka.javaupgradesexamples.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import priyanka.javaupgradesexamples.HelloWorldGreeting;
import priyanka.javaupgradesexamples.LambdaGreeting;

public class TestHelloWorldGreeting {
	
	@Test
	public void testLambda() {
		LambdaGreeting expected = new HelloWorldGreeting();
		LambdaGreeting actual = ()->"Hello World";
		assertEquals(expected.greeting(),actual.greeting());

	}

	@Test
	public void testInnerClass() {
		LambdaGreeting expected = new HelloWorldGreeting();
		LambdaGreeting actual = new LambdaGreeting(){
			public String greeting() {
				return "Hello World";
			}
		};
		assertEquals(expected.greeting(),actual.greeting());

	}
}
