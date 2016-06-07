package packAgency;

public class Custom extends Person {

	public Custom(String name, String lastName, double discount, char[] taxCode) {
		super(name, lastName, taxCode);
		this.getCard().setCardDiscount(discount);

	}

	public Custom(String name, String lastName, char[] taxCode) {
		super(name, lastName, taxCode);
	}

	@Override
	protected String addThing() {
		return "Custom";
	}

	protected Card getTypeCard() {
		return new CustomCard(this, 0.);
	}

}
