package packAgency;

import frameworkAgency.GeneralCard;
import frameworkAgency.GeneralPerson;

public abstract class PersonAgency implements GeneralPerson {

	private String name;
	private String lastName;
	private GeneralCard card;
	private char[] taxCode = new char[16];
	private Credentials userCredentials;

	public PersonAgency(String name, String lastName, char[] taxCode, String userName) {
		this.setLastName(lastName);
		this.setName(name);
		this.setTaxCode(taxCode);
		this.userCredentials = new Credentials(userName,this.getName()+Math.random(), this);
		this.setCard(this.getTypeCard());
	}
	
	public PersonAgency(String name, String lastName, char[] taxCode, String userName, String password) {
		this.setLastName(lastName);
		this.setName(name);
		this.setTaxCode(taxCode);
		this.userCredentials = new Credentials(userName,password, this);
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
	
	private Credentials getUserCredentials() {
		return userCredentials;
	}

	@Override
	public String toString() {
		return "Nome : "+this.getName()+"\nCognome : "+this.getLastName()+"\nCodice Fiscale : "+String.valueOf(getTaxCode())+"\n-----\n";
		
	}
	
	protected abstract String addThing();

	public boolean isAdmin() {
		return false;
	}

	public boolean isEmployee() {
		return false;
	}
	
}