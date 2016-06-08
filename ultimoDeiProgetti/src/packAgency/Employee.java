package packAgency;

import frameWorkAgency.GeneralCard;

public abstract class Employee extends PersonAgency{
	
	public Employee(String name, String lastName, char[] taxCode) {
		super(name,lastName, taxCode);
	}
	
	protected GeneralCard getTypeCard() {
		return new EmployeeCard(this, 0.);
	}
	
}
