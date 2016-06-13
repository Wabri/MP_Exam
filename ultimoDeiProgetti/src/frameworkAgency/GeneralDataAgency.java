package frameworkAgency;

import java.util.Collection;

public interface GeneralDataAgency <T extends GeneralProduct>{
	
	Collection<T> getListOfProduct();
	
	boolean add(T newProduct);

	boolean remove(T oldTravel);

}