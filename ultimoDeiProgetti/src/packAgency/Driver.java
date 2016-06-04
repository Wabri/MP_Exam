package packAgency;

public class Driver extends Employee {

	public Driver(String name, String lastName) {
		super(name, lastName);
	}

	protected String addThing() {
		return "Driver";
	}
	
}
