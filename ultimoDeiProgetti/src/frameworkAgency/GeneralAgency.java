package frameworkAgency;

public interface GeneralAgency {

	String getName();

	String toString();
	
	GeneralDataAgency<?> getDataAgency();

}