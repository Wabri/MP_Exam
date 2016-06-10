package packTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import packAgency.Custom;
import packAgency.Driver;
import packAgency.Employee;
import packAgency.Hostess;
import packAgency.Manager;
import packAgency.VisitorPersonAgency;

public class TestVisitorLoginPerson {

	VisitorPersonAgency testVisitor;
	
	@Before
	public void initialize() {
		testVisitor = new VisitorPersonAgency();
	}
	
	@Test
	public void testVisitor() {
		Custom testCustom = new Custom("name1", "lastName1", null, null);
		Employee testEmployee = new Driver("nameDriver1", "lastNameDriver1", null, null);
		testEmployee.accept(testVisitor);
		assertTrue(testVisitor.getPersonVisited().equals(testEmployee));
		testEmployee = new Hostess("nameHostess1", "lastNameHostess1", null, null);
		assertFalse(testVisitor.getPersonVisited().equals(testEmployee));
		testEmployee.accept(testVisitor);
		testEmployee = new Manager("nameManager1","lastNameManager1", null, null);
		assertFalse(testVisitor.getPersonVisited().equals(testEmployee));
		testEmployee.accept(testVisitor);
		assertTrue(testVisitor.getPersonVisited().equals(testEmployee));
		testCustom.accept(testVisitor);
		assertTrue(testVisitor.getPersonVisited().equals(testCustom));
		assertFalse(testVisitor.getPersonVisited().equals(testEmployee));
	}

}
