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

	@Override
	public String getNameProduct() {
		return nameProduct;
	}

	@Override
	public double getAmount() {
		return amount;
	}
	
	@Override
	public String toString() {
		return this.getNameProduct()+" "+this.getAmount();
	}

	@Override
	public double getPriceWithCard(GeneralCard card) {
		return (this.getAmount()-this.getAmount()*card.getDiscount());
	}

}
