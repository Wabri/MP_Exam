package packAgency;

public class Vehicle {

	private String plate;
	private boolean travelling;
	private Driver driverAssociated;
	private Hostess hostessAssociated;
	private Custom[] Seat;
	private boolean full;

	public Vehicle(String plate, int numSeats) {
		this.setPlate(plate);
		this.setTravelling(false);
		this.Seat = new Custom[numSeats];
	}

	private void setPlate(String plate) {
		this.plate = plate;
	}

	public boolean isTravelling() {
		return this.travelling;
	}

	public boolean isFull() {
		return full;
	}

	public void setFull(boolean full) {
		this.full = full;
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
		this.setTravelling(false);
		this.setFull(false);
		int tmpNumSeat = Seat.length;
		this.Seat = new Custom[tmpNumSeat];
		this.getDriverAssociated().setTravelling(false);
		this.getHostessAssociated().setTravelling(false);
	}

	public Custom[] getSeat() {
		return Seat;
	}

}
