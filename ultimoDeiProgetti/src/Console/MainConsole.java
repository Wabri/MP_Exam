package Console;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import packAgency.Agency;

public class MainConsole {

	static Agency newAgency;

	public static void main(String args[]) throws IOException {
		getMainAction(ConsoleDisplayMenu.displayMainMenu());
	}

	private static void getMainAction(int resp) {
		switch (resp) {
		case 1:
			readFile();
			break;
		case 2:
			printNewAgency();
			break;
		default:
			System.out.println("Non va bene, scegli di nuovo");
		}
	}

	private static void printNewAgency() {
		try {
			Scanner name = new Scanner(System.in);
			String newAgencyName;
			System.out.println("Inserisci il nome della nuova agenzia");
			newAgencyName = name.nextLine();
			BufferedWriter out = new BufferedWriter(new FileWriter("C:/Users/Gabriele/Desktop/ciao.txt"));
			out.write(newAgencyName);
			out.close();
			newAgency = new Agency(newAgencyName);
		} catch (IOException e) {
			System.out.print("percorso file sbagliato");
		}
	}

	private static void readFile() {
		try {
			FileReader f = new FileReader("C:/Users/Gabriele/Desktop/ciao.txt");
			BufferedReader bufferReader = new BufferedReader(f);
			String tmpString;
			while (true) {
				tmpString = bufferReader.readLine();
				if (!(tmpString == null)) {
					System.out.println(tmpString);
				} else {
					break;
				}
			}
		} catch (IOException e) {
			System.out.println("no file");
		}
	}

	private static void getLogin(int resp) {
		switch (resp) {
		case 1:
			displayHierachy(ConsoleDisplayMenu.emploHierachy());
		case 2:
			ConsoleDisplayMenu.displayForCustom(newAgency.getName());
			break;
		case 3:
			ConsoleDisplayMenu.displayMainMenu();
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
			ConsoleDisplayMenu.displayForEmplo(newAgency.getName());
			break;
		case 2:
			ConsoleDisplayMenu.displayForManager(newAgency.getName());
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

	private static void getSubAction(int resp) {
		switch (resp) {
		case 1:
			ConsoleNewPerson.getPerson(newAgency.getDataAgency());
			break;
		case 2:
			ConsoleNewPerson.getPersonInfo(newAgency.getDataAgency());
			break;
		case 3:
			ConsoleNewVehicle.getVehicle(newAgency.getDataAgency());
			break;
		case 4:
			// ConsoleNewVehice.getVehicleInfo(newAgency);
			break;
		case 5:
			ConsoleNewPlace.getPlace(newAgency.getDataAgency());
			break;
		case 6:
			// ConsoleNewPlace.getPlaceInfo(newAgency);
			break;
		case 7:
			// ConsoleNewTravel.getTravelInfo(newAgency);
			break;
		case 8:
			ConsoleNewTravel.getTravel(newAgency.getDataAgency());
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