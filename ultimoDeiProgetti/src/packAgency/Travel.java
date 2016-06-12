package packAgency;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedList;

import frameworkAgency.Product;

public class Travel extends Product {

	private Place departure;
	private Calendar dateDeparture;
	private Place arrival;
	private Calendar dateArrival;
	private Collection<Vehicle> listOfVehicles;

	public Travel(String nameProduct, Place departure, Calendar dateDeparture, Place arrival, Calendar dateArrival,
			double amount) {
		super(nameProduct, amount);
		this.setArrival(arrival);
		this.setDateArrival(dateArrival);
		this.setDeparture(departure);
		this.setDateDeparture(dateDeparture);
		this.setListOfVehicles(new LinkedList<Vehicle>());
	}

	public Travel(String nameProduct, Place departure, Calendar dateDeparture, Place arrival, Calendar dateArrival,
			double amount, Collection<Vehicle> listOfVehicles) {
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
		try {
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
		} catch (NullPointerException e) {
			return false;
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
			this.removeAllVehicles();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean removeAllVehicles() {
		try {
			this.listOfVehicles.clear();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean setRandomSeat(Custom newCustom) {
		Iterator<Vehicle> iteratorVehicles = listOfVehicles.iterator();
		Vehicle tmpVehicles;
		while (iteratorVehicles.hasNext()) {
			tmpVehicles = iteratorVehicles.next();
			Custom[] tmpSeat = tmpVehicles.getSeat();
			if (!tmpVehicles.isFull()) {
				for (int numSeat = 0; numSeat < tmpSeat.length; numSeat++) {
					try {
						if (!tmpSeat[numSeat].equals(null)) {
						}
					} catch (NullPointerException e) {
						tmpSeat[numSeat] = newCustom;
						return true;
					}
				}
			}
			tmpVehicles.setFull(true);
		}
		return false;
	}

	public boolean removeSeat(Custom testCustomer) {
		try {
			Iterator<Vehicle> iteratorVehicles = listOfVehicles.iterator();
			Vehicle tmpVehicles;
			while (iteratorVehicles.hasNext()) {
				tmpVehicles = iteratorVehicles.next();
				Custom[] tmpSeat = tmpVehicles.getSeat();
				for (int numSeat = 0; numSeat <= tmpSeat.length; numSeat++) {
					if (tmpSeat[numSeat].equals(testCustomer)) {
						tmpSeat[numSeat] = null;
						return true;
					}
				}
			}
			return false;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean setSeat(Custom newCustomer, Vehicle toVehicle, int i) {
		try {
			if (!toVehicle.isFull()) {
				if (this.listOfVehicles.contains(toVehicle)) {
					Custom[] tmpListCustomer = toVehicle.getSeat();
					try {
						if (!tmpListCustomer[i].equals(null)) {
						}
					} catch (Exception e) {
						tmpListCustomer[i] = newCustomer;
						return true;
					}
				} else {
					return false;
				}
			}
		} catch (NullPointerException e) {
			return false;
		}
		return false;
	}

	public String toString() {
		return this.getNameProduct() + " " + this.departure + " " + formatDate(this.dateDeparture) + " " + this.arrival
				+ " " + formatDate(this.dateArrival) + " " + getAmount();
	}

	private String formatDate(Calendar dateFormat) {
		SimpleDateFormat tmp = new SimpleDateFormat("dd-MM-yyyy");
		GregorianCalendar tmpDate = (GregorianCalendar) dateFormat.clone();
		tmpDate.set(Calendar.MONTH, tmpDate.get(Calendar.MONTH) - 1);
		tmp.setCalendar(tmpDate);
		return tmp.format(tmpDate.getTime());
	}

}
