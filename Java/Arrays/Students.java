
package Arrays;

import java.util.Arrays;

public class Students {
    public static void main(String[] args) {

        // Static declaration
        String[] studentNames = { "Ram", "Sham" };
        System.out.println(studentNames[0]);

        // Dynamic declaration
        String[] studentNames2 = new String[5]; // 5 students information

        // assigning values to the array
        studentNames2[0] = "Hari";
        studentNames2[1] = "Rahul";
        studentNames2[2] = "Harry";
        studentNames2[3] = "Shashi";
        studentNames2[4] = "Lahari";

        // studentNames2 = ["Hari","Rahul","Harry","Shashi","Lahari"]
        // 0 1 2 3 4

        // What is the data type of the array => string

        // what is the first and last index => 0 and 4

        // accessing array elements indivisually
        String name2 = studentNames2[2];

        System.out.println("Name of the student 2:" + name2);

        // accessing all the elements
        for (int i = 0; i < studentNames2.length; i++) {
            System.out.print(studentNames2[i]);
        }

        // alternative way using for-each
        for (String name : studentNames2) {
            System.out.println(name);
        }

        // name = "Hari"
        // name = "Rahul"

        // Basic operations on arrays
        int[] ages = new int[5];

        // Inserting elements into array

        ages[0] = 25;
        ages[1] = 30;
        ages[2] = 45;
        ages[3] = 50;
        ages[4] = 60;

        // ages = [25,30,45,50,60]

        int element = 27;
        int pos = 2; // index

        int[] newArr = new int[ages.length + 1]; // 6

        for (int i = 0; i < newArr.length; i++) {

            if (i < pos) {
                newArr[i] = ages[i];// elements before pos copy element from source array
            } else if (i == pos) {
                newArr[i] = element; // pos == index
            } else {
                newArr[i] = ages[i - 1]; // shifting array
            }

        }

        // print the array elemnts
        for (int age : newArr) {
            System.out.println(age);

        }

        // using toString() - converts array into string
        System.out.println(Arrays.toString(newArr));

        // Insert last position

        newArr[ages.length] = element;

        // ages = 0 to ages.length-1
    }
}
