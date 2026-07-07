package DSA.Strings;

public class Example2 {
    public static void main(String[] args) {
        // lenght of the string
        String str1 = "upGrad";
        int len = str1.length();

        System.out.println("Length of the string:" + len);

        // concat two strings
        String s1 = "Java";
        String s2 = "24";

        String s3 = s1.concat(s2);
        System.out.println(s1);
        System.out.println("Concatenated String:" + s3);

        // contains()
        String s4 = "Java Programming";
        boolean result = s4.contains("java");
        System.out.println("Is String Present?" + result);

        // Substring()
        String s5 = "This is DSA Session";
        System.out.println("Substring of the above String is:" + s5.substring(0, 15));

        // join()
        String strr1 = "Java ";
        String strr2 = "Programming ";
        String strr3 = "Version 24";

        String joinedStr = String.join("", strr1, strr2, strr3);
        System.out.println("Joined String:" + joinedStr);

        // replace()

        String s6 = "bat ball";
        System.out.println("Replace:" + s6.replace('b', 'c'));

        // charAt()
        System.out.println("Character at index 2:" + s6.charAt(2));

        // indexOf()
        System.out.println("Index of the character l" + s6.indexOf('l'));

        System.out.println(s6.toLowerCase());

        System.out.println(s6.toUpperCase());

        //split() - converts string to array
        String text = "I am learning String methods";
        String[] textArr = text.split(" ");

        for(String str: textArr){
            System.out.println("str: "+str);
        }

        //startswith and endswith
        String text2 = "Javascript";
        System.out.println(text2.startsWith("Java"));
        System.out.println(text2.endsWith("script"));

        //isEmpty()
        System.out.println(text2.isEmpty());
        
        //hascode
        System.out.println(text2.hashCode());

        //trim()
        String text3 = "   Learning Java   ";
        System.out.println(text3.trim());

    }
}
