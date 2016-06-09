package packTest;

import java.util.LinkedList;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import packAgency.Hotel;
import packAgency.Place;

public class TestPlaceHotel {
	
	private Place testPlace;

	@Before
	public void initialize() {
		testPlace = new Place("namePlace1", new LinkedList<Hotel>());
	}
	
	@Test
	public void testAddRemoveHotel() {
		Hotel testHotel = new Hotel("nameHotel1",this.testPlace);
		assertTrue(testPlace.add(testHotel));
		assertTrue(testPlace.getListOfHotel().contains(testHotel));
		assertFalse(testPlace.add(testHotel));
		assertTrue(testPlace.remove(testHotel));
		assertFalse(testPlace.getListOfHotel().contains(testHotel));
		assertFalse(testPlace.remove(testHotel));
	}
	
	@Test
	public void testCatchException() {
		testPlace = new Place(null, null);
		assertFalse(testPlace.add(new Hotel(null, null)));
		assertFalse(testPlace.remove(new Hotel(null, null)));
	}

}
