package frameWorkAgency;

public interface GeneralProduct {

	String getNameProduct();

	double getAmount();

	String toString();

	double getPriceWithCard(GeneralCard card);

}