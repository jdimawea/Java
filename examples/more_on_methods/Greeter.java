// Class
public class Greeter {
    // Method
    private String createGreeting(String toBeGreeted) {
        return "Hello there " + toBeGreeted;
    }
    // Method 
    public String greet() {
        return createGreeting("Punk");
    }
    // Method
    public String greet(String firstName, String lastName) {
        return createGreeting(firstName + " " + lastName);
    }
    // Method
    public String greet(String firstName) {
        return createGreeting("Hello there " + firstName);
    }
}