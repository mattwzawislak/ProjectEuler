package java0.page1;

import java0.euler.project.Project;

/**
 * @author Obicere
 */
public class Euler027 extends Project {

    public int number() {
        return 27;
    }

    public String call() {
        int best = 0;
        int score = 0;
        for (int i = -999; i < 1000; i++) {
            for (int j = 2; j < 1000; j++) {
                final int max = Math.abs(i);
                int count = 0;
                for (int n = 0; n <= max; n++) {
                    int next = n * n + n * i + j;
                    if (isPrime(next)) {
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
        return String.valueOf(best);
    }
}