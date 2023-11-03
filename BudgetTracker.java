package Assessment_Project;

import java.util.ArrayList;
import java.util.Scanner;

public class BudgetTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Budget> budgets = BudgetStorage.loadBudgets();

        while (true) {
            System.out.println("\nBudget Tracker Menu:");
            System.out.println("1. Add Budget");
            System.out.println("2. View Budget");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter date (YYYY-MM-DD): ");
                    String date = sc.next();
                    sc.nextLine();  
                    System.out.print("Enter description: ");
                    String desc = sc.nextLine();
                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();
                    budgets.add(new Budget(date, desc, amount));
                    BudgetStorage.saveBudgets(budgets);
                    break;
                case 2:
                    for (Budget b :budgets) {
                        System.out.println(b);
                    }
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please select from the menu.");
            }
        }
    }
}