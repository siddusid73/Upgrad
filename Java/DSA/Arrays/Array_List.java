package DSA.Arrays;

import java.util.*;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(43);
        marks.add(23);
        marks.add(75);
        marks.add(64);
        marks.add(86);

        System.out.println(marks);
        marks.add(3, 98);
        System.out.println(marks);

        // access
        System.out.println(marks.get(3));

        // Replace
        marks.set(5, 71);
        System.out.println(marks);

        // Remove
        marks.remove(3);
        System.out.println("" + marks);

        marks.remove(Integer.valueOf(23));
        marks.remove((Integer) 23);
        System.out.println(marks);

        System.out.println(marks.isEmpty());
        System.out.println(marks.size());
        System.out.println(marks.contains(65));

        ArrayList<Integer> marks2 = new ArrayList<>(marks);

        //copy
        ArrayList<Integer> copyMarks = new ArrayList<>();

        copyMarks.addAll(marks);
        System.out.println(marks.equals(marks2));

        //sort
        Collections.sort(marks);

        //reverse
        Collections.reverse(marks);

        //convert
        Integer[] arr = marks.toArray(new Integer[0]);
    }
}
