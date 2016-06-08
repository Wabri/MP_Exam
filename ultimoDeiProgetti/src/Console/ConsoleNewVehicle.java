package Console;

import packAgency.Agency;
import packAgency.Product;
import packAgency.Vehicle;

public class ConsoleNewVehicle extends ConsoleGeneric {


	public static void getVehicle(Agency toAgency) {
		System.out.println("inserisci la targa del veicolo: ");
		String plate = getString();
		System.out.println("La targa del veicolo �: " + plate);
		System.out.println("inserisci il numero di posti del veicolo: ");
		int numSeats = ConsoleGeneric.getInt();
		System.out.println("Il numero dei posti �: " + numSeats);
		toAgency.add(new Vehicle(plate, numSeats));
	}
	
}