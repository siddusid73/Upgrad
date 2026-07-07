package DSA.Strings;

public class WordsCount {
    public static void main(String[] args) {
        String sentense = "Learning Java FullStack in upGrad";
        String[] words = sentense.split(" ");
        int count = words.length;

        System.out.println("Original Sentence:" + sentense);
        System.out.println("Count:" + count);
    }
}

// by using for loop

class WordCount {
    public static void main(String[] args) {
        String sentense = "Java is a Language";
        int count = 1;

        for (int i = 0; i < sentense.length(); i++) {
            if (sentense.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Original Sentense:" + sentense);
        System.out.println("number of Words:" + count);
    }
}
