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
		Hostess testHostess = new Hostess("hostessName1", "hostessLastName1",testTaxCode, null);
		Driver testDriver = new Driver("driverName1", "driverLastName1",testTaxCode, null);
		Manager testManager = new Manager("managerName1", "managerLastName1",testTaxCode, null);
		assertTrue(addEmployees(testHostess, testDriver, testManager));
		assertFalse(testAgency.add(testDriver));
		assertFalse(testAgency.add(testHostess));
		assertFalse(testAgency.add(testManager));
		assertTrue(removeEmployees(testHostess, testDriver, testManager));
		assertFalse(testAgency.remove(testDriver));
		assertFalse(testAgency.remove(testHostess));
		assertFalse(testAgency.remove(testManager));
	}

	@Test
	public void testAddRemoveCustom() {
		Custom testCustom = new Custom("customName1", "customLastName1", testTaxCode, null);
		assertTrue(testAgency.add(testCustom));
		assertFalse(testAgency.add(testCustom));
		assertTrue(testAgency.getListOfCustom().contains(testCustom));
		assertTrue(testAgency.remove(testCustom));
		assertFalse(testAgency.getListOfCustom().contains(testCustom));
		assertFalse(testAgency.remove(testCustom));
	}

	@Test
	public void testAddRemoveVehicles() {
		Vehicle testVehicles = new Vehicle("plate1", 50);
		assertTrue(testAgency.add(testVehicles));
		assertFalse(testAgency.add(testVehicles));
		assertTrue(testAgency.getListOfVehicles().contains(testVehicles));
		assertTrue(testAgency.remove(testVehicles));
		assertFalse(testAgency.getListOfVehicles().contains(testVehicles));
		assertFalse(testAgency.remove(testVehicles));
	}
	
	@Test
	public void testAddRemoveTravel() {
		Travel testTravel = new Travel("nameProduct1", new Place("namePlace1"), new GregorianCalendar(1920,10,10), new Place("namePlace2"), new GregorianCalendar(1930, 12, 10), 100.);
		assertTrue(testAgency.add(testTravel));
		assertFalse((testAgency.add(testTravel)));
		assertTrue(testAgency.getListOfTravel().contains(testTravel));
		assertTrue(testAgency.remove(testTravel));
		assertFalse(testAgency.getListOfTravel().contains(testTravel));
		assertFalse(testAgency.remove(testTravel));
	}
	
	@Test
	public void testAddRemovePlace() {
		Place testPlace = new Place("namePlace1");
		assertTrue(testAgency.add(testPlace));
		assertFalse(testAgency.add(testPlace));
		assertTrue(testAgency.getListOfPlace().contains(testPlace));
		assertTrue(testAgency.remove(testPlace));
		assertFalse(testAgency.getListOfPlace().contains(testPlace));
		assertFalse(testAgency.remove(testPlace));
	}
	
	@Test
	public void testCatchException () {
		Agency testCatchAgency = new Agency(null, null, null, null, null, null);
		assertFalse(testCatchAgency.add(new Custom(null, null, null,null)));
		assertFalse(testCatchAgency.add(new Manager(null, null, null,null)));
		assertFalse(testCatchAgency.add(new Travel(null, null, null, null, null, 200.)));
		assertFalse(testCatchAgency.add(new Vehicle(null, 10)));
		assertFalse(testCatchAgency.add(new Place(null)));
		assertFalse(testCatchAgency.remove(new Hostess(null, null, null,null)));
		assertFalse(testCatchAgency.remove(new Custom(null, null, null,null)));
		assertFalse(testCatchAgency.remove(new Vehicle(null, 50)));
		assertFalse(testCatchAgency.remove(new Product(null, 200.)));
		assertFalse(testCatchAgency.remove(new Place(null)));
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
