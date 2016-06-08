package Console;

import packAgency.Agency;

public class ConsoleNewAgency extends ConsoleGeneric {

	public static Agency getAgency() {
		System.out.println("inserisci il nome dell'azienda");
		String name = getString();
		System.out.println("Il nome dell'agenzia è: " + name);
		return new Agency(name);
	}
	
}
