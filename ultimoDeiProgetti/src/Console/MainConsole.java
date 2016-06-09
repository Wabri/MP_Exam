package Console;

	import java.util.InputMismatchException;
	import java.util.Scanner;

	import packAgency.Agency;

	public class MainConsole {
		
		static Agency newAgency;

		public static void main (String args[]) {
			displayMainMenu();
			Scanner agencyIO = new Scanner(System.in);
			int resp = agencyIO.nextInt();
			getMainAction(resp);
			while (resp!=5) {
				displaySubMenu();
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
				System.out.println("Le esco");
				System.exit(1);
				break;
			default:
				System.out.println("Non va bene, scegli di nuovo");
			}
		}

		private static String getString() {
			Scanner keyboard = new Scanner(System.in);
			return keyboard.nextLine();
		}

		private static void displayMainMenu() {
			System.out.println("Benvenuto!");
			System.out.println("1 - Crea la tua Agenzia Viaggi");
			System.out.println("2 - Escile dal programma");
		}

		private static void displaySubMenu() {
			System.out.println(" Agenzia Viaggi "+newAgency.getName());
			System.out.println("1 - Aggiungi una persona");
			System.out.println("2 - Aggiungi un veicolo");
			System.out.println("3 - Aggiungi una località ");
			System.out.println("4 - Aggiungi un viaggio");
			System.out.println("5 - Escile dal programma ");
		}
		
		private static void getSubAction(int resp) {
			switch (resp) {
			case 1:
				ConsoleNewPerson.getPerson(newAgency);
				break;
			case 2:
  				ConsoleNewVehicle.getVehicle(newAgency);
				break;
			case 3:
				ConsoleNewPlace.getPlace(newAgency);
				break;
			case 4: 
				ConsoleNewTravel.getTravel(newAgency);
				break;
			case 5:
				System.out.println("Le esco");
				System.exit(1);
				break;
			default: 
				break;
			}
		}
		
	}
