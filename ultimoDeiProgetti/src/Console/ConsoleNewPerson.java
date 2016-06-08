package Console;

import java.util.Scanner;

import frameworkAgency.GeneralPerson;
import packAgency.Agency;
import packAgency.Custom;
import packAgency.Driver;
import packAgency.Employee;
import packAgency.Hostess;
import packAgency.Manager;

public class ConsoleNewPerson extends ConsoleGeneric {

	public static void getPerson(Agency toAgency) {
		Scanner typePersonIO = new Scanner(System.in);
		getMenuOfTypePerson();
		int resp = typePersonIO.nextInt();
		getAction(resp, toAgency);
	}

	private static void getAction(int resp, Agency toAgency) {
		switch (resp) {
		case 1:
			toAgency.add(getMenuForCustom());
		case 2:
			toAgency.add(getMenuForHostess());
		case 3:	
			toAgency.add(getMenuForDriver());
		case 4:
			toAgency.add(getMenuForManager());
		default:
			System.out.println("non sei nessuno");
			getMenuOfTypePerson();
			break;
		}
	}

	private static Manager getMenuForManager() {
			Manager nuovoDipendente = new Manager(getKeyboardName(), getKeyboardLastName(), getKeyboardCF());
			System.out.println(nuovoDipendente.toString());
			return nuovoDipendente;
	}
	
	private static Hostess getMenuForHostess() {
		Hostess nuovoDipendente = new Hostess(getKeyboardName(), getKeyboardLastName(), getKeyboardCF());
		System.out.println(nuovoDipendente.toString());
		return nuovoDipendente;
	}

	private static Driver getMenuForDriver() {
		Driver nuovoDipendente = new Driver(getKeyboardName(), getKeyboardLastName(), getKeyboardCF());
		System.out.println(nuovoDipendente.toString());
		return nuovoDipendente;
	}

	private static Custom getMenuForCustom() {
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

	private static void getMenuOfTypePerson() {
		System.out.println("Che tipo di Persona vuoi aggiungere?");
		System.out.println("1 - Cliente");
		System.out.println("2 - Hostess");
		System.out.println("3 - Driver");
		System.out.println("4 - Manager");
	}

}
