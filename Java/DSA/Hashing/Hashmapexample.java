package DSA.Hashing;

import java.util.*;

//Create a HashMap in Java to store Employee Name (String) and Salary(Integer). Insert 10 records in the HashMap and then iterate over it.

public class Hashmapexample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Arjun", 60000);
        map.put("Siddu", 98000);
        map.put("Peddi", 65000);
        map.put("Rangasthalam", 78000);
        map.put("MagaDheera", 75000);
        map.put("RRR", 73000);
        map.put("Jersey", 80000);
        map.put("Haikyu", 90000);
        map.put("Eren Yeager", 87000);
        map.put("Solo Leveling", 78000);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
