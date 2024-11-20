package Week2.Collectionframework;

import java.util.HashSet;
import java.util.Set;

//A Set interface cannot store duplicate/redundant elements in it.

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Dog");
        set.add("cat");
        set.add("Horse");

        for(String item : set){
            System.out.println(item);
        }

    }
    
}
