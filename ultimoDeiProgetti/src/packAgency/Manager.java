package packAgency;

public class Manager extends Employee {

	public Manager(String name, String lastName, char[] taxCode) {
		super(name, lastName, taxCode);
	}

	@Override
	protected String addThing() {
		return "Manager";
	}	

}
