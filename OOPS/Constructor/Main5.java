package OOPS.Constructor;

public class Main5 {
    String language;
    int version;

    Main5(){
        language  = "Java";
    }
    Main5(String lang){
        this.language = lang;
    }
    Main5(String lang1,int version){
        this.language = lang1;
        this.version = version;
    }

    public static void main(String[] args) {
        Main5 obj1 = new Main5();
        System.out.println(obj1.language);
        Main5 obj2 = new Main5("Python");
        System.out.println(obj2.language);
        Main5 obj3 = new Main5("React",18);
        System.out.println(obj3.version);
    }
}
