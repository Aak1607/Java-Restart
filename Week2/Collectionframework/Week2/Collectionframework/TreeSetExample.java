package Week2.Collectionframework;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet
        Set<String> ts = new TreeSet<>();
    
       //displaying the initial size
       System.out.println("Size at the beginning "+ts.size());
 
        // Elements are added using add() method
        ts.add("India");
        ts.add("USA");
        ts.add("Britain");
    
        //displaying the TreeSet
        System.out.println(ts);

        //displaying the size
        System.out.println("Size after addition "+ts.size());
    
        // Duplicates will not get inserted into the TreeSet
        ts.add("Britain");
 
        // Elements get stored in Ascending order
        System.out.println(ts);
    }
    
}
