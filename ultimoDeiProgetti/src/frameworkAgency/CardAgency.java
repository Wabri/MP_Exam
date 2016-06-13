package frameworkAgency;

public abstract class CardAgency implements GeneralCard {

	private GeneralPerson accountholder;
	private double discount;

	public CardAgency (GeneralPerson accountHolder) {
		this.setAccountholder(accountHolder);
		this.setDiscount(0);
	}
	
	public CardAgency (GeneralPerson accountHolder, double discount) {
		this.setAccountholder(accountHolder);
		this.setDiscount(discount);
	}
	
	private void setAccountholder(GeneralPerson accountholder) {
		this.accountholder = accountholder;
	}

	@Override
	public void setDiscount(double discount) {
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
