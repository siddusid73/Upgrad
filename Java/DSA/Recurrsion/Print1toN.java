package DSA.Recurrsion;

//Method 1
public class Print1toN {
    static void printNums(int current, int n) {

        // base condition
        if (current > n) {
            return;
        }
        System.out.println(current);

        // Recursive call
        printNums(current + 1, n);
    }

    public static void main(String[] args) {
        int n = 10;
        printNums(1, n);
    }
}

// Method 2
class Print1toM {
    static void print(int m) {

        if (m == 0) {
            return;
        }
        print(m - 1);

        System.out.println(m);
    }

    public static void main(String[] args) {
        int m = 10;
        print(m);
    }
}