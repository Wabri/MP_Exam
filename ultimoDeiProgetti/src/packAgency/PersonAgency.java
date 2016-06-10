package packAgency;

import frameworkAgency.GeneralCard;
import frameworkAgency.GeneralPerson;

public abstract class PersonAgency implements GeneralPerson {

	private String name;
	private String lastName;
	private GeneralCard card;
	private char[] taxCode = new char[16];
	private String userName;
	private String password;

	public PersonAgency(String name, String lastName, char[] taxCode, String userName) {
		this.setLastName(lastName);
		this.setName(name);
		this.setTaxCode(taxCode);
		this.setUserName(userName);
		this.setPassword(userName+Math.random());
		this.setCard(this.getTypeCard());
	}
	
	public abstract void accept(VisitorPersonAgency personVisitor);
	
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

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getLastName() {
		return lastName;
	}
	
	private void setTaxCode(char[] taxCode) {
		this.taxCode = taxCode;
	}

	@Override
	public char[] getTaxCode() {
		return taxCode;
	}

	@Override
	public String toString() {
		return "Nome : "+this.getName()+"\nCognome : "+this.getLastName()+"\nCodice Fiscale : "+String.valueOf(getTaxCode())+"\n-----\n";
		
	}

	private void setUserName(String userName) {
		this.userName = userName;
	}

	private void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	protected abstract String addThing();

}