package DSA.Strings;

public class Reverse {
    public static void main(String[] args) {
        String str = "upGrad";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Original String:"+str);
        System.out.println("Reverssedd String:"+reversed);
    }
}
