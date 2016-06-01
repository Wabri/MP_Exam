package packTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.omg.CosNaming.NamingContextPackage.NotEmpty;

import packAgency.Agency;
import packAgency.Driver;
import packAgency.Employee;
import packAgency.Hostess;
import packAgency.Manager;

public class TestAgency {
	
	Agency newAgency;
	
	@Test
	public void testCreateNewAgency() {
		newAgency = new Agency();
		assertFalse(newAgency.equals(null));
	}
	
	@Test
	public void testAddRemoveEmployee() {
		newAgency = new Agency();
		Hostess myHostess = new Hostess("hostessName1","hostessLastName1");
		Driver myDriver = new Driver("driverName1","driverLastName1");
		Manager myManager = new Manager("managerName1","managerLastName1");
		assertTrue(newAgency.add(myHostess));
		assertTrue(newAgency.add(myDriver));
		assertTrue(newAgency.add(myManager));
		assertTrue(newAgency.remove(myHostess));
		assertTrue(newAgency.remove(myDriver));
		assertTrue(newAgency.remove(myManager));
	}

}
