package packAgency;

public class Manager extends Employee {

	public Manager(String name, String lastName, char[] taxCode, String userName) {
		super(name, lastName, taxCode, userName);
	}

	@Override
	protected String addThing() {
		return "Manager";
	}	
	
	@Override
	public void accept(VisitorPersonAgency personVisitor) {
		personVisitor.visit(this);
	}

}
