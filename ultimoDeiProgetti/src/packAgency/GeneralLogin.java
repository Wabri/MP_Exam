package packAgency;

public interface GeneralLogin {
	
	void visit (Custom visitCustom);
	void visit (Manager visitManager);
	void visit (Driver visitDriver);
	void visit (Hostess visitHostess);

}
