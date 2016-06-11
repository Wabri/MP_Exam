package packTest;

import static org.junit.Assert.*;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import org.junit.Before;
import org.junit.Test;
import packAgency.*;

public class TestAgency {

	Agency testAgency;
	DataAgency testDataAgency;
	char[] testTaxCode = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };

	public void initializeNoSpecific() {
		testAgency = new Agency("agencyName1");
	}

	public void initializeWithSpecific() {
		testAgency = new Agency("nameAgency1", new LinkedList<Employee>(), new LinkedList<Custom>(),
				new LinkedList<Vehicle>(), new LinkedList<Travel>(), new LinkedList<Place>());
	}

	@Before
	public void inizialize() {
		this.initializeNoSpecific();
		testDataAgency = testAgency.getDataAgency();
	}

	@Test
	public void testCreateNewAgencyNoSpecific() {
		this.initializeNoSpecific();
		assertFalse(testAgency.equals(null));
	}

	@Test
	public void testCreateNewAgencyWithSpecific() {
		this.initializeWithSpecific();
		assertFalse(testAgency.equals(null));
	}

	@Test
	public void testAddRemoveEmployee() {
		Hostess testHostess = new Hostess("hostessName1", "hostessLastName1", testTaxCode, null);
		Driver testDriver = new Driver("driverName1", "driverLastName1", testTaxCode, null);
		Manager testManager = new Manager("managerName1", "managerLastName1", testTaxCode, null);
		assertTrue(addEmployees(testHostess, testDriver, testManager));
		assertFalse(testDataAgency.add(testDriver));
		assertFalse(testDataAgency.add(testHostess));
		assertFalse(testDataAgency.add(testManager));
		assertTrue(removeEmployees(testHostess, testDriver, testManager));
		assertFalse(testDataAgency.remove(testDriver));
		assertFalse(testDataAgency.remove(testHostess));
		assertFalse(testDataAgency.remove(testManager));
	}

	@Test
	public void testAddRemoveCustom() {
		Custom testCustom = new Custom("customName1", "customLastName1", testTaxCode, null);
		assertTrue(testDataAgency.add(testCustom));
		assertFalse(testDataAgency.add(testCustom));
		assertTrue(testDataAgency.getListOfCustom().contains(testCustom));
		assertTrue(testDataAgency.remove(testCustom));
		assertFalse(testDataAgency.getListOfCustom().contains(testCustom));
		assertFalse(testDataAgency.remove(testCustom));
	}

	@Test
	public void testAddRemoveVehicles() {
		Vehicle testVehicles = new Vehicle("plate1", 50);
		assertTrue(testDataAgency.add(testVehicles));
		assertFalse(testDataAgency.add(testVehicles));
		assertTrue(testDataAgency.getListOfVehicles().contains(testVehicles));
		assertTrue(testDataAgency.remove(testVehicles));
		assertFalse(testDataAgency.getListOfVehicles().contains(testVehicles));
		assertFalse(testDataAgency.remove(testVehicles));
	}

	@Test
	public void testAddRemoveTravel() {
		Travel testTravel = new Travel("nameProduct1", new Place("namePlace1"), new GregorianCalendar(1920, 10, 10),
				new Place("namePlace2"), new GregorianCalendar(1930, 12, 10), 100.);
		assertTrue(testDataAgency.add(testTravel));
		assertFalse((testDataAgency.add(testTravel)));
		assertTrue(testDataAgency.getListOfTravel().contains(testTravel));
		assertTrue(testDataAgency.remove(testTravel));
		assertFalse(testDataAgency.getListOfTravel().contains(testTravel));
		assertFalse(testDataAgency.remove(testTravel));
	}

	@Test
	public void testAddRemovePlace() {
		Place testPlace = new Place("namePlace1");
		assertTrue(testDataAgency.add(testPlace));
		assertFalse(testDataAgency.add(testPlace));
		assertTrue(testDataAgency.getListOfPlace().contains(testPlace));
		assertTrue(testDataAgency.remove(testPlace));
		assertFalse(testDataAgency.getListOfPlace().contains(testPlace));
		assertFalse(testDataAgency.remove(testPlace));
	}

	@Test
	public void testCatchException() {
		Agency testCatchAgency = new Agency(null, null, null, null, null, null);
		DataAgency testCatchDataAgency = testCatchAgency.getDataAgency();
		assertFalse(testCatchDataAgency.add(new Custom(null, null, null, null)));
		assertFalse(testCatchDataAgency.add(new Manager(null, null, null, null)));
		assertFalse(testCatchDataAgency.add(new Travel(null, null, null, null, null, 200.)));
		assertFalse(testCatchDataAgency.add(new Vehicle(null, 10)));
		assertFalse(testCatchDataAgency.add(new Place(null)));
		assertFalse(testCatchDataAgency.remove(new Hostess(null, null, null, null)));
		assertFalse(testCatchDataAgency.remove(new Custom(null, null, null, null)));
		assertFalse(testCatchDataAgency.remove(new Vehicle(null, 50)));
		assertFalse(testCatchDataAgency.remove(new Product(null, 200.)));
		assertFalse(testCatchDataAgency.remove(new Place(null)));
	}

	private boolean removeEmployees(Hostess testHostess, Driver testDriver, Manager testManager) {
		try {
			assertTrue(testDataAgency.remove(testHostess));
			assertTrue(testDataAgency.remove(testDriver));
			assertTrue(testDataAgency.remove(testManager));
			assertFalse(testDataAgency.getListOfEmployees().contains(testManager));
			assertFalse(testDataAgency.getListOfEmployees().contains(testDriver));
			assertFalse(testDataAgency.getListOfEmployees().contains(testHostess));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	private boolean addEmployees(Hostess testHostess, Driver testDriver, Manager testManager) {
		try {
			assertTrue(testDataAgency.add(testHostess));
			assertTrue(testDataAgency.add(testDriver));
			assertTrue(testDataAgency.add(testManager));
			assertTrue(testDataAgency.getListOfEmployees().contains(testManager));
			assertTrue(testDataAgency.getListOfEmployees().contains(testDriver));
			assertTrue(testDataAgency.getListOfEmployees().contains(testHostess));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
