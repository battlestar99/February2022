package packageOne;

public class ConditionalStatement {

	public static void main(String[] args) {
		
//		String light = "white";
//		
//		if(light == "red") {
//			System.out.println("stop!!");
//		}else if(light == "green") {
//			System.out.println("Go!!");
//		}else if(light == "yellow") {
//			System.out.println("slow down!!");
//		}else {
//			System.out.println("stop and go");
//		}
		int b = 0;
		
		int grade = 55;
		
		if(grade >= 90 && grade <=100) {
			System.out.println("A");
			b = 10;
		}else if(grade >= 80 && grade <= 89) {
			System.out.println("B");
			b = 20;
		}else if(grade >= 70 && grade <= 79) {
			System.out.println("C");
			b = 30;
		}else {
			System.out.println("Fail");
			b = 40;
		}
		
		System.out.println(b);
		
		
//		int a = 10;
//		//&& , ||
//		if(a >= 5 &&  a <= 15){
//			System.out.println("a is between 5 and 15");
//		}else {
//			System.out.println("something");
//		}
		
		
		
		
		
		
		
		
	
	}

}
