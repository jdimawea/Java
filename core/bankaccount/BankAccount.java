// Class
public class BankAccount {
    // Attributes
    private double checking;
    private double savings;

    private static int numberOfAccounts = 0;
    // Temporary ----------------- TAKE OFF LATER --------------------------
    private static double total = 0;

    // Constructor
    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checking = checkingBalance;
        this.savings = savingsBalance;
        numberOfAccounts++;
    }

    // Class Member (static) that has the number of account created thus far
    public static int accountCount() {
        return numberOfAccounts;
    }

    // Class Member (static) that tacks the total amount of money stored in every account created
    public static double totalMoney() {
        return total;
    }

// ----------------------  GETTERS AND SETTERS  ----------------------------
    // Getter for checking account balance. 
    public double getChecking() {
        return this.checking;
    }

    // Getter for saving account balance.
    public double getSavings() {
        return this.savings;
    }
}