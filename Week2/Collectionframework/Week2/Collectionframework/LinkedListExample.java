package Week2.Collectionframework;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list= new LinkedList<String>();

        //add elements 
        list.add("Java");
        list.add("C++");
        list.add("JavaScript");
        list.addFirst("C#");
        list.addLast("Kotlin");

        //displaying the LinkedList
    System.out.println("Original Linked List " + list);
    
    //displaying the size
    System.out.println("Size after addition "+list.size());
    
    //remove element at index 5 
    list.remove(3);
    
    
    //display the new LinkedList
    System.out.println("New Linked List "+ list);
    
    //display the new size
    System.out.println("Size after removal "+list.size());
    }
    
}
