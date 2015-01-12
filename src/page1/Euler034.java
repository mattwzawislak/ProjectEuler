package page1;

import euler.Project;

/**
 * @author Obicere
 */
public class Euler034 extends Project {

    public int number() {
        return 34;
    }

    public void run() {
        int totalSum = 0;
        for (int i = 3; i < 100000; i++) { // By plotting you can see the divergence
            int sum = 0;
            final int[] digits = getDigits(i);
            for (final int digit : digits) {
                sum += factorial(digit);
            }
            if (sum == i) {
                totalSum += i;
            }
        }
        System.out.println(totalSum);
    }
}