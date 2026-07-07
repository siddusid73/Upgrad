package DSA.Hashing;

import java.util.*;
//Create a HashSet in Java. Insert 10 names in the HashSet and iterate over it

public class Hashsetexample {
    public static void main(String[] args) {
        LinkedHashSet<String> name = new LinkedHashSet<>();

        name.add("Arjun");
        name.add("Siddu");
        name.add("Peddi");
        name.add("Rangasthalam");
        name.add("MagaDheera");
        name.add("RRR");
        name.add("Jersey");
        name.add("Haikyu");
        name.add("Eren Yeager");
        name.add("Solo Leveling");

        Iterator<String> iterator = name.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
