package page1;

import euler.Project;

/**
 * page1 * Created: 1/21/14 12:36 PM * * @author Obicere * @version 1.0
 */
public class Euler023 extends Project {

    public int number() {
        return 23;
    }

    private static final int       LIMIT    = 28123;
    private static final boolean[] ABUNDANT = new boolean[LIMIT + 1];

    public void run() {
        for (int i = 1; i < LIMIT + 1; i++) {
            ABUNDANT[i] = isAbundant(i);
        }
        int sum = 0;
        // Any even number > 46 can be written
        // as a sum of abundant.
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