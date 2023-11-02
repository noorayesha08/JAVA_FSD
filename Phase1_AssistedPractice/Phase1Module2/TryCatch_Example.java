package Phase1Module2;

public class TryCatch_Example {

	public static void main(String[] args) {
		try {
			int a = 15;
			int b = 0;

			System.out.println("Value of a = " + a);
			System.out.println("Value of b = " + b);

			int c = a / b;
			System.out.println("a / b = " + c);
		} 
		catch (Exception e) {
			System.out.println("Exception Thrown: " + e);
		}

	}

}
