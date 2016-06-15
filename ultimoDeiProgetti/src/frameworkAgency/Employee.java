package frameworkAgency;

public abstract class Employee extends PersonAgency {

	public Employee(String name, String lastName, char[] taxCode) {
		super(name, lastName, taxCode);		
	}
	
	public Employee(String name, String lastName, char[] taxCode, String userName) {
		super(name, lastName, taxCode, userName);
	}
	
	public Employee (String name, String lastName, char[] taxCode, String userName, String password) {
		super(name,lastName,taxCode,userName, password);
	}

	protected GeneralCard getNewCard() {
		return new EmployeeCard(this, 0.);
	}

	public boolean isEmployee() {
		return true;
	}

}
