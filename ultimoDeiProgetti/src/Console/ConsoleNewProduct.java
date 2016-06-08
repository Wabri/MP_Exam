package Console;

import packAgency.Product;

public class ConsoleNewProduct extends ConsoleGeneric {
	
	public static Product getProduct() {
		System.out.println("inserisci il nome del prodotto: ");
		String name = getString();
		System.out.println("Il nome del prodotto �: " + name);
		System.out.println("inserisci il prezzo del prodotto: ");
		int amount = ConsoleGeneric.getInt();
		System.out.println("il prezzo del prodotto �: " + amount);
		return new Product(name, amount);
	}
	
}
