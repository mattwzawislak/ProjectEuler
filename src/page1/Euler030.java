package page1;

import euler.Project;

/**
 * page1 * Created: 1/22/14 12:38 PM * * @author Obicere * @version 1.0
 */
public class Euler030 extends Project {

    public int number() {
        return 30;
    }

    public void run() {
        int totalSum = 0;
        for (int i = 2; i < 410000; i++) {
            // through plotting we can determine max
            final int[] digits = getDigits(i);
            int sum = 0;
            for (final int digit : digits) {
                sum += toPowerOfFive(digit);
                if (sum > i) { // No way to continue
                    break;
                }
            }
            if (sum == i) {
                totalSum += i;
            }
        }
        System.out.println(totalSum);
    }

    public static int toPowerOfFive(final int num) {
        // Should be faster than calculating Math.pow(double, double).
        // Since we can presume using integer multiplication that this
        // will always be an integer throughout operation.
        return num * num * num * num * num;
    }
}