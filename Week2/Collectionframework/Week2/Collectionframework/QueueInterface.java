package Week2.Collectionframework;

import java.util.LinkedList;
import java.util.Queue;

//The Queue is a linear Collection that offers data manipulation operations on the collection elements, and follows the FIFO(First In First Out) principle

public class QueueInterface {
    public static void main(String[] args) {
        Queue<String> queue =new LinkedList<>();
        queue.add("Apple");
        queue.add("Mango");
        queue.add("Grapes");
        queue.add("Banana");
        System.out.println(queue);

        queue.remove("Grapes");
        
        System.out.println(queue);
        
        System.out.println("Queue total Size: " + queue.size());
        
        System.out.println("Queue includes fruit 'Apple'? : " + queue.contains("Apple"));
        
        queue.clear();

    }
    
}
