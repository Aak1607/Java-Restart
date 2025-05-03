package Week2.Collectionframework;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"One");
        map.put(2, "two");
        map.put(3, "three");

        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


    }
    
}
