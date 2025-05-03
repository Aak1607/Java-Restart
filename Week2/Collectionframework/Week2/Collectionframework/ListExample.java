package Week2.Collectionframework;

import java.util.ArrayList;
import java.util.List;

//manipulation operations such as insert, update, delete, and many more

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("banana");
        list.add("Orange");

        for(String itemString: list){
            System.out.println(itemString);

        }
    }
    
}
