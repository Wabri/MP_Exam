package packTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import packAgency.Custom;
import packAgency.Driver;
import packAgency.Manager;
import packAgency.Person;
import packAgency.Product;

public class TestPerson {

	Product testProduct;
	
	@Before
	public void initialize() {
		testProduct = new Product("nameProduct1",100.);
	}
	
	@Test
	public void testCustomPrizeWithCard() {
		Person testCustom = new Custom("nameCustom1", "lastNameCustom1",.50);
		assertTrue(50. == testProduct.getPriceWithCard(testCustom.getCard()));
	}

	@Test
	public void testCustomPrizeWithoutCard() {
		Person testCustom = new Custom("nameCustom1", "lastNameCustom1");
		assertTrue(100. == testProduct.getPriceWithCard(testCustom.getCard()));
	}
	
	@Test
	public void testEmployeePrizeWithCard() {
		Person testDriver = new Driver("nameDriver1","lastNameDriver1");
		testDriver.getCard().setCardDiscount(.50);
		assertTrue(50. == testProduct.getPriceWithCard(testDriver.getCard()));
	}
	
	@Test
	public void testEmployeePrizeWithoutCard() {
		Person testManager = new Manager("nameCustom1", "lastNameCustom1");
		assertTrue(100. == testProduct.getPriceWithCard(testManager.getCard()));
	}
}
