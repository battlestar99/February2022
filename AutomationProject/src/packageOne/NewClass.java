package packageOne;

public class NewClass {

	public static void main(String[] args) throws Throwable {
		//String - can store name, address
		//int - real numbers
		//double - decimal point numbers
		//boolean - true/false
//		String firstName = "Tahra";
//		String lastName = "maham";
//		int phoneNumber = 14513468;
//		String address = "626 szlkdfnskl";
//		double height = 5.6;
//		boolean livingAreaVA = false;
//		
//		System.out.println(firstName);
//		System.out.println(lastName);
//		System.out.println(phoneNumber);
//		System.out.println(address);
//		System.out.println(height);
//		System.out.println(livingAreaVA);
		
		
//		final int a = 300;
//		System.out.println(a);
		
		
		
		
		
		try {
		int c = 0; 
		int b = 20;
		int result = b/c;
		System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("finally");
		}
		
		System.out.println("myName");
		
		System.out.println("myName");
		
		System.out.println("myName");
		
		
		
		
		
//		NewClass nc = new NewClass();
//		System.gc();
		
	}
	
	public void finalize() throws Throwable{
		System.out.println("Object is created");
	}

}
