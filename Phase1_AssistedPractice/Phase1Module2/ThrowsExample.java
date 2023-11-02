package Phase1Module2;

import java.util.Scanner;

public class ThrowsExample {
                
    public static void main(String[] args) {
                    
        Scanner input = new Scanner(System.in);
        int num1, num2, result;
        System.out.print("Enter any two numbers: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        try {
            if(num2 == 0)
                throw new ArithmeticException("Division by zero is not posible");
            result = num1 / num2;
            System.out.println(num1 + "/" + num2 + "=" + result);
        }
        catch(ArithmeticException ae) {
            System.out.println("Problem info: " + ae.getMessage());
        }
            System.out.println("End of the program");		
    }
}