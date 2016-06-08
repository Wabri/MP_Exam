package packTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import frameworkAgency.GeneralProduct;
import packAgency.Custom;
import packAgency.Driver;
import packAgency.Manager;
import packAgency.PersonAgency;
import packAgency.Product;

public class TestCardPrice {

	GeneralProduct testProduct;
	char[] testTaxCode = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
	
	@Before
	public void initialize() {
		testProduct = new Product("nameProduct1",100.);
	}
	
	@Test
	public void testCustomPriceWithCard() {
		PersonAgency testCustom = new Custom("nameCustom1", "lastNameCustom1",.50, testTaxCode);
		assertTrue(50. == testProduct.getPriceWithCard(testCustom.getCard()));
	}

	@Test
	public void testCustomPriceWithoutCard() {
		PersonAgency testCustom = new Custom("nameCustom1", "lastNameCustom1", testTaxCode);
		assertTrue(100. == testProduct.getPriceWithCard(testCustom.getCard()));
	}
	
	@Test
	public void testEmployeePriceWithCard() {
		PersonAgency testDriver = new Driver("nameDriver1","lastNameDriver1",testTaxCode);
		testDriver.getCard().setCardDiscount(.50);
		assertTrue(50. == testProduct.getPriceWithCard(testDriver.getCard()));
	}
	
	@Test
	public void testEmployeePriceWithoutCard() {
		PersonAgency testManager = new Manager("nameCustom1", "lastNameCustom1",testTaxCode);
		assertTrue(100. == testProduct.getPriceWithCard(testManager.getCard()));
	}
}
