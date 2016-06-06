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
		testAgency = new Agency("agencyName1", new LinkedList<Employee>(), new LinkedList<Custom>(), new LinkedList<Product>(), new LinkedList<Vehicles>());
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
		assertTrue(addEmployees(testHostess, testDriver, testManager));
		assertTrue(removeEmployees(testHostess, testDriver, testManager));
	}

	@Test
	public void testAddRemoveCustom() {
		Custom testCustom = new Custom("customName1", "customLastName1", 0);
		assertTrue(testAgency.add(testCustom));
		assertTrue(testAgency.getListOfCustom().contains(testCustom));
		assertTrue(testAgency.remove(testCustom));
		assertFalse(testAgency.getListOfCustom().contains(testCustom));
	}
	
	@Test
	public void testAddRemoveVehicles() {
		Vehicles testVehicles = new Vehicles("plate1");
		assertTrue(testAgency.add(testVehicles));
		assertTrue(testAgency.getListOfVehicles().contains(testVehicles));
		assertTrue(testAgency.remove(testVehicles));
		assertFalse(testAgency.getListOfVehicles().contains(testVehicles));
	}

	private boolean removeEmployees(Hostess testHostess, Driver testDriver, Manager testManager) {
		try {
			assertTrue(testAgency.remove(testHostess));
			assertTrue(testAgency.remove(testDriver));
			assertTrue(testAgency.remove(testManager));
			assertFalse(testAgency.getListOfEmployees().contains(testManager));
			assertFalse(testAgency.getListOfEmployees().contains(testDriver));
			assertFalse(testAgency.getListOfEmployees().contains(testHostess));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	private boolean addEmployees(Hostess testHostess, Driver testDriver, Manager testManager) {
		try {
			assertTrue(testAgency.add(testHostess));
			assertTrue(testAgency.add(testDriver));
			assertTrue(testAgency.add(testManager));
			assertTrue(testAgency.getListOfEmployees().contains(testManager));
			assertTrue(testAgency.getListOfEmployees().contains(testDriver));
			assertTrue(testAgency.getListOfEmployees().contains(testHostess));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
}
