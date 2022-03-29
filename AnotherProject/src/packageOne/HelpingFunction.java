package packageOne;

public class HelpingFunction {
	
	public double calculateTax(double carBasePrice, double tax) {
		double result = carBasePrice * tax;
		return result;
	}
	
	public double calculateTotalCarPrice(double basePrice, double tax, double processingFee) {
		double totalCarPrice = basePrice + tax + processingFee;
		return totalCarPrice;
	}

	public double afterDownPayment(double totalCarPrice, double downPayment) {
		double result = totalCarPrice - downPayment;
		return result;
	}
}
