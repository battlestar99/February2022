package packageTwo;

public class LearningFunctions {

	public static void main(String[] args) {
		LearningFunctions learning = new LearningFunctions();
		learning.addTwoIntNumbers(10, 20);
		learning.addTwoIntNumbers(25, 50);
		learning.addTwoIntNumbers(20.25, 25.25);
		learning.addTwoIntNumbers(26.35, 65.69);
	}
	
	
	
	public void addTwoIntNumbers(double a, double b) {
		
		double c = a + b;
		System.out.println(c);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void addTwoNumbers(int numberOne, int numberTwo) {
		int result = numberOne + numberTwo;
		System.out.println(result);
	}

}
