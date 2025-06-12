public class LeapYear {
    public static void main(String[] args) {
    checkLeapYear(2026);
    }
    public static void checkLeapYear(int year) {
        boolean isLeap;
        if (year%4 == 0) {
            isLeap = true;
        } else if (year%100 == 0) {
          isLeap = true;
        } else {
            isLeap = year % 400 == 0;
        }
        if (isLeap) {
            System.out.println("It's a leap year!");
        } else {
            System.out.println("It's not a leap year");
        }
    }
}
