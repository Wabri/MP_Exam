package packAgency;

import frameworkAgency.PersonAgency;

public class Credentials {
	private String userName;
	private String password;
	private PersonAgency userPerson;
	
	public Credentials(String userName, String password, PersonAgency typePerson) {
		this.setPassword(password);
		this.setUserName(userName);
		this.setUserPerson(typePerson);
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	private void setUserName(String userName) {
		this.userName = userName;
	}

	private void setPassword(String password) {
		this.password = password;
	}

	private void setUserPerson(PersonAgency userPerson) {
		this.userPerson = userPerson;
	}
	
	public boolean isAdmin() {
		return this.userPerson.isAdmin();
	}
	
	public boolean isEmployee() {
		return this.userPerson.isEmployee();
	}

}