package packTest;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

import packAgency.Custom;
import packAgency.Driver;
import packAgency.Hostess;
import packAgency.Place;
import packAgency.Travel;
import packAgency.Vehicle;

public class TestTravel {

	private Travel testTravel;
	private LinkedList<Vehicle> listOfVehicles;

	public void initializeWithVehicles() {
		testTravel = new Travel("nameTravel1", new Place("namePlace1"), new GregorianCalendar(2016, 04, 05),
				new Place("namePlace2"), new GregorianCalendar(2016, 05, 15), 100., listOfVehicles);
	}

	public void initializeWithNoVehicles() {
		testTravel = new Travel("nameTravel1", new Place("namePlace1"), new GregorianCalendar(2016, 04, 05),
				new Place("namePlace2"), new GregorianCalendar(2016, 05, 15), 100.);
	}

	@Before
	public void initialize() {
		listOfVehicles = new LinkedList<Vehicle>();
		Vehicle tmpVehicle = new Vehicle("plate1", 50);
		tmpVehicle.setTravelling(true);
		listOfVehicles.add(tmpVehicle);
		listOfVehicles.add(new Vehicle("plate2",0));
		listOfVehicles.add(new Vehicle("plate3",30));
		initializeWithNoVehicles();
	}

	@Test
	public void testCreateNewTravel() {
		assertFalse(testTravel.equals(null));
		initializeWithVehicles();
		assertFalse(testTravel.equals(null));
	}

	@Test
	public void testAddRemoveTravelInfo() {
		assertTrue(testTravel.assignVehicle(listOfVehicles));
		assertTrue(1 == testTravel.getNumOfVehicles());
		assertTrue(assignTeamToVehicles());
		assertTrue(assignTeamToVehicles());
		assertTrue(testTravel.endTravel());
		assertTrue(0 == testTravel.getNumOfVehicles());
	}

	@Test
	public void testCatchExceptionTravel() {
		Travel testExceptionTravel = new Travel("ciao", null, null, null, null, 0, null);
		assertFalse(testExceptionTravel.assignVehicle(null));
		assertFalse(testExceptionTravel.endTravel());
		assertFalse(testExceptionTravel.removeSeat(new Custom("nameCustom1", "lastNameCustom1", null, null)));
		assertFalse(testExceptionTravel.setSeat(new Custom("nameCustom1", "lastNameCustom1", null, null), null, 50));
		assertFalse(testExceptionTravel.setSeat(new Custom("nameCustom1", "lastNameCustom1", null, null), new Vehicle("plate1", 10), 50));
	}
	
	private boolean assignTeamToVehicles() {
		try {
			char[] testTaxCode = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
			Iterator<Vehicle> iteratorTestVehicles = testTravel.getListOfVehicles().iterator();
			Vehicle tmpVehicle;
			while (iteratorTestVehicles.hasNext()) {
				tmpVehicle = iteratorTestVehicles.next();
				tmpVehicle.setDriverAssociated(new Driver("nameDriver1", "lastNameDriver1", testTaxCode, null));
				tmpVehicle.setHostessAssociated(new Hostess("nameHostess1", "lastNameHostess1", testTaxCode, null));
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
