package Console;

import packAgency.DataAgency;
import packAgency.Place;

public class ConsoleNewPlace extends ConsoleGeneric {

	public static void getPlace(DataAgency toAgency) {
		System.out.println("inserisci il nome della localit�: ");
		String newPlace = getString();
		System.out.println("il nome della localit� inserita �: " + newPlace);
		toAgency.add(new Place(newPlace));
	}

}
