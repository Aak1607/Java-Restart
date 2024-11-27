package Week2.Collectionframework;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<String>();
        str.add("Hello");
        str.add("How are you?");
        str.add("I am good");

        System.out.println(str);

        ArrayList<String> scaler = new ArrayList<String>(
            Arrays.asList("I",
                          "love",
                          "Java"));
  
        // to print the ArrayList
        System.out.println("ArrayList is " + scaler);

        //displaying the size
        System.out.println("Size after addition "+str.size());

        //remove element at index 0 
        str.remove(0);

        System.out.println(str);
    }
}
