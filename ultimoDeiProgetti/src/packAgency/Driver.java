package packAgency;

public class Driver extends Employee {

	private boolean travelling;
	
	public Driver(String name, String lastName, char[] taxCode) {
		super(name, lastName, taxCode);
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
