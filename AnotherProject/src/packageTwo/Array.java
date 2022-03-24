package packageTwo;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int numOne = 10;
		
		int numTwo;
		numTwo = 20;
		
		
		int[] numberOne = {10, 20, 30, 40, 50};
		System.out.println(numberOne[0]);
		System.out.println(numberOne[1]);
		System.out.println(numberOne[2]);
		System.out.println(numberOne[3]);
		System.out.println(numberOne[4]);
		
		int[] numberTwo = new int[3];
		numberTwo[0] = 10;
		numberTwo[1] = 30;
		numberTwo[2] = 40;
//		System.out.println(numberTwo[2]);
		
		String[] names = new String[5];
		names[0] = "Alif";
		names[1] = "Mohammed";
		names[2] = "Chris";
		names[3] = "BK";
		names[4] = "AR";
		
		System.out.println(Arrays.toString(names));
	}

}
