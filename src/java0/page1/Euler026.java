package java0.page1;

import java0.euler.project.Project;

/**
 * @author Obicere
 */
public class Euler026 extends Project {

    public int number() {
        return 26;
    }

    public String call() {
        int score = 0;
        for (int i = 1000; i > 1; i--) {
            if (i <= score) {
                // Not possible to break score at this value
                break;
            }
            final int[] remainders = new int[i];
            int value = 1;
            int j;
            for (j = 0; remainders[value] == 0 && value != 0; j++) {
                remainders[value] = j;
                value *= 10;
                value %= i;
            }
            final int newScore = j + 1 - remainders[value];
            if (score < newScore) {
                score = newScore;
            }
        }
        return String.valueOf(score);
    }
}