package frameworkAgency;

public abstract class Employee extends PersonAgency{
	
	public Employee(String name, String lastName, char[] taxCode, String userName) {
		super(name,lastName, taxCode, userName);
	}
	
	protected GeneralCard getTypeCard() {
		return new EmployeeCard(this, 0.);
	}

	public boolean isEmployee() {
		return true;
	}
	
}
