// Class
public class TestGreetings {
    // Method
    public static void main(String[] args) {

        // To use the greetings methods
        // create a variable of type Greetings

        Greetings greeterApp = new Greetings();

        // Use the varialbe to access Greetings methods
        // using dot notation. 

        String dateMessage = greeterApp.getCurrentDate();
        System.out.println(dateMessage);

        String helloMessage = greeterApp.greetEnglish("John");
        System.out.println(helloMessage);
    }
}