package function;

import additionalPackage.AddingNumbers;

public class FunctionLearning {

	public static void main(String[] args) {
//		Addition add = new Addition();
//		add.addThreeNumbers(20, 20, 30);
//		add.addTwoNumbers(50, 60);
		
		Multiplication multiply = new Multiplication();
//		multiply.multiplyTwoNumbers(20, 30);
		
		Something some = new Something();
//		some.printMyName();
//		some.inputName("Nadim");
		
		AddDoubleNumbers adn = new AddDoubleNumbers();
//		adn.addTwoDoubleNumbers(50.5, 10.2);
		
		AddingNumbers add2 = new AddingNumbers();
//		add2.addTwoNumbers(50, 80);
		
		Addition an = new Addition();
		
		int resultOne = an.addTwoNumbers(50, 50);
		System.out.println(resultOne);
		int resultTwo = an.addFourNumbers(50, 20, 30, 40);
		System.out.println(resultTwo);
		
		int result = resultOne + resultTwo;
		System.out.println(result);
	}
	

}
