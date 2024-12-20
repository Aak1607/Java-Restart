package Week2.Collectionframework;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
    //creating a Vector
    Vector<Integer> v= new Vector<Integer>();
    
    //displaying the size
    System.out.println("Size at the beginning "+v.size());
    
    //add elements
    v.add(19);
    v.add(88);
    v.add(1);
    v.add(39);

    //displaying the Vector
    System.out.println(v);
    
    //displaying the size
    System.out.println("Size after addition "+v.size());
    
    //remove element at index 3 
    v.remove(3);
    
    //display the new Vector
    System.out.println(v);
    
    //display the new size
    System.out.println("Size after removal "+v.size());
    }
    
}
