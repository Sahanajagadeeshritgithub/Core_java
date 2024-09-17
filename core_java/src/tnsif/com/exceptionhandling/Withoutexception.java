package tnsif.com.exceptionhandling;

public class Withoutexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d =0;
		try {
		int a = 42/d;
		int b = 70/d;
		//exception is raised 
		System.out.println("Rakshitha");
		}
		catch(ArithmeticException e) {
			System.out.println("exception handled succesfully" + e.getMessage());

			
		}
		
		System.out.println("will not be printed");

	}

}
