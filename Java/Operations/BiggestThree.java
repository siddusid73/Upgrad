package Operations;

class BiggestThree {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 20;

        boolean aBiggest = (a>b) && (a>c);
        boolean bBiggest = (a<b) && (b>c);
        boolean cBiggest = (a<c) && (b<c);

        System.out.println("Is a Biggest " + aBiggest);
        System.out.println("Is b Biggest " + bBiggest);
        System.out.println("Is c Biggest " + cBiggest);
    }
}
