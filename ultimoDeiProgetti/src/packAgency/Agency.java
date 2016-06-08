package packAgency;

import java.util.Collection;
import java.util.LinkedList;

import frameWorkAgency.GeneralAgency;
import frameWorkAgency.GeneralProduct;

public class Agency implements GeneralAgency {

	private String name;
	private Collection<Employee> listOfEmployees;
	private Collection<Custom> listOfCustom;
	private Collection<Product> listOfProduct;
	private Collection<Vehicle> listOfVehicles;

	public Agency(String name) {
		this.setName(name);
		listOfEmployees = new LinkedList<Employee>();
		listOfCustom = new LinkedList<Custom>();
		listOfProduct = new LinkedList<Product>();
		listOfVehicles = new LinkedList<Vehicle>();
	}

	public Agency(String name, Collection<Employee> listOfEmployees, Collection<Custom> listOfCustom, Collection<Product> lostOfProduct, Collection<Vehicle> listOfVehicles) {
		this.setName(name);
		this.setListOfEmployees(listOfEmployees);
		this.setListOfCustom(listOfCustom);
		this.setListOfProduct(lostOfProduct);
		this.setListOfVehicles(listOfVehicles);
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

	private void setListOfProduct(Collection<Product> listOfProduct) {
		this.listOfProduct = listOfProduct;
	}
	
	private void setListOfVehicles(Collection<Vehicle> listOfVehicles) {
		this.listOfVehicles = listOfVehicles;
	}

	/* (non-Javadoc)
	 * @see packAgency.GeneralAgency#getName()
	 */
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

	public Collection<Product> getListOfProduct() {
		return listOfProduct;
	}

	public Collection<Vehicle> getListOfVehicles() {
		return listOfVehicles;
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
	
	public boolean add(Product newProduct) {
		try {
			this.listOfProduct.add(newProduct);
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
			this.listOfProduct.remove(oldProduct);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public String toString() {
		return this.name+" number of employees: "+this.listOfEmployees.size()+" number of client: "+this.listOfCustom.size();
	}

}
