package packTest;

import static org.junit.Assert.*;
import org.junit.Test;
import frameworkAgency.PersonAgency;
import packAgency.Driver;

public class TestCredentialsPerson {

	@Test
	public void test() {
		PersonAgency testPersonAgency = new Driver("nameDriver1", "lastNameDriver1", null); 
		TryPerson(testPersonAgency);
		testPersonAgency = new Driver("nameDriver2", "lastNameDriver2", null, "userNameDriver1");
		TryPerson(testPersonAgency);
		assertTrue(testPersonAgency.getLoginCredentials().getUserName().equals("userNameDriver1"));
		testPersonAgency = new Driver("nameDriver3", "lastNameDriver3", null, "userNameDriver2", "password1");
		TryPerson(testPersonAgency);
		assertFalse(testPersonAgency.getLoginCredentials().getUserName().equals("userNameDriver1"));
		assertTrue(testPersonAgency.getLoginCredentials().getUserName().equals("userNameDriver2"));
		assertTrue(testPersonAgency.getLoginCredentials().getPassword().equals("password1"));
	}

	private void TryPerson(PersonAgency testPersonAgency) {
		assertFalse(testPersonAgency.isAdmin());
		assertTrue(testPersonAgency.isEmployee());
	}

}
