package DSA.Hashing;

import java.util.*;

public class CreateHashtable {
    public static void main(String[] args){
        Hashtable<Integer,String>ht = new Hashtable<>();
        Hashtable<String,Integer>ht1=new Hashtable<>(64,9f);

        Hashtable<Integer,String>ht2=new Hashtable<>();

        ht.put(1,"Siddu");
        ht.put(2,"Sid");
        ht.put(3,"Arjun");

        ht2.putAll(ht);

        ht1.put("k1",20);
        
        //Getting all the key
        System.out.println(ht.keySet());

        //Getting key value pairs;
        System.out.println(ht.entrySet());

        //Get a particular value using key
        System.out.println(ht.containsKey(3));
        System.out.println(ht.containsValue("Arjun"));

        //Check if the table is empty
        System.out.println(ht.isEmpty());

        // //Clone a map
        // Hashtable<Integer,String> clonedMap = (Hashtable <Integer,String>)ht.clone();

        // System.out.println(clonedMap);
        
    }
}
