package packAgency;

public class Hostess extends Employee {

	private boolean travelling;

	public Hostess(String name, String lastName) {
		super(name, lastName);
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
