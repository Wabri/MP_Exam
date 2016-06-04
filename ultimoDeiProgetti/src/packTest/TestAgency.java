package packTest;

import static org.junit.Assert.*;
import java.util.LinkedList;
import org.junit.Before;
import org.junit.Test;
import packAgency.*;

public class TestAgency {

	Agency testAgency;

	@Before
	public void initialize() {
		LinkedList<Employee> testListOfEmployees = new LinkedList<Employee>();
		LinkedList<Product> testListOfProduct = new LinkedList<Product>();
		LinkedList<Custom> testListOfCustom = new LinkedList<Custom>();
		testAgency = new Agency("agencyName1", testListOfEmployees, testListOfCustom, testListOfProduct);
	}

	@Test
	public void testCreateNewAgency() {
		assertFalse(testAgency.equals(null));
	}

	@Test
	public void testAddRemoveEmployee() {
		Hostess testHostess = new Hostess("hostessName1", "hostessLastName1");
		Driver testDriver = new Driver("driverName1", "driverLastName1");
		Manager testManager = new Manager("managerName1", "managerLastName1");
		assertTrue(testAgency.add(testHostess));
		assertTrue(testAgency.add(testDriver));
		assertTrue(testAgency.add(testManager));
		assertTrue(testAgency.getListOfEmployees().contains(testManager));
		assertTrue(testAgency.getListOfEmployees().contains(testDriver));
		assertTrue(testAgency.getListOfEmployees().contains(testHostess));
		assertTrue(testAgency.remove(testHostess));
		assertTrue(testAgency.remove(testDriver));
		assertTrue(testAgency.remove(testManager));
		assertFalse(testAgency.getListOfEmployees().contains(testManager));
		assertFalse(testAgency.getListOfEmployees().contains(testDriver));
		assertFalse(testAgency.getListOfEmployees().contains(testHostess));
	}

	@Test
	public void testAddRemoveCustom() {
		Custom testCustom = new Custom("customName1", "customLastName1", 0);
		assertTrue(testAgency.add(testCustom));
		assertTrue(testAgency.getListOfCustom().contains(testCustom));
		assertTrue(testAgency.remove(testCustom));
		assertFalse(testAgency.getListOfCustom().contains(testCustom));
	}

}
