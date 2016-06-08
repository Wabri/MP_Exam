package packTest;

import java.util.Scanner;
import packAgency.Custom;
import packAgency.Driver;
import packAgency.Employee;
import packAgency.Hostess;
import packAgency.Manager;

public class Console {

	public static void main(String[] args) {
		Scanner typePersonIO = new Scanner(System.in);
		getMenuOfTypePerson();
		int resp = typePersonIO.nextInt();
		getAction(resp);
		typePersonIO.close();
	}

	private static void getAction(int resp) {
		switch (resp) {
		case 1:
			getMenuForCustom();
			break;
		case 2:
			getMenuForHostess();
			break;
		case 3:	
			getMenuForDriver();
			break;
		case 4:
			getMenuForManager();
			break;
		default:
			System.out.println("non sei nessuno");
			getMenuOfTypePerson();
		}
	}

	private static void getMenuForManager() {
			Employee nuovoDipendente = new Manager(getKeyboardName(), getKeyboardLastName(), getKeyboardCF());
			System.out.println(nuovoDipendente.toString());
	}
	
	private static void getMenuForHostess() {
		Employee nuovoDipendente = new Hostess(getKeyboardName(), getKeyboardLastName(), getKeyboardCF());
		System.out.println(nuovoDipendente.toString());
	}

	private static void getMenuForDriver() {
		Employee nuovoDipendente = new Driver(getKeyboardName(), getKeyboardLastName(), getKeyboardCF());
		System.out.println(nuovoDipendente.toString());
	}

	private static void getMenuForCustom() {
		Custom nuovoCliente = new Custom(getKeyboardName(), getKeyboardLastName(), getKeyboardCF());
		System.out.println(nuovoCliente.toString());	
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
		System.out.println("che credenziali d'accesso hai?");
		System.out.println("1 - Cliente");
		System.out.println("2 - Hostess");
		System.out.println("3 - Driver");
		System.out.println("4 - Manager");
	}

}
