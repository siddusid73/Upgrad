package DSA.Arrays;

import java.util.*;

public class NestedArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        graph.get(0).add(2);

        graph.get(1).add(2);
        graph.get(2).add(4);

        for (int i = 0; i < graph.size(); i++) {
            System.out.println(i + " - " + graph.get(i));
        }
    }
}
