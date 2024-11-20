package Week2.Collectionframework;

import java.util.*;

//Sorted set interface maintains mapping in ascending order. They are used for naturally ordered collection. 

public class SortedSetInterface {

   public static void main(String[] args) {

      SortedSet set = new TreeSet(); 

      set.add("Bob");

      set.add("Sean");

      set.add("Jennifer");

      Iterator i = set.iterator();

      while (i.hasNext()) {

      Object element = i.next();

      System.out.println(element.toString());

      }

   }

}