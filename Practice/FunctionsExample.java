public class FunctionsExample {
    public static void function(int n,String s){
        for(int i = 0;i<n;i++){
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        function(1, "Siddu");
        function(2,"Spider-Man");
        function(3, "Amazing-Spiderman");
    }
}
