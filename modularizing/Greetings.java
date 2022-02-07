// importing the Date class
import java.util.Date;
// Class
class Greetings {
    // Method
    public String getCurrentDate() {
        Date date = new Date();
        return "Current date is:" + date;
    }
    // Method
    public String greetEnglish(String name) {
        return "Hello, " + name;
    }
    // Method
    public String greetSpanish(String name) {
        return "Hola, " + name;
    }
}