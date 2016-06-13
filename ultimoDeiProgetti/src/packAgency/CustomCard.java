package packAgency;

import frameworkAgency.CardAgency;
import frameworkAgency.GeneralPerson;

public class CustomCard extends CardAgency {
	
	public CustomCard(GeneralPerson accountholder, Double discount) {
		super(accountholder, discount);
	}

}
