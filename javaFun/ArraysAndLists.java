// Import
import java.util.ArrayList;
// Class
public class ArraysAndLists {

    public static void main(String[] args) {

        ArrayList<Integer> myArray = new ArrayList<Integer>();
        // Add items to the array (expanding the size)
        myArray.add(10); // { 10 }
        myArray.add(11); // { 11 }
        // Get and Set
        // Get reads values from the array, use .get() passing the index
        Integer num = myArray.get(0); // 10

        // Set overwrites values in the array, use .set() passing in the index 
        // and the value you want to change it to
        myArray.set(0, 9); // { 9, 11 }
        // print array
        System.out.println(myArray);

        // We can add elements of different types by using <Object>
        ArrayList<Object> things = new ArrayList<Object>();
        // Add items to the array (expanding the size)
        things.add(10);
        things.add("Hello");
        things.add(new ArrayList<Integer>());
        things.add(12.5);
        // print array
        System.out.println(things); 

    }
}