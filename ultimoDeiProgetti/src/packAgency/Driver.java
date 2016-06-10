package packAgency;

public class Driver extends Employee {

	private boolean travelling;
	
	public Driver(String name, String lastName, char[] taxCode, String userName) {
		super(name, lastName, taxCode, userName);
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
	
	@Override
	public void accept(VisitorPersonAgency personVisitor) {
		personVisitor.visit(this);
	}
}
