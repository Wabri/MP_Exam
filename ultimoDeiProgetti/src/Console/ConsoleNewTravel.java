package Console;

import java.util.GregorianCalendar;

import frameworkAgency.Product;
import packAgency.TravelAgency;
import packAgency.DataAgency;
import packAgency.Place;
import packAgency.Travel;

public class ConsoleNewTravel extends ConsoleGeneric {
	
	public static void getTravel(DataAgency toAgency) {
		System.out.println("inserisci il nome del viaggio: ");
		String name = getString();
		System.out.println("da dove parte il viaggio?");
		String departure = getString();
		GregorianCalendar departureDate = getDateGregorian();
		System.out.println("dove arriva il viaggio?");
	    String arrival = getString();
		GregorianCalendar arrivalDate = getDateGregorian();
		System.out.println("inserisci il prezzo del prodotto: ");
		int amount = ConsoleGeneric.getInt();
		Travel newTravel =new Travel(name, new Place(departure), departureDate, new Place(arrival), arrivalDate, amount);
		System.out.println(newTravel.toString());
		toAgency.add(newTravel);
	}
	
	private static GregorianCalendar getDateGregorian() {
		System.out.println("in che data?");
		System.out.print("anno: ");
		int depYear = getInt();
		System.out.print("mese: ");
		int depMonth = getInt();
		System.out.print("giorno: ");
		int depDay = getInt();
		return new GregorianCalendar(depYear, depMonth, depDay);
	}
	
}
