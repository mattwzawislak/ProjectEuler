package java0.page1;

import java0.euler.project.Project;

/**
 * @author Obicere
 */
public class Euler034 extends Project {

    public int number() {
        return 34;
    }

    public String call() {
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
        return String.valueOf(totalSum);
    }
}