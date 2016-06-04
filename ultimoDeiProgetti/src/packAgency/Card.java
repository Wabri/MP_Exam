package packAgency;

public abstract class Card {

	private Person accountholder;
	private double discount;

	public Card (Person accountholder, double discount) {
		this.setAccountholder(accountholder);
		this.setCardDiscount(discount);
	}
	
	private void setAccountholder(Person accountholder) {
		this.accountholder = accountholder;
	}

	public void setCardDiscount(double discount) {
		this.discount = discount;
	}

	public Person getAccountholder() {
		return accountholder;
	}

	public double getDiscount() {
		return discount;
	}


}
