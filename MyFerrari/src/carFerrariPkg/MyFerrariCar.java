package carFerrariPkg;

public class MyFerrariCar {
	public interface Car {
		boolean needsFuel();
		double getEngineTemperature();
		void driveTo(String destination);
	}
}
