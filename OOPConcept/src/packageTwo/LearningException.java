package packageTwo;

import packageOne.AnotherMainRun;
import packageOne.MainRun;

public class LearningException {
	
	public static void main(String[] args)   {
		System.out.println("printing before");
		
		try{
			int a = 10;
			int b = 5;
			int c = a/b;
			System.out.println(c);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("always");
		}
		
		// what is difference between Final, Finally, Finalize
		
		// null pointer exception
		// web element not found exception
		// stale element exception  
		// ArrayOutOfBound exception
		
		System.out.println("printing after");
		
		AnotherMainRun amr = new AnotherMainRun();
//		amr.a = 20;
//		System.out.println(amr.a);
		
	}
}
