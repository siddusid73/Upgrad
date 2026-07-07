package DSA.Hashing;

import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();
        // Methods

        // insert
        map1.put(1, "Arjun");
        map1.put(2, "Siddu");
        map1.put(3, "Sid");

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.putAll(map1);

        // return keys and both keys and values
        System.out.println(map1.keySet());
        System.out.println(map2.entrySet());

        // check element is present
        System.out.println(map1.containsKey(1));
        System.out.println(map1.containsValue("Sid"));

        // isEmpty()
        System.out.println(map1.isEmpty());

        HashMap<Integer, String> cloned = new HashMap<>(map1);
        System.out.println(cloned);

        // remove
        System.out.println(map1.remove(2));
        System.out.println(map1.remove(3, "Sid"));

        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
