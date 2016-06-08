package packAgency;

import frameWorkAgency.GeneralCard;
import frameWorkAgency.GeneralPerson;

public abstract class PersonAgency implements GeneralPerson {

	private String name;
	private String lastName;
	private GeneralCard card;
	private char[] taxCode = new char[16];

	public PersonAgency(String name, String lastName, char[] taxCode) {
		this.setLastName(lastName);
		this.setName(name);
		this.setTaxCode(taxCode);
		this.setCard(this.getTypeCard());
	}
	
	protected abstract GeneralCard getTypeCard();
	
	private void setCard(GeneralCard card) {
		this.card = card;
	}

	public GeneralCard getCard() {
		return card;
	}

	private void setName(String name) {
		this.name = name;
	}

	private void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/* (non-Javadoc)
	 * @see packAgency.GeneralPerson#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see packAgency.GeneralPerson#getLastName()
	 */
	@Override
	public String getLastName() {
		return lastName;
	}
	
	private void setTaxCode(char[] taxCode) {
		this.taxCode = taxCode;
	}

	/* (non-Javadoc)
	 * @see packAgency.GeneralPerson#getTaxCode()
	 */
	@Override
	public char[] getTaxCode() {
		return taxCode;
	}

	/* (non-Javadoc)
	 * @see packAgency.GeneralPerson#toString()
	 */
	@Override
	public String toString() {
		return this.name+this.lastName+this.addThing();
		
	}

	protected abstract String addThing();

}