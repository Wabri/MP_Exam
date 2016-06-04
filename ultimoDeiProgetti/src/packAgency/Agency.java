package packAgency;

import java.util.Collection;
import java.util.LinkedList;

public class Agency {

	private String name;
	private Collection<Employee> listOfEmployees;
	private Collection<Client> listOfClient;
	private Collection<Product> listOfProduct;

	public Agency(String name) {
		this.setName(name);
		listOfEmployees = new LinkedList<Employee>();
		listOfClient = new LinkedList<Client>();
		listOfProduct = new LinkedList<Product>();
	}

	public Agency(String name, Collection<Employee> listOfEmployees, Collection<Client> listOfClient, Collection<Product> lostOfProduct) {
		this.setName(name);
		this.setListOfEmployees(listOfEmployees);
		this.setListOfClient(listOfClient);
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

	public boolean add(Client client) {
		try {
			this.listOfClient.add(client);
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

	public boolean remove(Client client) {
		try {
			listOfClient.remove(client);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public String toString() {
		return this.name;
	}

}
