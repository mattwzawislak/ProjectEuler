package page1;

/**
 * @author Obicere
 */
public class Euler019 {

    private static final int[] MONTH_AMOUNTS = new int[]{3, 0, 3, 2, 3, 2, 3, 3, 2, 3, 2, 3};

    public static void main(final String[] args) {
        int start = 2; // 2 = Tuesday
        int count = 0;
        for (int y = 1901; y <= 2000; y++) {
            for (int m = 0; m < MONTH_AMOUNTS.length; m++) {
                if (m == 1 && isLeapYear(y)) {
                    start++;
                }
                start += MONTH_AMOUNTS[m];
                start %= 7;
                if (start == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }

    public static boolean isLeapYear(final int year) {
        return year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
    }

}
