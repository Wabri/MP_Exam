package packTest;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

import packAgency.Driver;
import packAgency.Hostess;
import packAgency.Place;
import packAgency.Travel;
import packAgency.Vehicle;

public class TestTravel {

	private Travel testTravel;
	private LinkedList<Vehicle> listOfVehicles;

	@Before
	public void initialize() {
		testTravel = new Travel("nameTravel1", new Place("namePlace1"), new Place("namePlace2"), 100);
		listOfVehicles = new LinkedList<Vehicle>();
		listOfVehicles.add(new Vehicle("plate1"));
		listOfVehicles.add(new Vehicle("plate2"));
		listOfVehicles.add(new Vehicle("plate3"));
	}

	@Test
	public void testCreateNewTravel() {
		assertFalse(testTravel.equals(null));
	}

	public void testAddRemoveTravelInfo() {
		assertTrue(testTravel.assignVehicle(listOfVehicles));
		assertTrue(1 == testTravel.getListOfVehicles().size());
		assertTrue(assignTeamToVehicles());
		assertTrue(isAllTeamSet());
		assertTrue(testTravel.endTravel());
		assertFalse(isAllTeamSet());
		assertTrue(0 == testTravel.getListOfVehicles().size());
	}

	private boolean isAllTeamSet() {
		Iterator<Vehicle> iteratorTestVehicles = testTravel.getListOfVehicles().iterator();
		while(iteratorTestVehicles.hasNext()) {
			try {
				iteratorTestVehicles.next().getDriverAssociated().isTravelling();
				iteratorTestVehicles.next().getHostessAssociated().isTravelling();
			} catch (Exception e) {
				return false;
			}
		}
		return true;
	}

	private boolean assignTeamToVehicles() {
		try {
			Iterator<Vehicle> iteratorTestVehicles = testTravel.getListOfVehicles().iterator();
			while (iteratorTestVehicles.hasNext()) {
				iteratorTestVehicles.next().setDriverAssociated(new Driver("nameDriver1", "lastNameDriver1"));
				iteratorTestVehicles.next().setHostessAssociated(new Hostess("nameHostess1", "lastNameHostess1"));
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
