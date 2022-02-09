// Class 
class CarTest {
    // Method
    public static void main(String[] args) {

        // Create a new car, and assign it some values
        Car client1Car = new Car();
        client1Car.year = 2001;
        client1Car.make = "Honda";
        client1Car.model = "Civic";
        client1Car.color = "White";

        // Create another new car
        Car client2Car = new Car();
        client2Car.year = 2009;
        client2Car.make = "Jeep";
        client2Car.model = "Commander";
        client2Car.color = "Black";

        // Now they have their own individual data stored together.
        System.out.println("Car 1 make: " + client1Car.make);
        System.out.println("Car 1 model: " + client1Car.model);

        System.out.println("Car 2 make: " + client2Car.make);
        System.out.println("Car 2 model: " + client2Car.model);
    }
}