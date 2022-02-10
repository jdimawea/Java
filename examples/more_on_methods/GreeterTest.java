// Class
public class GreeterTest {
    // Method
    public static void main(String[] args) {
        Greeter g = new Greeter();

        String greeting = g.greet();
        String greetingWithName = g.greet("John", "Doe");

        System.out.println(greetingWithName);
    }

}