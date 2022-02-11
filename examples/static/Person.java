// Class
public class Person {
    // Attributes
    private int age;
    private String name;
    private static int numberOfPeople = 0;

    // Constructor 
    public Person(int ageParam, String nameParam) {
        age = ageParam;
        name = nameParam;
        numberOfPeople++;
    }

    public static int peopleCount() {
        return numberOfPeople;
    }
}