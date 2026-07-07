package DSA.Hashing;

import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        // create hashset
        HashSet<Integer> nums = new HashSet<>();

        // add elements
        nums.add(10);
        nums.add(20);
        nums.add(30);

        System.out.println(nums);

        // trying to add duplicate value
        nums.add(10);
        System.out.println(nums);

        // clear() -clearing all elements
        // nums.clear();

        // cloning
        HashSet<Integer> cloned = new HashSet<>(nums);
        System.out.println(cloned);

        // checking if contain element
        System.out.println(nums.contains(10));
        System.out.println(nums.contains(40));

        // check if set is empty
        System.out.println(nums.isEmpty());

        // Note:
        // Hashset - No order
        // LinkedHashset - In the same order of insertion
        // TreeSet - Sorted order

        // remove()
        System.out.println(nums.remove(10));

        // Check size
        System.out.println("Size of the Set:" + nums.size());

        // Iterator
        Iterator<Integer> iterator = nums.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
