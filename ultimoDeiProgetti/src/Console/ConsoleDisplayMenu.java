package Console;

public class ConsoleDisplayMenu extends ConsoleGeneric{

	public static int displayMainMenu() {
		System.out.println("|-------------------------------------------------------|");
		System.out.println("|	Benvenuti					|");
		System.out.println("|-------------------------------------------------------|");
		System.out.println("|	1 - Carica agenzia			   	|");
		System.out.println("|	2 - Crea una nuova agenzia 			|");
		System.out.println("|	3 - Esci		                        |");
		System.out.println("|-------------------------------------------------------|");
		return getInt();
	}

	public static int displayLogin(String nameAgency) {
		System.out.println("|-------------------------------------------------------|");
		System.out.println("|		Agenzia Viaggi " + nameAgency + "		|");
		System.out.println("|-------------------------------------------------------|");
		System.out.println("|	1 - Login			  	 	|");
		System.out.println("|	2 - Nuovo User			  	 	|");
		System.out.println("|	3 - Esci					|");
		System.out.println("|-------------------------------------------------------|");
		return getInt();
	}
	
	public static int emploHierachy(String nameAgency) {
		System.out.println("|-------------------------------------------------------|");
		System.out.println("|		Agenzia Viaggi " + nameAgency + "				|");
		System.out.println("|			che tipo di dipendente sei?					|");
		System.out.println("|-------------------------------------------------------|");
		System.out.println("|	1 - Autista/Hostess								   	|");
		System.out.println("|	2 - Manager											|");
		System.out.println("|-------------------------------------------------------|");
		return getInt();
	}

	public static int displayForCustom(String nameAgency) {
		System.out.println("|-------------------------------------------------------|");
		System.out.println("|		Agenzia Viaggi " + nameAgency + "				|");
		System.out.println("|-------------------------------------------------------|");
		System.out.println("|	1 - Prenota un viaggio								|");
		System.out.println("|	2 - Visualizza la lista delle tue prenotazioni   	|");
		System.out.println("|	3 - Visualizza la lista dei pacchetti di viaggio	|");
		System.out.println("|-------------------------------------------------------|");
		return getInt();
	}

	public static int displayForEmplo(String nameAgency) {
		System.out.println("|-------------------------------------------------------|");
		System.out.println("|		Agenzia Viaggi " + nameAgency + "		        |");
		System.out.println("|	-------------------------------------------------	|");
		System.out.println("|	1 - Visualizza la lista delle persone   			|");
		System.out.println("|	2 - Visualizza la lista dei veicoli					|");
		System.out.println("|	3 - Visualizza la lista dei pacchetti di viaggio	|");
		System.out.println("|-------------------------------------------------------|");
		return getInt();
	}

	public static int displayForManager(String nameAgency) {
		System.out.println("|----------------------------------------------------|");
		System.out.println("|		Agenzia Viaggi " + nameAgency + "		     |");
		System.out.println("|	-------------------------------------------------|");
		System.out.println("| 	1 - Aggiungi una persona				         |");
		System.out.println("| 	2 - Aggiungi una persona				         |");
		System.out.println("|	3 - Visualizza la lista delle persone   		 |");
		System.out.println("|	-------------------------------------------------|");
		System.out.println("| 	4 - Aggiungi un veicolo					         |");
		System.out.println("| 	5 - Aggiungi un veicolo					         |");
		System.out.println("|	6 - Visualizza la lista dei veicoli			     |");
		System.out.println("|	-------------------------------------------------|");
		System.out.println("| 	7 - Aggiungi una località 				         |");
		System.out.println("| 	8 - Rimuovi una località 				         |");
		System.out.println("|	9 - Visualizza la lista delle località		     |");
		System.out.println("|	-------------------------------------------------|");
		System.out.println("|	10 - Aggiungi un viaggio					     |");
		System.out.println("|	11 - Rimuovi un viaggio							 |");
		System.out.println("|	12 - Visualizza la lista dei pacchetti di viaggio|");
		System.out.println("|	-------------------------------------------------|");
		System.out.println("|	13 - Esci dal programma	 						 |");
		System.out.println("|----------------------------------------------------|");
		return getInt();
	}
	
}
