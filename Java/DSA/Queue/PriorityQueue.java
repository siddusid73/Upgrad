package DSA.Queue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.*;

class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        // using add()
        numbers.add(200);
        numbers.add(100);
        System.out.println("Priority Queue: " + numbers);

        // using offer()
        numbers.offer(1);
        System.out.println("after updating" + numbers);

        // using peek()
        int num = numbers.peek();
        System.out.println("element at head: " + num);

        // using remove()
        boolean result = numbers.remove(100);
        System.out.println("Is 100 removed? " + result);

        // using poll()
        int removedNum = numbers.poll();
        System.out.println("Removed Element is: " + removedNum);

        // iterator()
        Iterator<Integer> iterate = numbers.iterator();
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(",");
        }

        PriorityQueue<Integer> nums = new PriorityQueue<>(new CustomComparator());
        nums.add(4);
        nums.add(5);
        nums.add(2);
        nums.add(3);
        nums.add(1);

        System.out.println("Priority Queue: " + nums);
    }
}

class CustomComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer num1, Integer num2) {
        int value = num1.compareTo(num2);

        // Elements to sorted in reverse order
        if (value > 0) {
            return -1;
        } else if (value < 0) {
            return 1;
        } else {
            return 0;
        }
    }
}