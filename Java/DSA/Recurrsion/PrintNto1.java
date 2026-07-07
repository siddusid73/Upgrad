package DSA.Recurrsion;

public class PrintNto1 {
    static void printNums(int current, int n) {

        // base condition
        if (current < n)
            return;

        System.out.println(current);
        printNums(current - 1, n);// recursive call
    }

    public static void main(String[] args) {
        printNums(10, 1);
    }
}

// Method2
class printMto1 {
    static void print(int m) {
        if (m == 0)
            return;
        System.out.println(m);
        print(m - 1);
    }

    public static void main(String[] args) {
        int m = 10;
        print(m);
    }
}