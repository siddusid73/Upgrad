package OOPS;

public class Method2 {
    public int find_greater(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        Method2 obj = new Method2();
        int greater = obj.find_greater(245, 2333);

        System.out.println("Greatest Number:" + greater);
    }
}
