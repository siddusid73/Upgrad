package DSA.Recurrsion;

public class PrintCharacters {
    static void printChars(String str,int index){
        if(index == str.length()){
            return;
        }

        System.out.println(str.charAt(index));

        //recursive call
        printChars(str,index+1);
    }
    public static void main(String[] args) {
        String str = "hello";
        printChars(str, 0);
    }
}
