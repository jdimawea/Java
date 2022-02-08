// Class
class FixedArrays {
    // Method
    public static void main(String[] args) {
        String [] fruits = {"banana", "pear", "mango", "kiwi"};
        // To swap the value at the index 0 and index 3
        String temp = fruits[0]; // assigns temp to "banana"
        fruits[0] = fruits[3]; // { "kiwi", "pear", "mango", "kiwi" }
        fruits[3] = temp; // { "kiwi", "pear", "mango", "banana" }
        for(int i = 0; i < fruits.length; i++) {
                System.out.println(fruits[i]);
        }
    }
}