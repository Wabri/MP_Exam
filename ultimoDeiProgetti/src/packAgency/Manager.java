package packAgency;

public class Manager extends Employee {

	public Manager(String name, String lastName) {
		super(name, lastName);
	}

	@Override
	protected String addThing() {
		return "Manager";
	}
	
	

}
