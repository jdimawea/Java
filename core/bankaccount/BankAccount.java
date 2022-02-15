// Class
public class BankAccount {
    // Attributes
    private double checking;
    private double savings;

    private static int numberOfAccounts = 0;
    private static double total = 0;

    // Constructor
    public BankAccount() {
        this.checking = 0;
        this.savings = 0;
        numberOfAccounts++;
    }

    // Class Member (static) that has the number of account created thus far
    public static int getNumberOfAccounts() {
        return numberOfAccounts;
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

// ---------------------------- Methods -----------------------------

    // Method that will allow a user to deposit money into checking or savings
    public void deposit(double amount, String account) {
        String type = account;
        if (type.indexOf("C") == 0) {
            this.checking += amount;
        } else if (type.indexOf("S") == 0) {
            this.savings += amount;
        }
        BankAccount.total += amount;
    }

    // Method that will allow a user to withdraw money from checking or savings
    public void withdraw(double amount, String account) {
        String type = account;
        if (type.indexOf("C") == 0) {
            if(amount <= this.checking) {
                this.checking -= amount;
                BankAccount.total -= amount;
            } else {
                System.out.println("Insufficient Funds");
            }
        } else if (type.indexOf("S") == 0) {
            if(amount <= this.savings) {
                this.savings -= amount;
                BankAccount.total -= amount;
            } else {
                System.out.println("Insufficient Funds");
            }
        }
    }

    // Class Member (static) that tacks the total amount of money stored in every account created
    public static void totalMoney() {
        System.out.println("Total Money: " + total);
    }

    // Class Member to check info
    public void accountInfo() {
        System.out.println("Checking: " + this.checking);
        System.out.println("Savings: " + this.savings);
    }
}