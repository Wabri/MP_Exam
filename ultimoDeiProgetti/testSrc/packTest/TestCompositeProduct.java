package packTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import frameworkAgency.EmployeeCard;
import frameworkAgency.GeneralProduct;
import frameworkAgency.PackProduct;
import frameworkAgency.ProductAgency;

public class TestCompositeProduct {

	GeneralProduct testProductAgency1;
	GeneralProduct testProductAgency2;
	PackProduct testProduct;
	
	@Before
	public void initialize() {
		testProductAgency1 = new ProductAgency("nameProduct1", 100);
		testProductAgency2 = new ProductAgency("nameProduct2", 200);
		testProduct = new PackProduct("namePackProduct1");
	}
	
	@Test
	public void testPackProduct() {
		testProduct.add(testProductAgency1);
		assertTrue(testProduct.getListOfProduct().contains(testProductAgency1));
		testProduct.add(testProductAgency2);
		assertTrue(testProduct.getListOfProduct().contains(testProductAgency2));
		assertTrue(testProduct.getAmount() == 300);
		assertTrue(testProduct.getPriceWithCard(new EmployeeCard(null, .50)) == 150);
		assertTrue(testProduct.remove(testProductAgency1));
		assertFalse(testProduct.getListOfProduct().contains(testProductAgency1));
		assertFalse(testProduct.remove(testProductAgency1));
		assertTrue(testProduct.remove(testProductAgency2));
		assertFalse(testProduct.getListOfProduct().contains(testProductAgency2));
	}
	
	@Test
	public void testProductAgency() {
		assertFalse(testProductAgency1.add(new ProductAgency("nameProduct3", 150)));
		assertFalse(testProductAgency1.remove(new ProductAgency("nameProduct3", 150)));
		assertTrue(100 == testProductAgency1.getAmount());
	}
	
	@Test
	public void testCatchException () {
		testProduct = new PackProduct("nameExceptionProduct",null);
		assertFalse(testProduct.add(testProductAgency1));
		assertFalse(testProduct.add(testProductAgency2));
		assertFalse(testProduct.getAmount() == 300);
		assertFalse(testProduct.remove(testProductAgency1));
		assertFalse(testProduct.remove(testProductAgency2));
	}

}
