package page1;

import euler.Project;

/**
 * @author Obicere
 */
public class Euler038 extends Project {

    public int number() {
        return 38;
    }

    public void run() {
        int highest = 0;
        for (int i = 1; i < 100000; i++) {
            int[] digits = getDigits(i);
            int n = 2;
            while (digits.length < 9) {
                final int next = i * n;
                digits = combine(digits, getDigits(next));
                n++;
            }
            if (digits.length == 9) {
                if (isPandigital(digits, 9)) {
                    highest = Math.max(numberFromDigits(digits), highest);
                }
            }
        }
        System.out.println(highest);
    }
}