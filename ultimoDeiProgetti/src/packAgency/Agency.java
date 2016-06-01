package packAgency;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedList;

public class Agency implements Serializable {

	private Collection<Employee> listOfEmployees;
	private Collection<Client> listOfClient;
	private Collection<Product> listOfProduct;

	public Agency() {
		listOfEmployees = new LinkedList<Employee>();
		listOfClient = new LinkedList<Client>();
		listOfProduct = new LinkedList<Product>();
	}
	
	public Agency(Collection<Employee> listOfEmployees, Collection<Client> listOfClient, Collection<Product> lostOfProduct) {
		this.setListOfEmployees(listOfEmployees);
		this.setListOfClient(listOfClient);
		this.setListOfProduct(lostOfProduct);
	}
	
	private void setListOfEmployees(Collection<Employee> listOfEmployees) {
		this.listOfEmployees = listOfEmployees;
	}

	private void setListOfClient(Collection<Client> listOfClient) {
		this.listOfClient = listOfClient;
	}

	private void setListOfProduct(Collection<Product> listOfProduct) {
		this.listOfProduct = listOfProduct;
	}

	public Collection<Employee> getListOfEmployees() {
		return listOfEmployees;
	}



	public Collection<Client> getListOfClient() {
		return listOfClient;
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

	public boolean remove(Employee myEmployee) {
		try {
			listOfEmployees.remove(myEmployee);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
}
