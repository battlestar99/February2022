package packageOne;

public class CarBuyingApplication {

	public static void main(String[] args) {
		double carBasePrice = 30000;
		double tax = 0.1; // 10/100 = 0.1
		double adminFee = 1000;
		double downPayment = 3000;
		double creditScore = 750;
		double apr = 0.05;
		
		if(creditScore >= 700) {
			apr = 0.05;
		}
		
		double months = 72;
		
		double taxOnCar = carBasePrice * tax;
		
		double totalCarPrice = carBasePrice + taxOnCar + adminFee;
		System.out.println(totalCarPrice);
		
		double afterDownPayment = totalCarPrice - downPayment;
		System.out.println(afterDownPayment);
		
		double priceWithApr = afterDownPayment * apr;
		System.out.println(priceWithApr);
		
		double finalCarPrice = afterDownPayment + priceWithApr;
		System.out.println(finalCarPrice);
		
		double monthlyPayment = finalCarPrice/months;
		System.out.println(monthlyPayment);
	}

}
