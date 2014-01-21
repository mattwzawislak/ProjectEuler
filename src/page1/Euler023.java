package page1;

import euler.Common;

/**
 * page1
 * Created: 1/21/14 12:36 PM
 *
 * @author Obicere
 * @version 1.0
 */
public class Euler023 {

    private static final int LIMIT = 28123;
    private static final boolean[] ABUNDANT = new boolean[LIMIT + 1];

    public static void main(final String[] args) {
        for (int i = 1; i < LIMIT + 1; i++) {
            ABUNDANT[i] = Common.isAbundant(i);
        }

        int sum = 0;
        // Any even number > 46 can be written
        // as a sum of abundant. Just skip
        for (int i = 1; i <= LIMIT; i += (i >= 47 ? 2 : 1)) {
            if (!isSumOfAbundant(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    private static boolean isSumOfAbundant(int n) {
        for (int i = 0; i <= n; i++) {
            if (ABUNDANT[i] && ABUNDANT[n - i]) {
                return true;
            }
        }
        return false;
    }

}
