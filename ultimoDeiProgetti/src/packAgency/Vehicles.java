package packAgency;

public class Vehicles {

	private String plate;

	public Vehicles(String plate) {
		this.setPlate(plate);
	}

	private void setPlate(String plate) {
		this.plate = plate;
	}

	public String getPlate() {
		return plate;
	}

	public String toString() {
		return "Vehicle plate: " + this.plate;
	}

}
