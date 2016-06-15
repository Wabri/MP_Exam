package packAgency;

import frameworkAgency.CardAgency;
import frameworkAgency.GeneralPerson;

public class CustomCard extends CardAgency {
	
	public CustomCard(GeneralPerson accountHolder, Double discount) {
		super(accountHolder, discount);
	}

	public CustomCard(GeneralPerson accountHolder) {
		super(accountHolder);
	}
}
