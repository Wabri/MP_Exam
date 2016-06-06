package packAgency;

public class Custom extends Person {

	public Custom(String name, String lastName, double discount) {
		super(name, lastName);
		this.getCard().setCardDiscount(discount);
	}

	public Custom(String name, String lastName) {
		super(name,lastName);
	}

	@Override
	protected String addThing() {
		return "Custom";
	}

	protected Card getTypeCard() {
		return new CustomCard(this, 0.);
	}

}
