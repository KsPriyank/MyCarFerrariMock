package carFerrariPkg;
import org.mockito.Mockito;

import carFerrariPkg.MyFerrariCar.Car;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyFerrariCarTest {

	@Test
	public void checkDesiredValues() {
		// Arrange
		Car myFerrari = Mockito.mock(Car.class);
		Mockito.when(myFerrari.needsFuel()).thenReturn(true);
		
		// Assert
		assertTrue("needsFuel Returned True as expected", myFerrari.needsFuel());
	}
	
	@Test
	public void checkIfDesiredFunctionsCalled() {
		// Arrange
		Car myFerrari = Mockito.mock(Car.class);
		boolean fuelCheck;
		
		// Act
		myFerrari.driveTo("Bengaluru Palace Grounds");
		fuelCheck = myFerrari.needsFuel();
		
		// Assert
		Mockito.verify(myFerrari).driveTo("Bengaluru Palace Grounds");
		Mockito.verify(myFerrari).needsFuel();
	}
}
