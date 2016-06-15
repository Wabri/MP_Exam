package packAgency;

import frameworkAgency.Employee;

public class Driver extends Employee {

	private boolean travelling;

	public Driver(String name, String lastName, char[] taxCode) {
		super(name,lastName,taxCode);
		travelling = false;
	}
	
	public Driver(String name, String lastName, char[] taxCode, String userName) {
		super(name, lastName, taxCode, userName);
		travelling = false;
	}

	public Driver(String name, String lastName, char[] taxCode, String userName, String password) {
		super(name,lastName,taxCode,userName, password);
		travelling = false;
	}
	
	public boolean isTravelling() {
		return travelling;
	}

	public void setTravelling(boolean travelling) {
		this.travelling = travelling;
	}

	protected String addThing() {
		return "Driver";
	}
}