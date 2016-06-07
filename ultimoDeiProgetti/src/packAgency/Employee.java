package packAgency;

public abstract class Employee extends Person{
	
	public Employee(String name, String lastName, char[] taxCode) {
		super(name,lastName, taxCode);
	}
	
	protected Card getTypeCard() {
		return new EmployeeCard(this, 0.);
	}
	
}
