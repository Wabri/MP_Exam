package frameworkAgency;

public abstract class Card implements GeneralCard {

	private GeneralPerson accountholder;
	private double discount;

	public Card (GeneralPerson accountholder, double discount) {
		this.setAccountholder(accountholder);
		this.setCardDiscount(discount);
	}
	
	private void setAccountholder(GeneralPerson accountholder) {
		this.accountholder = accountholder;
	}

	@Override
	public void setCardDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public GeneralPerson getAccountholder() {
		return accountholder;
	}

	@Override
	public double getDiscount() {
		return discount;
	}


}
