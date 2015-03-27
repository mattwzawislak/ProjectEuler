package java0.page1;

import java0.euler.project.Project;

/**
 * @author Obicere
 */
public class Euler035 extends Project {

    public int number() {
        return 35;
    }

    public String call() {
        int count = 0;
        top:
        for (int i = 2; i < 1000000; i++) {
            final int[] digits = getDigits(i);
            for (int j = 0; j < digits.length; j++) {
                if (!isPrime(numberFromDigits(digits))) {
                    continue top;
                }
                rotate(digits);
            }
            count++;
        }
        return String.valueOf(count);
    }

    public static void rotate(final int[] digits) {
        int top = digits[0];
        System.arraycopy(digits, 1, digits, 0, digits.length - 1);
        digits[digits.length - 1] = top;
    }
}