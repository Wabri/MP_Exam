package packAgency;

import frameworkAgency.Employee;

public class Manager extends Employee {

	public Manager(String name, String lastName, char[] taxCode, String userName) {
		super(name, lastName, taxCode, userName);
	}

	@Override
	protected String addThing() {
		return "Manager";
	}	
	
	public boolean isAdmin() {
		return true;
	}

}
