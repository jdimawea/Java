// class
public class Item {
    // Member Variables
    private String name;
    private double price;

    // Constructor
    public Item(String name, double price) {
    // Takes a name and price as arguments
    // and sets them accordingly
        this.name = name;
        this.price = price;
    }
    // ----------------------------------- Getters and Setters -------------------------------------------
    // for name and price
    // get
    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    // set
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}