package DSA.Strings;

public class Example3 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Python ");

        sb.append("Programming");
        System.out.println(sb);

        sb.insert(2,"Java");
        sb.delete(2, 4);
        sb.reverse();
        System.out.println(sb);

        StringBuilder sbb = new StringBuilder("Java ");
        sbb.append("Programming");
        System.out.println(sbb);

        sbb.insert(1,"script");
        sbb.delete(2, 3);
        sbb.reverse();
        sbb.replace(0, 3, "C++");
        System.out.println(sbb);
    }
}
