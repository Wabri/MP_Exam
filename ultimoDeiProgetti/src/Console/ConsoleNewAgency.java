package Console;

import packAgency.TravelAgency;

public class ConsoleNewAgency extends ConsoleGeneric {

	public static TravelAgency getAgency() {
		System.out.println("inserisci il nome dell'azienda");
		String name = getString();
		return new TravelAgency(name);
	}
	
}
