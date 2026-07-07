package DSA.LinkedList;

import java.util.LinkedList;

public class Doubly {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // Insert elements
        list.add(100); // general list / returns true
        list.add(200);
        list.add(300);

        // position
        list.add(2, 500);

        list.addFirst(600);
        list.addLast(700); // deque - returns nothing

        // removing elements
        list.remove();
        list.remove(2);
        list.removeFirst();
        list.removeLast();

        // access elements
        int val = list.get(1);

        System.out.println("Value at position 1: " + val);

        // update the element
        list.set(1, 1000);

        System.out.println("updated list: " + list);

        // Traversal
        for (int num : list) {
            System.out.println("Element inside the Linked List:" + num);
        }

    }
}
