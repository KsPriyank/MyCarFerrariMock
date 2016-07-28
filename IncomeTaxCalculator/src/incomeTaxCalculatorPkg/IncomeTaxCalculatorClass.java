package incomeTaxCalculatorPkg;

public class IncomeTaxCalculatorClass {

	public int calculateTax(int annualIncome) {
		if (annualIncome < 100000) {
			return 0;
		} else if (annualIncome < 500000) {
			return ((annualIncome - 100000) / 10);
		} else if (annualIncome < 1000000) {
			int interestForFirstOneLakh = 0;
			int interestForFirstFiveLakh = 0;
			int interestForAmountAboveFiveLakh = 0;
			
			interestForFirstFiveLakh = 40000;
			interestForAmountAboveFiveLakh = (annualIncome - 500000) / 5;
			return (interestForFirstOneLakh + interestForFirstFiveLakh + interestForAmountAboveFiveLakh);
		} else if (annualIncome > 1000000) {
			int interestForFirstOneLakh = 0;
			int interestForFirstFiveLakh = 0;
			int interestForFirstTenLakh = 0;
			int interestForAmountAboveTenLakh = 0;
			
			interestForFirstFiveLakh = 40000;
			interestForFirstTenLakh = 100000;
			interestForAmountAboveTenLakh = (int) ( (annualIncome - 1000000) * 0.3 );
			return (interestForFirstOneLakh + interestForFirstFiveLakh 
					+ interestForFirstTenLakh + interestForAmountAboveTenLakh);
		}
		return 0;
	}

}
