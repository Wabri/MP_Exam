package packAgency;

public class Hotel {
	
	private Place location;
	private String nameHotel;

	public Hotel(String nameHotel, Place location) {
		this.setNameHotel(nameHotel);
		this.setLocation(location);
	}

	public Place getLocation() {
		return location;
	}

	public String getNameHotel() {
		return nameHotel;
	}

	private void setLocation(Place location) {
		this.location = location;
	}

	private void setNameHotel(String nameHotel) {
		this.nameHotel = nameHotel;
	}

}
