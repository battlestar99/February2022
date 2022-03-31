package packageTwo;

public class AddingIntNumbers {
	
	int a = 20;
	
	static int b = 10;
	
	public int addTwoNumbers(int numberOne, int numberTwo) {
		int sum = numberOne + numberTwo;
		return sum;
	}
	
	public void addThreeNumbers(int numberOne, int numberTwo, int numberThree) {
		int sum = numberOne + numberTwo + numberThree;
		System.out.println(sum);
	}
}
