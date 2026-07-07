package Operations;


class LogicalOperation {
    public static void main(String[] args) {
        
        boolean isSunny = true;
        boolean isWarm = true;
        boolean isCold = true;
        boolean isRaining = true;
        boolean isDark = false;

        boolean goOnPicnic = isSunny && isWarm;
        System.out.println("Is it good weather? to go to Picinic"+goOnPicnic);

        boolean notGoOnPicnic = isCold || isRaining;
        System.out.println("Is it not sutiable to go on Picinic?"+notGoOnPicnic);

        boolean toggle = !isDark;
        System.out.println("Is Dark?"+toggle);
        System.out.println("Turn On Dark mode");
        
    }
}
