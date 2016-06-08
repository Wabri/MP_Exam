package Console;

import packAgency.Agency;
import packAgency.Product;

public class ConsoleNewProduct extends ConsoleGeneric {
	
	public static void getProduct(Agency toAgency) {
		System.out.println("inserisci il nome del prodotto: ");
		String name = getString();
		System.out.println("Il nome del prodotto è: " + name);
		System.out.println("inserisci il prezzo del prodotto: ");
		int amount = ConsoleGeneric.getInt();
		System.out.println("il prezzo del prodotto è: " + amount);
		toAgency.add(new Product(name, amount));
	}
	
}
