package Console;

import packAgency.Agency;

public class ConsoleNewAgency extends ConsoleGeneric {

	public static Agency getAgency() {
		System.out.println("inserisci il nome dell'azienda");
		String name = getString();
		return new Agency(name);
	}
	
}
