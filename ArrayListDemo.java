package day11_Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
       ArrayList<Integer> list = new  ArrayList<Integer> (); // Use of wrapper classes instead of primitive data type like <Integer>,<Float>etc.
     
    //  list.add(0,2); // To add elements in an array
    //  list.add(1, 4);

     list.add(3);   // To insert
     list.add(4);   // To insert
     list.add(5);   // To insert
    // System.out.println(list.get(0)); // To access array elements using index

    // list.set(0, 6);  // To set array elements at specific index
    // System.out.println(list.get(0));
    //  System.out.println(list); // To print array list

    // list.remove(1);  // To remove elements from at specific index

    // for each loop to iterating list
    // for (Integer a : list) {
    //     System.out.println(a);
    // }

    //   Traverse array - Using Iterator object
    
      Iterator it = list.iterator();
      while (it.hasNext()) {  // hasNext() checks the last elements
        System.out.println(it.next());        
      }
     
    // System.out.println(list.size()); // To find the array size

    // System.out.println(list.isEmpty()); // To check the array is empty or not





    }
}
