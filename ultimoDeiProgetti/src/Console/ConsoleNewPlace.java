package Console;

import packAgency.Agency;
import packAgency.Place;

public class ConsoleNewPlace extends ConsoleGeneric {

	public static void getPlace(Agency toAgency) {
		System.out.println("inserisci il nome della localit�: ");
		String newPlace = getString();
		System.out.println("il nome della localit� inserita �: " + newPlace);
		toAgency.add(new Place(newPlace));
	}

}
