package page1;

import euler.Project;

/**
 * @author Obicere
 */
public class Euler033 extends Project {

    public int number() {
        return 33;
    }

    public void run() {
        int num = 1;
        int denom = 1;
        for (int i = 10; i < 100; i++) {
            for (int j = i + 1; j < 100; j++) {
                if (i % 10 == 0 || j % 10 == 0) {
                    continue;
                }
                final int[] digitsNumerator = getDigits(i);
                final int[] digitsDenominator = getDigits(j);
                for (int x = 0; x < digitsNumerator.length; x++) {
                    for (int y = 0; y < digitsDenominator.length; y++) {
                        if (digitsNumerator[x] == digitsDenominator[y]) {
                            final double expected = i / (double) j;
                            final int otherX = x == 0 ? 1 : 0;
                            final int otherY = y == 0 ? 1 : 0;
                            final double curios = digitsNumerator[otherX] / (double) digitsDenominator[otherY];
                            if (curios == expected) {
                                num *= i;
                                denom *= j;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(reduce(num, denom)[1]);
    }
}