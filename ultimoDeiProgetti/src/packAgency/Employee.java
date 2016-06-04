package packAgency;

public abstract class Employee extends Person{
	
	public Employee(String name, String lastName) {
		super(name,lastName);
	}
	
	protected Card getTypeCard() {
		return new EmployeeCard(this, 50.);
	}
	
}
