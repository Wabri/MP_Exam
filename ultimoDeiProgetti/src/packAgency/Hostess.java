package packAgency;

import frameworkAgency.Employee;

public class Hostess extends Employee {

	private boolean travelling;

	public Hostess(String name, String lastName, char[] taxCode) {
		super(name,lastName,taxCode);
		travelling = false;
	}
	
	public Hostess(String name, String lastName, char[] taxCode, String userName) {
		super(name, lastName, taxCode, userName);
		travelling = false;
	}

	public Hostess(String name, String lastName, char[] taxCode, String userName, String password) {
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
		return "Hostess";
	}
	
}
