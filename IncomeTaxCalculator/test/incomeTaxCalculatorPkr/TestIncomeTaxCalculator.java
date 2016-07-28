package incomeTaxCalculatorPkr;

import static org.junit.Assert.*;

import org.junit.Test;

import incomeTaxCalculatorPkg.IncomeTaxCalculatorClass;

public class TestIncomeTaxCalculator {

	@Test
	public void testIncomeTaxForBelowOneLakhIncome() {
		// Arrange
		IncomeTaxCalculatorClass incomeTaxCalculator = new IncomeTaxCalculatorClass();
		long actualIncomeTax = 0;
		long expectedIncomeTax = 0;
		
		// Act
		actualIncomeTax = incomeTaxCalculator.calculateTax(90000);
		expectedIncomeTax = 0;
		
		// Assert
		assertEquals(expectedIncomeTax, actualIncomeTax);
	}

	@Test
	public void testIncomeTaxForAboveOneLakhBelowFiveLakhIncome() {
		// Arrange
		IncomeTaxCalculatorClass incomeTaxCalculator = new IncomeTaxCalculatorClass();
		long actualIncomeTax = 0;
		long expectedIncomeTax = 0;
		
		// Act
		actualIncomeTax = incomeTaxCalculator.calculateTax(290000);
		expectedIncomeTax = 19000;
		
		// Assert
		assertEquals(expectedIncomeTax, actualIncomeTax);
	}
	
	@Test
	public void testIncomeTaxForAboveFiveLakhBelowTenLakhIncome() {
		// Arrange
		IncomeTaxCalculatorClass incomeTaxCalculator = new IncomeTaxCalculatorClass();
		int actualIncomeTax = 0;
		int expectedIncomeTax = 0;
		
		// Act
		actualIncomeTax = incomeTaxCalculator.calculateTax(590000);
		expectedIncomeTax = 58000;
		
		// Assert
		assertEquals(expectedIncomeTax, actualIncomeTax);
	}
	
	@Test
	public void testIncomeTaxForAboveTenLakhIncome() {
		// Arrange
		IncomeTaxCalculatorClass incomeTaxCalculator = new IncomeTaxCalculatorClass();
		long actualIncomeTax = 0;
		long expectedIncomeTax = 0;
		
		// Act
		actualIncomeTax = incomeTaxCalculator.calculateTax(1100000);
		expectedIncomeTax = 170000;
		
		// Assert
		assertEquals(expectedIncomeTax, actualIncomeTax);
	}
}
