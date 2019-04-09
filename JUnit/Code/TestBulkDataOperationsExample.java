package priyanka.javaupgradesexamples.junit;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import priyanka.javaupgradesexamples.BulkDataOperationsExample;
import priyanka.javaupgradesexamples.Person;

public class TestBulkDataOperationsExample {
	
	
	private List<Person> person = Person.createRoster();
	private BulkDataOperationsExample bo = new BulkDataOperationsExample();
	
	@Test
	public void testPersonData() {
		List<String> expected = new ArrayList<>();
		List<String> actual = bo.getAllNames();
			
		for (Person per:person) {
			expected.add(per.getName());
		}
		assertEquals(expected,actual);
	}
	
	@Test
	public void testDetailsData() {
		
		List<Person> expected = new ArrayList<>();
		List<Person> actual = bo.getAllDetails();
				
		for (Person per:person) {
			expected.add(per);
		}
		assertEquals(expected.toString(),actual.toString());
	}
	
	@Test
	public void testAllMaleMembers() {
		List<Person> expected = new ArrayList<>();
		List<Person> actual = bo.getAllMaleMembers();
		
		for(Person per:person) {
			if(per.getGender().equals(Person.Sex.MALE))
			expected.add(per);
		}
		assertEquals(expected.toString(),actual.toString());
	}
	
	@Test
	public void testAvgAgeMaleMembers() {
		Double expected = 0.0;
		Double actual = bo.getAvgAgeMaleMembers();
		int count = 0;
		
		for(Person per:person) {
			if(per.getGender().equals(Person.Sex.MALE)) {
				expected+=per.getAge();
				count++;
			}
		}
		expected = expected/count;
		assertEquals(expected,actual);
	}
	
}
