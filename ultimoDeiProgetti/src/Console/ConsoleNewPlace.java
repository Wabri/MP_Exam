package Console;

import packAgency.Agency;
import packAgency.Place;

public class ConsoleNewPlace extends ConsoleGeneric {

	public static void getPlace(Agency toAgency) {
		System.out.println("inserisci il nome della località : ");
		String newPlace = getString();
		System.out.println("il nome della località  inserita è: " + newPlace);
		toAgency.add(new Place(newPlace));
	}

}
