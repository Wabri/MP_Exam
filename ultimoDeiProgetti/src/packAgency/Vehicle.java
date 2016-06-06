package packAgency;

public class Vehicle {

	private String plate;
	private boolean travelling;
	private Driver driverAssociated;
	private Hostess hostessAssociated;

	public Vehicle(String plate) {
		this.setPlate(plate);
		this.setTravelling(false);
	}

	private void setPlate(String plate) {
		this.plate = plate;
	}

	public boolean isTravelling() {
		return travelling;
	}

	public void setTravelling(boolean travelling) {
		this.travelling = travelling;
	}

	public String getPlate() {
		return plate;
	}

	public void setDriverAssociated(Driver driverAssociated) {
		this.driverAssociated = driverAssociated;
		this.getDriverAssociated().setTravelling(true);
	}

	public void setHostessAssociated(Hostess hostessAssociated) {
		this.hostessAssociated = hostessAssociated;
		this.getHostessAssociated().setTravelling(true);
	}

	public Driver getDriverAssociated() {
		return driverAssociated;
	}

	public Hostess getHostessAssociated() {
		return hostessAssociated;
	}

	public String toString() {
		return "Vehicle plate: " + this.plate;
	}

	public void resetVehicles() {
		setTravelling(false);
		getDriverAssociated().setTravelling(false);
		getHostessAssociated().setTravelling(false);
		setDriverAssociated(null);
		setHostessAssociated(null);
	}

}
