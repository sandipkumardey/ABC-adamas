import java.util.*;

class Expense {
    private String category;
    private String description;
    private double amount;

    public Expense(String category, String description, double amount) {
        this.category = category;
        this.description = description;
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Category: " + category + ", Description: " + description + ", Amount: $" + amount;
    }
}
public class ExpenseTracker {
    private ArrayList<Expense> expenses;
    private Map<String, Double> categoryTotals;

    public ExpenseTracker() {
        expenses = new ArrayList<>();
        categoryTotals = new HashMap<>();
    }

    public void addExpense(String category, String description, double amount) {
        Expense expense = new Expense(category, description, amount);
        expenses.add(expense);

        
        categoryTotals.put(category, categoryTotals.getOrDefault(category, 0.0) + amount);
    }

    public void viewAllExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded.");
        } else {
            for (Expense expense : expenses) {
                System.out.println(expense);
            }
        }
    }

    public void viewExpensesByCategory(String category) {
        boolean categoryExists = false;
        for (Expense expense : expenses) {
            if (expense.getCategory().equalsIgnoreCase(category)) {
                System.out.println(expense);
                categoryExists = true;
            }
        }
        if (!categoryExists) {
            System.out.println("No expenses recorded in the category: " + category);
        }
    }

    public void displayTotalExpenses() {
        double total = 0.0;
        for (Expense expense : expenses) {
            total += expense.getAmount();
        }
        System.out.println("Total Expenses: $" + total);
    }

    public void displayTotalByCategory() {
        if (categoryTotals.isEmpty()) {
            System.out.println("No expenses recorded.");
        } else {
            for (Map.Entry<String, Double> entry : categoryTotals.entrySet()) {
                System.out.println("Category: " + entry.getKey() + ", Total: $" + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ExpenseTracker tracker = new ExpenseTracker();
        System.out.println("Enter the number of entries:");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("Enter the category:");
            String category=sc.next();

            System.out.println("Enter the description:");
            String description=sc.next();

            System.out.println("Enter the amount:");
            int amount=sc.nextInt();

            tracker.addExpense(category,description,amount);
        }


        System.out.println("All Expenses:");
        tracker.viewAllExpenses();
        System.out.println();

        System.out.println("Expenses in 'Food' Category:");
        tracker.viewExpensesByCategory("Food");
        System.out.println();

        
        tracker.displayTotalExpenses();
        System.out.println();

  
        System.out.println("Total Expenses by Category:");
        tracker.displayTotalByCategory();

        sc.close();
    }
}