package packAgency;

import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Travel extends Product {

	private Place departure;
	private Calendar dateDeparture;
	private Place arrival;
	private Calendar dateArrival;
	private Collection<Vehicle> listOfVehicles;

	public Travel(String nameProduct, Place departure, Calendar dateDeparture, Place arrival, Calendar dateArrival, double amount) {
		super(nameProduct, amount);
		this.setArrival(arrival);
		this.setDeparture(departure);
		this.setListOfVehicles(new LinkedList<Vehicle>());
	}

	public Travel(String nameProduct, Place departure, Calendar dateDeparture, Place arrival, Calendar dateArrival, double amount,
			Collection<Vehicle> listOfVehicles) {
		super(nameProduct, amount);
		this.setArrival(arrival);
		this.setDateDeparture(dateDeparture);
		this.setDeparture(departure);
		this.setDateArrival(dateArrival);
		this.setListOfVehicles(listOfVehicles);
	}	

	public Place getDeparture() {
		return departure;
	}

	public Place getArrival() {
		return arrival;
	}

	public Collection<Vehicle> getListOfVehicles() {
		return listOfVehicles;
	}

	public int getNumOfVehicles() {
		return this.listOfVehicles.size();
	}
	
	public Calendar getDateDeparture() {
		return dateDeparture;
	}

	public Calendar getDateArrival() {
		return dateArrival;
	}

	private void setDeparture(Place departure) {
		this.departure = departure;
	}

	private void setArrival(Place arrival) {
		this.arrival = arrival;
	}

	private void setListOfVehicles(Collection<Vehicle> listOfVehicles) {
		this.listOfVehicles = listOfVehicles;
	}

	private void setDateArrival(Calendar dateArrival) {
		this.dateArrival = dateArrival;
	}

	private void setDateDeparture(Calendar departure) {
		this.dateDeparture = departure;		
	}
	
	public boolean assignVehicle(Collection<Vehicle> listVehicles) {
		Iterator<Vehicle> iteratorVehicles = listVehicles.iterator();
		Vehicle tmpVehicles;
		while (iteratorVehicles.hasNext()) {
			tmpVehicles = iteratorVehicles.next();
			if (!tmpVehicles.isTravelling()) {
				this.listOfVehicles.add(tmpVehicles);
				tmpVehicles.setTravelling(true);
				return true;
			}
		}
		return false;
	}

	public boolean endTravel() {
		try {
			Iterator<Vehicle> iteratorVehicles = this.listOfVehicles.iterator();
			Vehicle tmpVehicles;
			while (iteratorVehicles.hasNext()) {
				tmpVehicles = iteratorVehicles.next();
				tmpVehicles.resetVehicles();
			}
			listOfVehicles.clear();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
