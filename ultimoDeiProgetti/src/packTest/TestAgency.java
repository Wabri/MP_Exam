package packTest;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;
import java.util.LinkedList;
import org.junit.Before;
import org.junit.Test;
import packAgency.*;

public class TestAgency {

	Agency testAgency;
	char[] testTaxCode = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};

	public void initializeNoSpecific() {
		testAgency = new Agency("agencyName1");
	}
	
	public void initializeWithSpecific() {
		testAgency = new Agency("nameAgency1", new LinkedList<Employee>(), new LinkedList<Custom>(), new LinkedList<Vehicle>(), new LinkedList<Travel>(), new LinkedList<Place>());
	}
	
	@Before
	public void inizialize() {
		this.initializeNoSpecific();
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
		Hostess testHostess = new Hostess("hostessName1", "hostessLastName1",testTaxCode);
		Driver testDriver = new Driver("driverName1", "driverLastName1",testTaxCode);
		Manager testManager = new Manager("managerName1", "managerLastName1",testTaxCode);
		assertTrue(addEmployees(testHostess, testDriver, testManager));
		assertTrue(removeEmployees(testHostess, testDriver, testManager));
	}

	@Test
	public void testAddRemoveCustom() {
		Custom testCustom = new Custom("customName1", "customLastName1", testTaxCode);
		assertTrue(testAgency.add(testCustom));
		assertTrue(testAgency.getListOfCustom().contains(testCustom));
		assertTrue(testAgency.remove(testCustom));
		assertFalse(testAgency.getListOfCustom().contains(testCustom));
	}

	@Test
	public void testAddRemoveVehicles() {
		Vehicle testVehicles = new Vehicle("plate1", 50);
		assertTrue(testAgency.add(testVehicles));
		assertTrue(testAgency.getListOfVehicles().contains(testVehicles));
		assertTrue(testAgency.remove(testVehicles));
		assertFalse(testAgency.getListOfVehicles().contains(testVehicles));
	}
	
	@Test
	public void testAddRemoveTravel() {
		Travel testTravel = new Travel("nameProduct1", new Place("namePlace1"), new GregorianCalendar(1920,10,10), new Place("namePlace2"), new GregorianCalendar(1930, 12, 10), 100.);
		assertTrue(testAgency.add(testTravel));
		assertTrue(testAgency.getListOfTravel().contains(testTravel));
		assertTrue(testAgency.remove(testTravel));
		assertFalse(testAgency.getListOfTravel().contains(testTravel));
	}
	
	@Test
	public void testCatchException () {
		Agency testCatchAgency = new Agency("nameAgency1", null, null, null, null, null);
		assertFalse(testCatchAgency.add(new Custom("nameCustom1", "lastNameCustom1", testTaxCode)));
		assertFalse(testCatchAgency.add(new Manager("nameManager1", "lastNameManager1", testTaxCode)));
		assertFalse(testCatchAgency.add(new Travel("nameProduct2", new Place("namePlace3"), new GregorianCalendar(2000,20,10), new Place("namePlace4"), new GregorianCalendar(2000,31,12), 200.)));
		assertFalse(testCatchAgency.add(new Vehicle("plate1", 10)));
		assertFalse(testCatchAgency.remove(new Hostess("nameHostess1", "lastNameHostess1", testTaxCode)));
		assertFalse(testCatchAgency.remove(new Custom("nameCustom1", "lastNameCustom1", testTaxCode)));
		assertFalse(testCatchAgency.remove(new Vehicle("plate1", 50)));
		assertFalse(testCatchAgency.remove(new Product("nameProduct1", 200.)));
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
