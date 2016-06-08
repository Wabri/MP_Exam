package Console;

import java.util.Scanner;

import frameworkAgency.GeneralPerson;
import packAgency.Custom;
import packAgency.Driver;
import packAgency.Employee;
import packAgency.Hostess;
import packAgency.Manager;

public class ConsoleNewPersonOfAgency {

	public static GeneralPerson getPerson() {
		Scanner typePersonIO = new Scanner(System.in);
		getMenuOfTypePerson();
		int resp = typePersonIO.nextInt();
		typePersonIO.close();
		return getAction(resp);
	}

	private static GeneralPerson getAction(int resp) {
		switch (resp) {
		case 1:
			return getMenuForCustom();
		case 2:
			return getMenuForHostess();
		case 3:	
			return getMenuForDriver();
		case 4:
			return getMenuForManager();
		default:
			System.out.println("non sei nessuno");
			getMenuOfTypePerson();
			return null;
		}
	}

	private static GeneralPerson getMenuForManager() {
			Employee nuovoDipendente = new Manager(getKeyboardName(), getKeyboardLastName(), getKeyboardCF());
			System.out.println(nuovoDipendente.toString());
			return nuovoDipendente;
	}
	
	private static GeneralPerson getMenuForHostess() {
		Employee nuovoDipendente = new Hostess(getKeyboardName(), getKeyboardLastName(), getKeyboardCF());
		System.out.println(nuovoDipendente.toString());
		return nuovoDipendente;
	}

	private static GeneralPerson getMenuForDriver() {
		Employee nuovoDipendente = new Driver(getKeyboardName(), getKeyboardLastName(), getKeyboardCF());
		System.out.println(nuovoDipendente.toString());
		return nuovoDipendente;
	}

	private static GeneralPerson getMenuForCustom() {
		Custom nuovoCliente = new Custom(getKeyboardName(), getKeyboardLastName(), getKeyboardCF());
		System.out.println(nuovoCliente.toString());
		return nuovoCliente;
	}
	
	private static char[] getKeyboardCF() {
		System.out.println("Inserisci il tuo codFisc:");
		String tmpTC = getString();
		System.out.println("il tuo codFisc è: " + tmpTC);
		return tmpTC.toCharArray();
	}

	private static String getKeyboardName() {
		System.out.println("Inserisci il tuo nome:");
		String name = getString();
		System.out.println("il tuo nome è: " + name);
		return name;
	}
	
	private static String getKeyboardLastName() {
		System.out.println("Inserisci il tuo cognome:");
		String lastName = getString();
		System.out.println("il tuo cognome è: " + lastName);
		return lastName;
	}

	private static String getString() {
		Scanner keyboard = new Scanner(System.in);
		return keyboard.nextLine();
	}

	private static void getMenuOfTypePerson() {
		System.out.println("che tipo di Persone nell'agenzia sei?");
		System.out.println("1 - Cliente");
		System.out.println("2 - Hostess");
		System.out.println("3 - Driver");
		System.out.println("4 - Manager");
	}

}
