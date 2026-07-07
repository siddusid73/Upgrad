package Operations;

class AssignmentOperator {
    public static void main(String[] args) {
        double savings = 0.0;
        double monthlyIncome = 100.0;
        double savedAmount = 600.0;
        savings = savedAmount;
        savings = monthlyIncome;

        double giftMoney = 200;
        savings += giftMoney;
        savings += monthlyIncome;
        System.out.println("Total Saving:$ "+savings);
    }
}

