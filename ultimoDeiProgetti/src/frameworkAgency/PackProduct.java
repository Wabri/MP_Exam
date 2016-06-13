package frameworkAgency;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class PackProduct extends GeneralProduct {

	private Collection<GeneralProduct> listOfProduct;

	public PackProduct(String nameProduct) {
		super(nameProduct);
		this.listOfProduct = new LinkedList<GeneralProduct>();
	}

	public PackProduct(String nameProduct, Collection<GeneralProduct> listOfProduct) {
		super(nameProduct);
		this.listOfProduct = listOfProduct;
	}

	public double getAmount() {
		try {
			Iterator<GeneralProduct> iteratorProduct = listOfProduct.iterator();
			GeneralProduct tmpProduct;
			double tot = 0;
			while (iteratorProduct.hasNext()) {
				tmpProduct = iteratorProduct.next();
				tot += tmpProduct.getAmount();
			}
			return tot;
		} catch (Exception e) {
			return 0;
		}
	}

	public boolean add(GeneralProduct newProduct) {
		try {
			this.listOfProduct.add(newProduct);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean remove(GeneralProduct oldProduct) {
		try {
			if (this.listOfProduct.contains(oldProduct)) {
				listOfProduct.remove(oldProduct);
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

}
