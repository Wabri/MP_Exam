package packAgency;

import frameworkAgency.GeneralCard;
import frameworkAgency.GeneralProduct;

public class Product implements GeneralProduct {

	private String nameProduct;
	private double amount;

	public Product(String nameProduct, double amount) {
		this.setNameProduct(nameProduct);
		this.setAmount(amount);
	}

	private void setAmount(double amount) {
		this.amount = amount;		
	}

	private void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	/* (non-Javadoc)
	 * @see packAgency.GeneralProduct#getNameProduct()
	 */
	@Override
	public String getNameProduct() {
		return nameProduct;
	}

	/* (non-Javadoc)
	 * @see packAgency.GeneralProduct#getAmount()
	 */
	@Override
	public double getAmount() {
		return amount;
	}
	
	/* (non-Javadoc)
	 * @see packAgency.GeneralProduct#toString()
	 */
	@Override
	public String toString() {
		return this.getNameProduct()+" "+this.getAmount();
	}

	/* (non-Javadoc)
	 * @see packAgency.GeneralProduct#getPriceWithCard(frameWorkAgency.GeneralCard)
	 */
	@Override
	public double getPriceWithCard(GeneralCard card) {
		return (this.getAmount()-this.getAmount()*card.getDiscount());
	}

}
