package packAgency;

import java.util.Collection;
import java.util.LinkedList;

public class Agency {

	private String name;
	private Collection<Employee> listOfEmployees;
	private Collection<Custom> listOfCustom;
	private Collection<Product> listOfProduct;

	public Agency(String name) {
		this.setName(name);
		listOfEmployees = new LinkedList<Employee>();
		listOfCustom = new LinkedList<Custom>();
		listOfProduct = new LinkedList<Product>();
	}

	public Agency(String name, Collection<Employee> listOfEmployees, Collection<Custom> listOfCustom, Collection<Product> lostOfProduct) {
		this.setName(name);
		this.setListOfEmployees(listOfEmployees);
		this.setListOfCustom(listOfCustom);
		this.setListOfProduct(lostOfProduct);
	}

	private void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
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

	public Collection<Employee> getListOfEmployees() {
		return listOfEmployees;
	}

	public Collection<Custom> getListOfCustom() {
		return listOfCustom;
	}

	public Collection<Product> getListOfProduct() {
		return listOfProduct;
	}

	public boolean add(Employee employee) {
		try {
			listOfEmployees.add(employee);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean add(Custom custom) {
		try {
			this.listOfCustom.add(custom);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean remove(Employee employee) {
		try {
			listOfEmployees.remove(employee);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean remove(Custom client) {
		try {
			listOfCustom.remove(client);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public String toString() {
		return this.name+" number of employees: "+this.listOfEmployees.size()+" number of client: "+this.listOfCustom.size();
	}

}
