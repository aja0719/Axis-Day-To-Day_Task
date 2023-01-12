package day11_Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer,String>();

        map.put(0, "Ajay");
        map.put(1, "Omi");
        map.put(2, "Adi");

        // map.clear();
        
        // map.replace(2, "Gani");

        map.remove(1);


        for(Entry<Integer, String> m:map.entrySet())
{
    System.out.println(m.getKey()+"  :  "+m.getValue());
}        
        
    }
}
