package packAgency;

import frameworkAgency.GeneralCard;
import frameworkAgency.GeneralPerson;

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

	/* (non-Javadoc)
	 * @see packAgency.GeneralCard#setCardDiscount(double)
	 */
	@Override
	public void setCardDiscount(double discount) {
		this.discount = discount;
	}

	/* (non-Javadoc)
	 * @see packAgency.GeneralCard#getAccountholder()
	 */
	@Override
	public GeneralPerson getAccountholder() {
		return accountholder;
	}

	/* (non-Javadoc)
	 * @see packAgency.GeneralCard#getDiscount()
	 */
	@Override
	public double getDiscount() {
		return discount;
	}


}
