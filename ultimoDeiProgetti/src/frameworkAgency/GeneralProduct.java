package frameworkAgency;

public abstract class GeneralProduct {

	private String nameProduct;

	public GeneralProduct(String nameProduct) {
		this.setNameProduct(nameProduct);
	}

	private void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	@Override
	public String toString() {
		return this.getNameProduct() + " " + this.getAmount();
	}

	public double getPriceWithCard(GeneralCard card) {
		try {
			return getAmount() - getAmount() * card.getDiscount();
		} catch (Exception e) {
			return 0;
		}
	}

	public abstract double getAmount();

	public abstract boolean add(GeneralProduct newProduct);

	public abstract boolean remove(GeneralProduct oldProduct);

}