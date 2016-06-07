package packTest;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

import packAgency.Custom;
import packAgency.Place;
import packAgency.Travel;
import packAgency.Vehicle;

public class TestBooking {

	Custom testCustomer;
	char[] testTaxCode = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
	private Travel testTravel;
	Vehicle testVehicle;
	
	@Before
	public void initialize() {
		testCustomer = new Custom("nameCustomer1", "lastNameCustomer1", testTaxCode);
		Collection<Vehicle> listOfVehicles = new LinkedList<Vehicle>();
		testVehicle = new Vehicle("plate1",100);
		listOfVehicles.add(testVehicle);
		testTravel = new Travel("nameTravel1", new Place("namePlace1"), new GregorianCalendar(2016,1,5), new Place("namePlace2"), new GregorianCalendar(2016, 1, 10), 100., listOfVehicles);
	}
	
	@Test
	public void testAddRemoveBooking() {
		assertTrue(testCustomer.add(testTravel));
		assertTrue(testCustomer.getListOfBooking().contains(testTravel));
		assertTrue(testCustomer.remove(testTravel));
		assertFalse(testCustomer.getListOfBooking().contains(testTravel));
	}
	
	@Test
	public void testSetSeat() {
		assertTrue(testTravel.setRandomSeat(testCustomer));
		assertTrue(testTravel.removeSeat(testCustomer));
		assertTrue(testTravel.setSeat(testCustomer,testVehicle,50));	
	}
	
}
