public class LeapYear {
    public static void main(String[] args) {
        checkLeapYear(2025);
    }

    /** Checks if year is a leap year
     * Applies Gregorian calendar rules for years >= 1582
     * Applies Julian calendar rules for years < 1582
     * **/
    public static void checkLeapYear(int year) {
        boolean isLeap;
        String calendar = "";
        if (year >= 1582) {
            calendar = "Gregorian";
            if (year % 4 == 0 && year % 100 != 0) {
                isLeap = true;
            } else if (year % 4 == 0 && year % 400 == 0) {
                isLeap = true;
            } else {
                isLeap = false;
            }
        } else {
            calendar = "Julian";
            if (year % 4 == 0) {
                isLeap = true;
            } else {
                isLeap = false;
            }
        }
        if (isLeap) {
            System.out.printf("%s is a leap year in %s calendar!", year, calendar);
        } else {
            System.out.printf("%s is not a leap year", year);
        }
    }
}

