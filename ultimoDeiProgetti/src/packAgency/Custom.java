package packAgency;

import java.util.Collection;
import java.util.LinkedList;

import frameWorkAgency.GeneralCard;

public class Custom extends PersonAgency {

	private Collection<Travel> listOfBooking;

	public Custom(String name, String lastName, double discount, char[] taxCode) {
		super(name, lastName, taxCode);
		this.listOfBooking = new LinkedList<Travel>();
		this.getCard().setCardDiscount(discount);
	}

	public Custom(String name, String lastName, char[] taxCode) {
		super(name, lastName, taxCode);
		this.listOfBooking = new LinkedList<Travel>();
	}

	public Collection<Travel> getListOfBooking() {
		return this.listOfBooking;
	}

	@Override
	protected String addThing() {
		return "Custom";
	}

	protected GeneralCard getTypeCard() {
		return new CustomCard(this, 0.);
	}

	public boolean add(Travel newTravel) {
		try {
			this.listOfBooking.add(newTravel);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean remove(Travel oldTravel) {
		try {
			this.listOfBooking.remove(oldTravel);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

}
