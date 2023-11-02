package Phase1Module1;

public class Methods {
	 public void printMessage() {
	        System.out.println("Find the Sum of two numbers");
	        System.out.println();
	    }

	    public int add(int a, int b) {
	        return a + b;
	    }

	    public static void main(String[] args) {
	        Methods example = new Methods();
	        example.printMessage();

	        int sum = example.add(98, 72);
	        System.out.println("The Sum of two numbers : " + sum);
	    }

}
