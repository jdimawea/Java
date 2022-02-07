// Import
import java.util.Date;
// Class
public class AlfredQuotes {
    // Method
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }

    // Method
    public String guestGreeting(String name) {
        // Your Code Here
        return String.format("Hello, %s. Lovely to see you.", name);
    }

    // Method
    public String dateAnnouncement() {
        // Your Code Here
        Date date = new Date();
        return "It is currently " + date;
    }

    // Method
    public String respondBeforeAlexis(String conversation) {
        // Your Code Here
        if(conversation.indexOf("Alexis") > -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        if (conversation.indexOf("Alfred") > -1) {
            return "At your service. As you wish, naturally.";
        }
        return "Right. And with that I shall retire.";
    }

    // Ninja Bonus
    //Sensei Bonus
}
