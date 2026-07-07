package Operations;

class RelationalOperation {
    public static void main(String[] args) {

        double John_Grade = 8.9;
        double Sarah_Grade = 9.9;

        boolean result = John_Grade < Sarah_Grade;
        System.out.println("John has lower Grade " + result);

        boolean isEqual =  John_Grade == Sarah_Grade;
        System.out.println("Both having Equal Grades? " + isEqual);
    }
}
