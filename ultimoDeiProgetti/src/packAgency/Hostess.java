package packAgency;

public class Hostess extends Employee {

	private boolean travelling;

	public Hostess(String name, String lastName, char[] taxCode, String userName) {
		super(name, lastName,taxCode, userName);
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
	
	@Override
	public void accept(VisitorPersonAgency personVisitor) {
		personVisitor.visit(this);
	}

}
