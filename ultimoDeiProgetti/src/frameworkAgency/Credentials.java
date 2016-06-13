package frameworkAgency;

public class Credentials {
	private String userName;
	private String password;
	private PersonAgency userPerson;
	
	public Credentials(String userName, String password, PersonAgency userPerson) {
		this.setPassword(password);
		this.setUserName(userName);
		this.setUserPerson(userPerson);
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}
	
	public PersonAgency getUserPerson() {
		return userPerson;
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

}