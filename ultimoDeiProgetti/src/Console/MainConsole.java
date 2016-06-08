package Console;

	import java.util.InputMismatchException;
	import java.util.Scanner;

	import packAgency.Agency;

	public class MainConsole {
		
		static Agency newAgency;

		public static void main (String args[]) {
			displayMainMenu();
			Scanner typePersonIO = new Scanner(System.in);
			int resp = typePersonIO.nextInt();
			getMainAction(resp);
			displaySubMenu();
			resp = typePersonIO.nextInt();
			getSubAction(resp);
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
			System.out.println("3 - Aggiungi un programma di viaggio");
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
				ConsoleNewProduct.getProduct(newAgency);
				break;
			default:
				System.out.println("Non va bene, scegli di nuovo");
			}
		}

	}
