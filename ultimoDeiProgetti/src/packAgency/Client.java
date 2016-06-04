package packAgency;

public class Client extends Person {

	public Client(String name, String lastName) {
		super(name,lastName);
	}

	@Override
	protected String addThing() {
		return "Client";
	}

}
