package packAgency;

public class VisitorPersonAgency implements GeneralLogin {
	
	private PersonAgency personVisited;
	
	@Override
	public void visit(Custom visitCustom) {
		System.out.println("Login Custom");
		personVisited = visitCustom;
	}

	@Override
	public void visit(Manager visitManager) {
		System.out.println("Login Manager");
		personVisited = visitManager;
	}

	@Override
	public void visit(Driver visitDriver) {
		System.out.println("Login Driver");
		personVisited = visitDriver;
	}

	@Override
	public void visit(Hostess visitHostess) {
		System.out.println("Login Hostess");
		personVisited = visitHostess;
	}
	
	public PersonAgency getPersonVisited() {
		return personVisited;
	}

}
