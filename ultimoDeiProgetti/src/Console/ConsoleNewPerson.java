package Console;

import java.util.Scanner;

import frameworkAgency.Employee;
import frameworkAgency.GeneralPerson;
import packAgency.TravelAgency;
import packAgency.Custom;
import packAgency.DataAgency;
import packAgency.Driver;
import packAgency.Hostess;
import packAgency.Manager;

public class ConsoleNewPerson extends ConsoleGeneric {

	public static void getPerson(DataAgency toAgency) {
		Scanner typePersonIO = new Scanner(System.in);
		getMenuOfTypePerson();
		int resp = typePersonIO.nextInt();
		getAction(resp, toAgency);
	}

	public static void getPersonInfo(DataAgency toAgency) {
		Scanner typePersonIO = new Scanner(System.in);
		getInfoMenu();
		int resp = typePersonIO.nextInt();
		getActionInfo(resp,toAgency);
	}
	
	private static void getAction(int resp, DataAgency toAgency) {
		switch (resp) {
		case 1:
			toAgency.add(getMenuForCustom());
			break;
		case 2:
			toAgency.add(getMenuForHostess());
			break;
		case 3:	
			toAgency.add(getMenuForDriver());
			break;
		case 4:
			toAgency.add(getMenuForManager());
			break;
		default:
			System.out.println("Errore di I/O");
			break;
		}
	}
	

	private static void getActionInfo(int resp, DataAgency toAgency) {
		switch (resp) {
		case 1:
			System.out.println(toAgency.getListOfCustom());
			break;
		case 2:
			System.out.println(toAgency.getListOfEmployees());
			break;
		default:
			System.out.println("Errore di I/O");
			break;
		}
	}

	private static Manager getMenuForManager() {
			Manager nuovoDipendente = new Manager(getKeyboardName(), getKeyboardLastName(), getKeyboardCF(), null);
			System.out.println(nuovoDipendente.toString());
			return nuovoDipendente;
	}
	
	private static Hostess getMenuForHostess() {
		Hostess nuovoDipendente = new Hostess(getKeyboardName(), getKeyboardLastName(), getKeyboardCF(), null);
		System.out.println(nuovoDipendente.toString());
		return nuovoDipendente;
	}

	private static Driver getMenuForDriver() {
		Driver nuovoDipendente = new Driver(getKeyboardName(), getKeyboardLastName(), getKeyboardCF(), null);
		System.out.println(nuovoDipendente.toString());
		return nuovoDipendente;
	}

	private static Custom getMenuForCustom() {
		Custom nuovoCliente = new Custom(getKeyboardName(), getKeyboardLastName(), getKeyboardCF(), null);
		System.out.println(nuovoCliente.toString());
		return nuovoCliente;
	}
	
	private static char[] getKeyboardCF() {
		System.out.println("Inserisci il tuo codFisc:");
		String tmpTC = getString();
		return tmpTC.toCharArray();
	}

	private static String getKeyboardName() {
		System.out.println("Inserisci il tuo nome:");
		String name = getString();
		return name;
	}
	
	private static String getKeyboardLastName() {
		System.out.println("Inserisci il tuo cognome:");
		String lastName = getString();
		return lastName;
	}

	private static void getMenuOfTypePerson() {
		System.out.println("Che tipo di persona vuoi aggiungere?");
		System.out.println("1 - Cliente");
		System.out.println("2 - Hostess");
		System.out.println("3 - Driver");
		System.out.println("4 - Manager");
	}
	private static void getInfoMenu() {
		System.out.println("Che lista di persone vuoi visualizzare?");
		System.out.println("1 - Clienti");
		System.out.println("2 - Dipendenti");
	}

}