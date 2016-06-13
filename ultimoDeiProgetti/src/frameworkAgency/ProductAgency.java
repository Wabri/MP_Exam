package frameworkAgency;

public class ProductAgency extends GeneralProduct {

	private double amount;

	public ProductAgency(String nameProduct, double amount) {
		super(nameProduct);
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}

	public boolean add(GeneralProduct newProduct) {
		return false;
	}

	public boolean remove(GeneralProduct oldProduct) {
		return false;
	}

}
