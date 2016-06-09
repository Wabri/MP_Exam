package packAgency;

import java.util.Collection;
import java.util.LinkedList;

import frameworkAgency.GeneralAgency;
import frameworkAgency.GeneralProduct;

public class Agency implements GeneralAgency {

	private String name;
	private Collection<Employee> listOfEmployees;
	private Collection<Custom> listOfCustom;
	private Collection<Travel> listOfTravel;
	private Collection<Vehicle> listOfVehicles;
	private Collection<Place> listOfPlace;

	public Agency(String name) {
		this.setName(name);
		listOfEmployees = new LinkedList<Employee>();
		listOfCustom = new LinkedList<Custom>();
		listOfTravel = new LinkedList<Travel>();
		listOfVehicles = new LinkedList<Vehicle>();
		listOfPlace = new LinkedList<Place>();
	}

	public Agency(String name, Collection<Employee> listOfEmployees, Collection<Custom> listOfCustom, Collection<Vehicle> listOfVehicles, Collection<Travel> listOfTravel, Collection<Place> listOfPlace) {
		this.setName(name);
		this.setListOfEmployees(listOfEmployees);
		this.setListOfCustom(listOfCustom);
		this.setListOfVehicles(listOfVehicles);
		this.setListOfTravel(listOfTravel);
		this.setListOfPlace(listOfPlace);
	}

	private void setName(String name) {
		this.name = name;
	}

	private void setListOfEmployees(Collection<Employee> listOfEmployees) {
		this.listOfEmployees = listOfEmployees;
	}

	private void setListOfCustom(Collection<Custom> listOfCustom) {
		this.listOfCustom = listOfCustom;
	}

	private void setListOfTravel(Collection<Travel> listOfTravel) {
		this.listOfTravel = listOfTravel;
	}
	
	private void setListOfVehicles(Collection<Vehicle> listOfVehicles) {
		this.listOfVehicles = listOfVehicles;
	}

	private void setListOfPlace(Collection<Place> listOfPlace) {
		this.listOfPlace = listOfPlace;
	}

	@Override
	public String getName() {
		return this.name;
	}
	
	public Collection<Employee> getListOfEmployees() {
		return listOfEmployees;
	}

	public Collection<Custom> getListOfCustom() {
		return listOfCustom;
	}

	public Collection<Travel> getListOfTravel() {
		return listOfTravel;
	}

	public Collection<Vehicle> getListOfVehicles() {
		return listOfVehicles;
	}
	
	public Collection<Place> getListOfPlace() {
		return listOfPlace;
	}

	public boolean add(Employee newEmployee) {
		try {
			listOfEmployees.add(newEmployee);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean add(Custom newCustom) {
		try {
			this.listOfCustom.add(newCustom);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean add(Travel newTravel) {
		try {
			this.listOfTravel.add(newTravel);
			this.listOfPlace.add(newTravel.getArrival());
			this.listOfPlace.add(newTravel.getDeparture());
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean add(Place newPlace) {
		try {
			if (!listOfPlace.contains(newPlace)) {
				this.listOfPlace.add(newPlace);
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean add(Vehicle newVehicles) {
		try {
			this.listOfVehicles.add(newVehicles);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean remove(Employee oldEmployee) {
		try {
			this.listOfEmployees.remove(oldEmployee);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean remove(Custom oldCustom) {
		try {
			this.listOfCustom.remove(oldCustom);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean remove(Vehicle oldVehicles) {
		try {
			this.listOfVehicles.remove(oldVehicles);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean remove(GeneralProduct oldProduct) {
		try {
			this.listOfTravel.remove(oldProduct);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return this.name+" number of employees: "+this.listOfEmployees.size()+" number of client: "+this.listOfCustom.size();
	}

}
