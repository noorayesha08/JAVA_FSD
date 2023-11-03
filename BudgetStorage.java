package Assessment_Project;

import java.io.*;
import java.util.ArrayList;


public class BudgetStorage {
	
    private static final String FILENAME = "budgets.txt";

    public static void saveBudgets(ArrayList<Budget> budgets) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILENAME))) {
            for (Budget b :  budgets) {
                writer.println(b.getDate() + "," + b.getDescription() + "," + b.getAmount());
            }
        } catch (IOException b) {
            System.out.println("Error saving expenses: " + b.getMessage());
        }
    }

    public static ArrayList<Budget> loadBudgets() {
        ArrayList<Budget> budgets = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                budgets.add(new Budget(parts[0], parts[1], Double.parseDouble(parts[2])));
            }
        } catch (IOException b) {
            System.out.println("Error loading budgets: " + b.getMessage());
        }
        return  budgets;
    }
}