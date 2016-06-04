package packAgency;

public abstract class Person {

	private String name;
	private String lastName;

	public Person(String name, String lastName) {
		this.setLastName(lastName);
		this.setName(name);
	}
	
	private void setName(String name) {
		this.name = name;
	}

	private void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}
	
	public String toString() {
		return this.name+this.lastName+this.addThing();
		
	}

	protected abstract String addThing();

}