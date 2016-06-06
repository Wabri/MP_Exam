package packAgency;

public class Product {

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

	public String getNameProduct() {
		return nameProduct;
	}

	public double getAmount() {
		return amount;
	}
	
	public String toString() {
		return this.getNameProduct()+" "+this.getAmount();
	}

	public double getPriceWithCard(Card card) {
		return (this.getAmount()-this.getAmount()*card.getDiscount());
	}

}
