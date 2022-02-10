// Import
import java.util.ArrayList;
// Class
public class Order {

    public String name;
    public boolean ready;
    public ArrayList<Item> items = new ArrayList<Item>();

    // Method
    public Order() {
        this.name = "Guest";
        this.ready = false;
    }

    public Order(String name) {
        this.name = name;
        this.ready = false;
    }

    // ------------------------------------  Getters and Setters  ---------------------------------------
    // Get
    public boolean getReady() {
        return this.ready;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Item> getItems(){
        return items;
    }

    // Set
    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItems(ArrayList<Item> item) {
        this.items = items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public String getStatusMessage() {
        if(this.ready == true) {
            return "Your order is ready.";
        } else {
            return  "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal() {
        double total = 0.0;
        for(Item i: this.items) {
            total += i.getPrice();
        }
    return total;
    }

    public void display(){
        System.out.printf("Customer Name: %s", this.name);
        for(Item i: this.items) {
            System.out.println(i.getName() + " - $" + i.getPrice());
        }
    System.out.println("Total: $" + this.getOrderTotal());
    }
}