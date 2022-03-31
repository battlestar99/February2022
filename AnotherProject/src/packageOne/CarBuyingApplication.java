package packageOne;

public class CarBuyingApplication {

	public static void main(String[] args) {
		HelpingFunction hf = new HelpingFunction();
		double carBasePrice = 30000;
		double tax = 0.1; // 10/100 = 0.1
		double adminFee = 1000;
		double downPayment = 3000;
		double creditScore = 650;
		double apr = 0.05;
		
		if(creditScore >= 760) {
			apr = 0.02;
		}else if (creditScore >= 700 && creditScore <760) {
			apr = 0.03;
		}else if (creditScore>= 650 && creditScore <= 699) {
			apr = 0.04;
		}
		
		double months = 72;
		
		double taxOnCar = hf.calculateTax(carBasePrice, tax);
		System.out.println(taxOnCar);
		
		double totalCarPrice = hf.calculateTotalCarPrice(carBasePrice, taxOnCar, adminFee);
		System.out.println(totalCarPrice);
		
		double afterDownPayment = hf.afterDownPayment(totalCarPrice, downPayment);
		System.out.println(afterDownPayment);
		
		double priceWithApr = hf.calculatePriceWithApr(afterDownPayment, apr);
		System.out.println(priceWithApr);
		
		double finalCarPrice = hf.calculateFinalPrice(afterDownPayment, priceWithApr);
		System.out.println(finalCarPrice);
		
		double monthlyPayment = hf.calculateMonthlyPayment(finalCarPrice, months);
		System.out.println(monthlyPayment);
	}

}
