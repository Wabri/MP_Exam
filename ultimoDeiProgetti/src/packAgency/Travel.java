package packAgency;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Travel extends Product {

	Place departure;
	Place arrival;
	Collection<Vehicle> listOfVehicles;
	
	public Travel(String nameProduct,Place departure, Place arrival, double amount) {
		super(nameProduct, amount);
		this.setArrival(arrival);
		this.setDeparture(departure);
		this.setListOfVehicles(new LinkedList<Vehicle>());
	}
	
	public Travel(String nameProduct,Place departure, Place arrival, double amount, Collection<Vehicle> listOfVehicles) {
		super(nameProduct, amount);
		this.setArrival(arrival);
		this.setDeparture(departure);
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

	private void setDeparture(Place departure) {
		this.departure = departure;
	}

	private void setArrival(Place arrival) {
		this.arrival = arrival;
	}

	private void setListOfVehicles(Collection<Vehicle> listOfVehicles) {
		this.listOfVehicles = listOfVehicles;
	}
	
	public boolean assignVehicle(Collection<Vehicle> listOfVehicles) {
		try {
			Iterator<Vehicle> iteratorVehicles = listOfVehicles.iterator();
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
		} catch (Exception e) {
			return false;
		}
	}

	public boolean endTravel() {
		try {
			Iterator<Vehicle> iteratorVehicles = this.listOfVehicles.iterator();
			Vehicle tmpVehicles;
			while (iteratorVehicles.hasNext()) {
				tmpVehicles = iteratorVehicles.next();
				tmpVehicles.resetVehicles();
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
}
