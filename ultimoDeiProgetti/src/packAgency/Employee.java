package packAgency;

import frameworkAgency.GeneralCard;

public abstract class Employee extends PersonAgency{
	
	public Employee(String name, String lastName, char[] taxCode, String userName) {
		super(name,lastName, taxCode, userName);
	}
	
	protected GeneralCard getTypeCard() {
		return new EmployeeCard(this, 0.);
	}
	
}
