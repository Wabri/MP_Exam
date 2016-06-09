package packAgency;

import java.util.Collection;
import java.util.LinkedList;

public class Place {
	
	private String namePlace;
	private Collection<String> listOfHotel;
	
	public Place(String namePlace) {
		this.setNamePlace(namePlace);
		this.listOfHotel = new LinkedList<String>();
	}
	
	public Place (String namePlace, Collection<String> listOfHotels) {
		this.setNamePlace(namePlace);
		this.setListOfHotel(listOfHotels);
	}

	public String getNamePlace() {
		return namePlace;
	}

	private void setNamePlace(String namePlace) {
		this.namePlace = namePlace;
	}
	
	private void setListOfHotel(Collection<String> listOfHotel) {
		this.listOfHotel = listOfHotel;
	}

	public Collection<String> getListOfHotel() {
		return listOfHotel;
	}

	public String toString() {
		return namePlace;
	}

}
