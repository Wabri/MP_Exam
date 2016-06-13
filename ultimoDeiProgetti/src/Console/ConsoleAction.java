package Console;
import java.io.*;
import frameworkAgency.GeneralAgency;
import frameworkAgency.GeneralPerson;
import packAgency.Credentials;
import packAgency.TravelAgency;

public class ConsoleAction extends ConsoleGeneric{
	
	public static GeneralAgency getAgency(int resp) {
		switch (resp) {
		case 1:
			System.out.println("non ancora implementata1");
			return null;
		case 2:
			System.out.println("|----- inserisci nuova agenzia ----------|");
			return new TravelAgency(getString());
		default:
			System.out.println("|----- Ciao! -----|");
			System.exit(1);
			return null;
		}
	}

	public static Credentials getUser(int resp) {
		switch (resp) {
		case 1:
			System.out.print("|----- UserName: ");
			String tmpUser = getString();
			System.out.print("|----- Password: ");
			String tmpPassword = getString();
			return new Credentials(tmpUser, tmpPassword, null);
		case 2:
			System.out.print("|----- UserName: ");
			String tmpUser2 = getString();
			System.out.print("|----- Password: ");
			String tmpPassword2 = getString();
			return new Credentials(tmpUser2, tmpPassword2, null);
		case 3:
			System.out.println("Ciao!");
			System.exit(1);
			return null;
		default:
			System.out.println("Errore di I/O");
			return null;
		}
	}
	
//	private static void printNewAgency() {
//	try {
//		Scanner name = new Scanner(System.in);
//		String newAgencyName;
//		System.out.println("Inserisci il nome della nuova agenzia");
//		newAgencyName = name.nextLine();
//		BufferedWriter out = new BufferedWriter(new FileWriter("C:/Users/Gabriele/Desktop/ciao.txt"));
//		out.write(newAgencyName);
//		out.close();
//		newAgency = new TravelAgency(newAgencyName);
//	} catch (IOException e) {
//		System.out.print("percorso file sbagliato");
//	}
//}
	

//private static void readFile() {
//	try {
//		FileReader f = new FileReader("C:/Users/Gabriele/Desktop/ciao.txt");
//		BufferedReader bufferReader = new BufferedReader(f);
//		String tmpString;
//		while (true) {
//			tmpString = bufferReader.readLine();
//			if (!(tmpString == null)) {
//				System.out.println(tmpString);
//			} else {
//				break;
//			}
//		}
//	} catch (IOException e) {
//		System.out.println("no file");
//	}
//}


	
}
