package java0.page1;

import java0.euler.project.Project;

/**
 * @author Obicere
 */
public class Euler039 extends Project {

    public int number() {
        return 39;
    }

    public String call() {
        int best = 0;
        int score = 0;
        for (int p = 2; p <= 1000; p++) {
            int possible = 0;
            for (int a = 2; a < p / 3; a++) {
                if (p * (p - 2 * a) % (2 * (p - a)) == 0) {
                    possible++;
                }
            }
            if (possible > score) {
                score = possible;
                best = p;
            }
        }
        return String.valueOf(best);
    }
}