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
		LinkedList<Client> testListOfClient = new LinkedList<Client>();
		testAgency = new Agency("agencyName1", testListOfEmployees, testListOfClient, testListOfProduct);
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
	public void testAddRemoveClient() {
		Client testClient = new Client("clientName1", "clientLastName1");
		assertTrue(testAgency.add(testClient));
		assertTrue(testAgency.getListOfClient().contains(testClient));
		assertTrue(testAgency.remove(testClient));
		assertFalse(testAgency.getListOfClient().contains(testClient));
	}

}
