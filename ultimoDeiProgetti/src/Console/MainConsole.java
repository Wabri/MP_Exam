package Console;

import java.util.InputMismatchException;
import java.util.Scanner;

import packAgency.Agency;

public class MainConsole {

	static Agency newAgency;

	public static void main(String args[]) {
		displayMainMenu();
		Scanner agencyIO = new Scanner(System.in);
		int resp = agencyIO.nextInt();
		getMainAction(resp);
		displayLogin();
		resp = agencyIO.nextInt();
		while (resp != 9) {
			displayLogin();
			resp = agencyIO.nextInt();
			getSubAction(resp);
		}
		agencyIO.close();
	}

	private static void getMainAction(int resp) {
		switch (resp) {
		case 1:
			newAgency = ConsoleNewAgency.getAgency();
			break;
		case 2:
			System.out.println("Ciao!");
			System.exit(1);
			break;
		default:
			System.out.println("Non va bene, scegli di nuovo");
		}
	}

	private static void getLogin(int resp) {
		switch (resp) {
		case 1:
			emploHierachy();
			int resp2 = getInt();
			displayHierachy(resp2);
		case 2:
			displayForCustom();
			break;
		case 3:
			displayMainMenu();
			break;
		case 4:
			System.out.println("Ciao!");
			System.exit(1);
			break;
		default:
			System.out.println("Errore di I/O");
			break;
		}

	}

	private static void displayHierachy(int resp) {
			switch (resp) {
			case 1:
				displayForEmplo();
				break;
			case 2:
				displaySubMenu();
				break;
			default:
				System.out.println("Errore di I/O"); 
				break;
		}
	}	
	private static int getInt() {
		Scanner keyboard = new Scanner(System.in);
		return keyboard.nextInt();
	}

	private static void displayLogin() {
		System.out.println("Chi sei?");
		System.out.println("1 - Dipendente");
		System.out.println("2 - Cliente");
		System.out.println("3 - Indietro");
		System.out.println("4 - Esci");
	}

	private static void emploHierachy() {
		System.out.println("Che tipo di dipendente sei?");
		System.out.println("1 - Autista/Hostess");
		System.out.println("2 - Manager");
	}

	private static void displayMainMenu() {
		System.out.println("Benvenuto!");
		System.out.println("1 - Crea la tua Agenzia Viaggi");
		System.out.println("2 - Esci dal programma");
	}

	private static void displayForCustom() {
		System.out.println("|-----------------------------------------------------------|");
		System.out.println("|		Agenzia Viaggi " + newAgency.getName() + "		|");
		System.out.println("|	-------------------------------------------------	|");
		System.out.println("|	7 - Aggiungi un viaggio					|");
		System.out.println("|	8 - Visualizza la lista dei pacchetti di viaggio	|");
		System.out.println("|-----------------------------------------------------------|");
	}

	private static void displayForEmplo() {
		System.out.println("|-----------------------------------------------------------|");
		System.out.println("|		Agenzia Viaggi " + newAgency.getName() + "		|");
		System.out.println("|	-------------------------------------------------	|");
		System.out.println("|	2 - Visualizza la lista delle persone   		|");
		System.out.println("|	4 - Visualizza la lista dei veicoli			|");
		System.out.println("|	8 - Visualizza la lista dei pacchetti di viaggio	|");
		System.out.println("|-----------------------------------------------------------|");
	}

	private static void displaySubMenu() {
			System.out.println("|-----------------------------------------------------------|");
			System.out.println("|		Agenzia Viaggi "+newAgency.getName()+"		|");
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
	}
	private static void getSubAction(int resp) {
		switch (resp) {
		case 1:
			ConsoleNewPerson.getPerson(newAgency);
			break;
		case 2:
			ConsoleNewPerson.getPersonInfo(newAgency);
			break;
		case 3:
			ConsoleNewVehicle.getVehicle(newAgency);
			break;
		case 4:
//			ConsoleNewVehice.getVehicleInfo(newAgency);
			break;
		case 5:
			ConsoleNewPlace.getPlace(newAgency);
			break;
		case 6:
//			ConsoleNewPlace.getPlaceInfo(newAgency);
			break;
		case 7:
//			ConsoleNewTravel.getTravelInfo(newAgency);
			break;
		case 8:
			ConsoleNewTravel.getTravel(newAgency);
			break;
		case 9:
			System.out.println("Ciao!");
			System.exit(1);
			break;
		default:
			System.out.println("Errore di I/O");
			break;
		}
	}

}