package day11_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
     String name;
      int Id;
     
    public Demo(String name, int Id) {
        this.name=name;
        this.Id=Id;
    }
    public static void main(String[] args) {

      Demo s1 = new Demo("Ajay",1010);
      Demo s2 = new Demo("Omi",1011);
      Demo s3 = new Demo("Adi",1012); 

     ArrayList <Demo> array = new ArrayList <Demo> ();

     array.add(s1);
     array.add(s2);
     array.add(s3);

    //   for (Demo arr: array) {
    //     System.out.println(arr.name+"  "+arr.Id);
    //    }

    //     array.remove(s1);

    // System.out.println(array.size()); // Array size


        // Iterator it = array.iterator();
        // while(it.hasNext()){   
        //     Demo obj = (Demo) it.next();                 
        //     System.out.println(obj.name);
        //     System.out.println(obj.Id);

        // }
        array.get(1);
    
    }
           
}

