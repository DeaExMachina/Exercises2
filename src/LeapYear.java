public class LeapYear {
    public static void main(String[] args) {
        for (int year = 1; year <= 2100; year++){
            System.out.println(isLeapYear(year));
        }
    }

    public static boolean isLeapYear(int year){
        boolean isLeap;

        if (year %4 == 0) {
            System.out.println("The year " + year + " is a leap year!");
            isLeap = true;
        }
        else if (year %400 == 0) {
            System.out.println("The year " + year + " is a leap year!");
            isLeap = true;
        }
        else if (year %100 == 0) {
            System.out.println("The year " + year + " is not a leap year.");
            isLeap = false;
        }
        else {
            System.out.println("The year " + year + " is not a leap year.");
            isLeap = false;
        }

        return isLeap;

    }
}


