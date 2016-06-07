package packAgency;

public abstract class Person {

	private String name;
	private String lastName;
	private Card card;
	private char[] taxCode = new char[16];

	public Person(String name, String lastName, char[] taxCode) {
		this.setLastName(lastName);
		this.setName(name);
		this.setTaxCode(taxCode);
		this.setCard(this.getTypeCard());
	}
	
	protected abstract Card getTypeCard();
	
	private void setCard(Card card) {
		this.card = card;
	}

	public Card getCard() {
		return card;
	}

	private void setName(String name) {
		this.name = name;
	}

	private void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}
	
	private void setTaxCode(char[] taxCode) {
		this.taxCode = taxCode;
	}

	public char[] getTaxCode() {
		return taxCode;
	}

	public String toString() {
		return this.name+this.lastName+this.addThing();
		
	}

	protected abstract String addThing();

}