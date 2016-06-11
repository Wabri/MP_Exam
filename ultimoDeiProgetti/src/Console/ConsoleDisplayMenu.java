package Console;

public class ConsoleDisplayMenu extends ConsoleGeneric{

	public static int displayMainMenu() {
		System.out.println("Benvenuto!");
		System.out.println("1 - Visualizza la lista delle agenzie");
		System.out.println("2 - Crea una nuova agenzia");
		System.out.println("3 - Esci");
		return getInt();
	}

	public static int displayLogin() {
		System.out.println("Chi sei?");
		System.out.println("1 - Dipendente");
		System.out.println("2 - Cliente");
		System.out.println("3 - Indietro");
		System.out.println("4 - Esci");
		return getInt();
	}

	public static int emploHierachy() {
		System.out.println("Che tipo di dipendente sei?");
		System.out.println("1 - Autista/Hostess");
		System.out.println("2 - Manager");
		return getInt();
	}

	public static int displayForCustom(String nameAgency) {
		System.out.println("|-----------------------------------------------------------|");
		System.out.println("|		Agenzia Viaggi " + nameAgency + "		|");
		System.out.println("|	-------------------------------------------------	|");
		System.out.println("|	7 - Aggiungi un viaggio					|");
		System.out.println("|	8 - Visualizza la lista dei pacchetti di viaggio	|");
		System.out.println("|-----------------------------------------------------------|");
		return getInt();
	}

	public static int displayForEmplo(String nameAgency) {
		System.out.println("|-----------------------------------------------------------|");
		System.out.println("|		Agenzia Viaggi " + nameAgency + "		|");
		System.out.println("|	-------------------------------------------------	|");
		System.out.println("|	2 - Visualizza la lista delle persone   		|");
		System.out.println("|	4 - Visualizza la lista dei veicoli			|");
		System.out.println("|	8 - Visualizza la lista dei pacchetti di viaggio	|");
		System.out.println("|-----------------------------------------------------------|");
		return getInt();
	}

	public static int displayForManager(String nameAgency) {
		System.out.println("|-----------------------------------------------------------|");
		System.out.println("|		Agenzia Viaggi " + nameAgency + "		|");
		System.out.println("|	-------------------------------------------------	|");
		System.out.println("| 	1 - Aggiungi una persona				|");
		System.out.println("|	2 - Visualizza la lista delle persone   		|");
		System.out.println("|	-------------------------------------------------  	|");
		System.out.println("| 	3 - Aggiungi un veicolo					|");
		System.out.println("|	4 - Visualizza la lista dei veicoli			|");
		System.out.println("|	-------------------------------------------------	|");
		System.out.println("| 	5 - Aggiungi una località 				|");
		System.out.println("|	6 - Visualizza la lista delle località			|");
		System.out.println("|	-------------------------------------------------	|");
		System.out.println("|	7 - Aggiungi un viaggio					|");
		System.out.println("|	8 - Visualizza la lista dei pacchetti di viaggio	|");
		System.out.println("|	-------------------------------------------------	|");
		System.out.println("|	9 - Esci dal programma	 				|");
		System.out.println("|-----------------------------------------------------------|");
		return getInt();
	}
	
}
