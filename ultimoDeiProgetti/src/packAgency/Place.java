package packAgency;

import java.util.Collection;
import java.util.LinkedList;

public class Place {

	private String namePlace;
	private Collection<Hotel> listOfHotel;

	public Place(String namePlace) {
		this.setNamePlace(namePlace);
		this.listOfHotel = new LinkedList<Hotel>();
	}

	public Place(String namePlace, Collection<Hotel> listOfHotels) {
		this.setNamePlace(namePlace);
		this.setListOfHotel(listOfHotels);
	}

	public String getNamePlace() {
		return namePlace;
	}

	private void setNamePlace(String namePlace) {
		this.namePlace = namePlace;
	}

	private void setListOfHotel(Collection<Hotel> listOfHotel) {
		this.listOfHotel = listOfHotel;
	}

	public Collection<Hotel> getListOfHotel() {
		return listOfHotel;
	}

	public String toString() {
		return namePlace;
	}

	public boolean add(Hotel newHotel) {
		try {
			if (this.listOfHotel.contains(newHotel)) {
				return false;
			}
			this.listOfHotel.add(newHotel);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean remove(Hotel oldHotel) {
		try {
			if (this.listOfHotel.contains(oldHotel)) {
				this.listOfHotel.remove(oldHotel);
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

}
