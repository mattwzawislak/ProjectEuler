package java0.page1;

import java0.euler.project.Project;

/**
 * @author Obicere
 */
public class Euler023 extends Project {

    public int number() {
        return 23;
    }

    private static final int       LIMIT    = 28123;
    private static final boolean[] ABUNDANT = new boolean[LIMIT + 1];

    public String call() {
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
        return String.valueOf(sum);
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