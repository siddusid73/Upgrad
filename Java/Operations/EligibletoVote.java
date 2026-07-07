package Operations;

class EligibletoVote {
    public static void main(String[] args) {
        int age_a = 20;
        int age_b = 15;

        boolean isEligible = age_a >= 18;
        boolean notEligible = age_b >= 18;
        System.out.println("yes,Eligible to Vote "+isEligible);
        System.out.println("yes,Eligible to Vote "+notEligible);
    }
}
