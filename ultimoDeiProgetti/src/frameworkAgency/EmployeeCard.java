package frameworkAgency;

public class EmployeeCard extends CardAgency {

	public EmployeeCard (Employee accountHolder) {
		super(accountHolder);
	}
	
	public EmployeeCard(Employee accountHolder, Double discount) {
		super(accountHolder, discount);
	}

}
