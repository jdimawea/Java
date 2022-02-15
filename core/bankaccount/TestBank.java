// Class
public class TestBank {
        public static void main(String[] args) {
                // New Bank Account
                BankAccount account1 = new BankAccount();
                account1.deposit(50000, "C");
                account1.deposit(100000, "S");

                BankAccount account2 = new BankAccount();
        // ------------------  Account1 Test  -----------------
                account1.withdraw(10000, "C");
                account1.withdraw(25000, "S");
                account1.deposit(32000, "C");


        // ------------------  Account 2 Test  -----------------
                account2.deposit(50000, "C");
                account2.withdraw(20000, "S");



        // ---------------------------- Account Count Check -----------------------------
                System.out.println("------------Account 1------------");
                account1.accountInfo();
                account1.totalMoney();

                System.out.println("------------Account 2------------");
                account2.accountInfo();
                account2.totalMoney();

                System.out.println("------------Total Accounts------------");
                System.out.println(BankAccount.getNumberOfAccount());
        }
}