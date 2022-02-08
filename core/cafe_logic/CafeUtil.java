// Import
import java.util.ArrayList;
// Class
public class CafeUtil {
    // Method
    public int getStreakGoal() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;;
        }
        return sum;
    }
    // Method
    public double getOrderTotal(double[] prices) {
        double sum = 0;
        for (int i = 0; i < prices.length; i++) {
            sum += i;
        }
        return sum;
    }
    // Method
    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        customers.add(userName);
        System.out.println("Hello, " + userName + "! There are " + (customers.size() - 1) + " ahead of you.");
    }
}