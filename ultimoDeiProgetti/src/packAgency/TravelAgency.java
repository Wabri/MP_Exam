package packAgency;

import java.util.Collection;
import java.util.LinkedList;
import frameworkAgency.Employee;
import frameworkAgency.GeneralAgency;

public class TravelAgency implements GeneralAgency {

	private String name;
	private DataAgency dataAgency;

	public TravelAgency(String name) {
		this.setName(name);
		dataAgency = new DataAgency(new LinkedList<Employee>(), new LinkedList<Custom>(), new LinkedList<Vehicle>(),
				new LinkedList<Travel>(), new LinkedList<Place>());
	}

	public TravelAgency(String name, Collection<Employee> listOfEmployees, Collection<Custom> listOfCustom,
			Collection<Vehicle> listOfVehicles, Collection<Travel> listOfTravel, Collection<Place> listOfPlace) {
		this.setName(name);
		dataAgency = new DataAgency(listOfEmployees, listOfCustom, listOfVehicles, listOfTravel, listOfPlace);
	}

	private void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return "Agency "+this.name + " number of employees: " + this.dataAgency.getListOfEmployees().size()
				+ " number of client: " + this.dataAgency.getListOfCustom().size();

	}

	public DataAgency getDataAgency() {
		return dataAgency;
	}

}
