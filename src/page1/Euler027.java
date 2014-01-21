package page1;

import euler.Common;

/**
 * page1
 * Created: 1/21/14 2:50 PM
 *
 * @author Obicere
 * @version 1.0
 */
public class Euler027 {

    public static void main(final String[] args) {
        int best = 0;
        int score = 0;
        for (int i = -999; i < 1000; i++) {
            for (int j = 2; j < 1000; j++) {
                final int max = Math.abs(i);
                int count = 0;
                for (int n = 0; n <= max; n++) {
                    int next = n * n + n * i + j;
                    if (Common.isPrime(next)) {
                        count++;
                    } else {
                        break;
                    }
                }
                if (count > score) {
                    score = count;
                    best = i * j;
                }
            }
        }
        System.out.println(best);
    }

}
