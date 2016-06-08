package packTest;

import static org.junit.Assert.*;
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
		testAgency = new Agency("agencyName1", new LinkedList<Employee>(), new LinkedList<Custom>(),
				new LinkedList<Product>(), new LinkedList<Vehicle>());
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
	public void testAddRemoveProduct() {
		Product testProduct = new Product("nameProduct1", 100.);
		assertTrue(testAgency.add(testProduct));
		assertTrue(testAgency.getListOfProduct().contains(testProduct));
		assertTrue(testAgency.remove(testProduct));
		assertFalse(testAgency.getListOfProduct().contains(testProduct));
	}
	
	@Test
	public void testCatchException () {
		Agency testCatchAgency = new Agency("nameAgency1", null, null, null, null);
		assertFalse(testCatchAgency.add(new Custom("nameCustom1", "lastNameCustom1", testTaxCode)));
		assertFalse(testCatchAgency.add(new Manager("nameManager1", "lastNameManager1", testTaxCode)));
		assertFalse(testCatchAgency.add(new Product("product1", 100.)));
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
