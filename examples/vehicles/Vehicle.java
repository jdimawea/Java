// Class
public class Vehicle {
    private int numberOfWheels;
    private String color;

//-------------------------- Method Overloading -------------------------
// Overloading a method is just defining new method signatures for the same method name.
    // ex. new Vehicle()
    public Vehicle() {
    }

    // ex. new Vehicle("someColor")
    public Vehicle(String color) {
        // setting the color attribute to the value from the color parameter
        this.color = color;
    }

    // ex. new Vehicle("someColor", 4)
    public Vehicle(String color, int num) {
        this.color = color;
        this.numberOfWheels = num;
    }

// ---------------------- Getters and Setters -------------------------

    // getter
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    // setter
    public void setNumberOfWheels(int number) {
        numberOfWheels = number;
    }

    // getter
    public String getColor() {
        return color;
    }

    // setter
    public void setColor(String color) {
        this.color = color;
    }
}